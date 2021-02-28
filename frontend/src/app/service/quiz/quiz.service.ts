import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class QuizService {

  constructor(private http : HttpClient) { }

  public startQuiz() : Subject<any> {
    const subject = new Subject<any>();

    this.http.get(environment.apiUrl+'quiz').subscribe(
      (data) => { subject.next(data); },
      (error) => { console.log(error); }
    );

    return subject;
  }
}
