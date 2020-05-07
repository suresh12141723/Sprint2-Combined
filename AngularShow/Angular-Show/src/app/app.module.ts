import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddshowComponent } from './addshow/addshow.component';
import { ViewshowComponent } from './viewshow/viewshow.component';
import {HttpClientModule} from '@angular/common/http';
//import { UpdateshowComponent } from './updateshow/updateshow.component';

@NgModule({
  declarations: [
    AppComponent,
    AddshowComponent,
    ViewshowComponent,
   // UpdateshowComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
