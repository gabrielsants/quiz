import { Component, Inject } from '@angular/core';
import { QuizQuestions } from '../entities/quiz-questions';
import { FormBuilder, FormGroup } from '@angular/forms';
import { QuizService } from '../service/quiz/quiz.service';
import { MatDialog, MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';


@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css']
})

export class QuizComponent {

  public startQuiz: boolean = false;

  public inProgress: number = 0;

  public questions: QuizQuestions[] = [];

  public hits: number = 0;

  form: FormGroup;


  constructor(public dialog: MatDialog, private quizService: QuizService, private fb: FormBuilder) {
    this.form = fb.group({
      answer: [''],
    });
  }
  
  public beguinTheGame() {
    this.loadData();
    this.startQuiz = true;
  }

  private loadData() {
    this.quizService.startQuiz().subscribe(
      (data) => { this.questions = data; console.log(data)}
    );
  }

  public getQuestion(questionNumber: number) {
    return this.questions[questionNumber];
  }

  public nextQuestion(currentQuestion: number) {
    console.log(this.inProgress)
    if (this.questions[currentQuestion].answer != this.form.value.answer) {
      this.openDialog("Game Loss!","It hasn't been this time yet, don't be discouraged young padawan",this.hits);
      this.resetAll();
      this.hits = 0;
      //call fail dialog
    } else {
      this.inProgress++;
      this.hits++;
    }
    this.form.reset();
  }

  public resetAll() {
    this.startQuiz = false;
    this.inProgress = 0;
    this.questions = [];
    this.form.reset();
    this.hits = 0;
  }

  openDialog(_title : string, _message : string, _amount : number) : void {
    console.log(_title, _message, _amount)
    this.dialog.open(DialogComponent, {
      data : {title : _title, message : _message, amount : _amount}
    });
  }
}

// ~~~> dialog section

export interface DialogData {
  message: string;
  title: string;
  amount : number;
}

@Component({
  selector: 'dialog-comp',
  templateUrl: './dialog.html',
})
export class DialogComponent {
  
  constructor(
    public dialogRef: MatDialogRef<DialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: DialogData) { }

}
