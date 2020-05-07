import { Component, OnInit, ViewChild } from '@angular/core';
import { Show } from '../show';
import { ShowService } from '../show.service';
import { ThrowStmt } from '@angular/compiler';
import { Router } from '@angular/router';
import { NgForm } from "@angular/forms";

@Component({
  selector: 'app-viewshow',
  templateUrl: './viewshow.component.html',
  styleUrls: ['./viewshow.component.css']
})
export class ViewshowComponent implements OnInit {
  @ViewChild("#frm")
  form: NgForm;
  message:any;
  successFlag=false;
  errorFlag=false;
  /**************************************************************************
   * creating show array of Show type to store the show detail 
  /**************************************************************************/
  shows: Show[] = [];

  /*************************************************************************
   * creating show instance for every time manupulate the data
   *************************************************************************/

  show: Show = new Show();
  /*************************************************************************
   * setting the flag false after enter the data it will ture and usable
   ************************************************************************/
  editFlag: boolean = false;
  constructor(private showService: ShowService,private route:Router) { }

   /*********************************************************************
   * Method: ngOnInit is life cycle hook called by angular at first
   * params:
   * return:
   * Description: ngOnInit first check the falg value if it is true then check
   *              and loads all the show in the starting and it is
   *              checking if show array length is zero then load show
   *              and set the show into the current array
   *              
   * Created Date: 26 April 2020
   * Author: Javvadi Suresh
   ************************************************************************/

  ngOnInit() {
        console.log("inside ngOninit viewshow component");
        this.showService.loadShows().subscribe(data => {
          this.shows= data;
          this.showService.setShows(this.shows);
          this.errorFlag=false;
          this.successFlag=true;
        },
        (error) => {
          this.message=error.error;
          this.successFlag=false;
          this.errorFlag=true;
        }
        );
  }

  /*********************************************************************
   * Method: removeShow
   * params: showid
   * return: void
   * Description: this method collecting the value from service deleteShows method
   *              and delete the specific show
   *              
   * Created Date: 26 April 2020
   * Author: Javvadi Suresh
   ************************************************************************/
  
  removeShow(showId: number): void {
    console.log("inside removeshow viewshow component :"+showId);
    this.showService.deleteShows(showId).subscribe((data) => {
      this.ngOnInit();
    });
  }

  /*********************************************************************
   * Method: updateShow
   * params: showId
   * return: 
   * Description: this method is updating the show after delete a row
   *              
   * Created Date: 26 April 2020
   * Author: Javvadi Suresh
   ************************************************************************/

  updateShow(showId: number) {

    let tmpshows: Show[] = this.showService.getShow().filter(show => show.showId == showId);
    console.log(tmpshows);
    if (tmpshows.length > 0) {
      this.show = tmpshows[0];
      this.editFlag = true;
    }

  }

  /*********************************************************************
   * Method: editShow
   * params: 
   * return: void
   * Description: this method is just checking the flag value for enable the
   *              form
   *              
   * Created Date: 26 April 2020
   * Author: Javvadi Suresh
   ************************************************************************/
  editShow(): void {
    this.showService.updateShow(this.show).subscribe(data=>{console.log(data)});
    
    console.log(this.show);
     this.editFlag = false;

  }

}