import { Component, OnInit, ViewChild } from '@angular/core';
import { Show } from '../show';
import { ShowService } from '../show.service';
import { Router } from '@angular/router';
import { NgForm } from "@angular/forms";

@Component({
  selector: 'app-addshow',
  templateUrl: './addshow.component.html',
  styleUrls: ['./addshow.component.css']
})

export class AddshowComponent  {
@ViewChild("#frm")
form: NgForm;
 /*********************************************************************
   *  Instance of Show for manupulation
   **********************************************************************/
  show: Show = new Show();

  info:String;
  errorInfo:String;

   /*********************************************************************
   * Method: constructor
   * params:
   * return:
   * Description: constructor injects the ShowService and router module 
   *              
   * Created Date: 26 April 2020
   * Author: Javvadi Suresh
   ************************************************************************/

  
  constructor(private showService: ShowService, private route: Router) { }


  /********************************************************************************
   * Method: addShow
   * params:
   * return:
   * Description: this method call service addshows method and add shows every time
   *              and routes the page to display all show detail after adding
   * Created Date: 26 April 2020
   * Author: Javvadi Suresh
   **********************************************************************************/

  addShow() {
    this.showService.insertShows(this.show).subscribe(
      data=>{
      this.show=data;
      
      console.log(this.show);
      this.info=data;    
      this.errorInfo=undefined;    
      },
      error=>{
        this.info=undefined;
        this.errorInfo=error.error;
      }
      );
      this.route.navigateByUrl("/view");
  }

  }


