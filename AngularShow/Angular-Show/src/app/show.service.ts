import { Injectable, OnInit } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Show } from './show';
import { Observable } from 'rxjs';
import { stringify } from 'querystring';

@Injectable({
  providedIn: 'root'
})
export class ShowService {

  
  private shows: Show[]=[];
  //flag:boolean=false;
  constructor(private http: HttpClient) {}
  

  /*********************************************************************
   * Method: loadShows
   * params: 
   * return: Observable
   * Description: this method is hitting json file 
   *              
   * Created Date: 26 April 2020
   * Author: Javvadi Suresh
   ************************************************************************/
  
  loadShows():Observable<any>{
    //let url = "../assets/showlist.json";

    return this.http.get("http://localhost:8080/getshow");
  }

  /*********************************************************************
   * Method: setShows
   * params: show
   * return: void
   * Description:  this method is seting the values of show into the show array
   *              
   * Created Date: 26 April 2020
   * Author: Javvadi Suresh
   ************************************************************************/
  setShows(shows:Show[]):void {
    this.shows=shows;
  }

  /*********************************************************************
   * Method: getShows
   * params: 
   * return: Show[]
   * Description: this methood is returning the show instance after seting
   *              
   * Created Date: 26 April 2020
   * Author: Javvadi Suresh
   ************************************************************************/
  getShow():Show[]{
    return this.shows;
  }

  /*********************************************************************
   * Method: deleteShows 
   * params: showid
   * return: Show[]
   * Description: this method is filtering the value which we  need to delete
   *              
   * Created Date: 26 April 2020
   * Author: Javvadi Suresh
   ************************************************************************/

  
  deleteShows(showId:number):Observable<any>{

     //let endpoint=showid
    const url='http://localhost:8080/delete/'+showId;
    console.log(url);
    return this.http.delete(url,{responseType:"text"});
  }

  /*********************************************************************
   * Method: insertShow
   * params: show
   * return: 
   * Description: this method pushing the data using show instance
   *              
   * Created Date: 26 April 2020
   * Author: Javvadi Suresh
   ************************************************************************/
  insertShows(show:Show):Observable<any>{
    return this.http.post("http://localhost:8080/show",show,{responseType:"text"});
  }

  /*********************************************************************
   * Method: updateShow
   * params: showid
   * return: show[]
   * Description: this method updates the particular data we need
   *              
   * Created Date: 26 April 2020
   * Author: Javvadi Suresh
   ************************************************************************/

  updateShow(show:Show):Observable<any>{
    let end=show.showId;
  //return this.http.put("http://localhost:8080/update/"+end,show);
     const url='http://localhost:8080/update/'+end;
     console.log(url);
     return this.http.put(url,show);
  }

  
 
 
}
