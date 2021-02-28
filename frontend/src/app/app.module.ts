import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule } from '@angular/material/toolbar';
import { DashboardComponent } from './dashboard/dashboard.component';
import { DialogComponent, QuizComponent } from './quiz/quiz.component';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';
import { MatRadioModule } from '@angular/material/radio';
import { MatCardModule } from '@angular/material/card';
import { HttpClientModule } from '@angular/common/http';
import { MatStepperModule } from '@angular/material/stepper';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { FormsModule } from '@angular/forms'  ;
import { ReactiveFormsModule} from '@angular/forms' ;
import { OverlayModule } from '@angular/cdk/overlay';
import { QuizService } from './service/quiz/quiz.service';
import { MatDialogModule } from '@angular/material/dialog';
import { MatTooltipModule } from '@angular/material/tooltip';


@NgModule({
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MatToolbarModule,
    MatIconModule,
    MatButtonModule,
    MatRadioModule,
    MatCardModule,
    MatStepperModule,
    MatCheckboxModule,
    ReactiveFormsModule,
    FormsModule,
    OverlayModule,
    MatDialogModule,
    MatTooltipModule
  ],
  providers: [
    QuizService
  ],
  declarations: [
    AppComponent,
    DashboardComponent,
    QuizComponent,
    DialogComponent
  ],
  bootstrap: [AppComponent],
  entryComponents : [
    DialogComponent
  ]
})
export class AppModule { }
