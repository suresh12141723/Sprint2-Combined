import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddshowComponent } from './addshow/addshow.component';
import { ViewshowComponent } from './viewshow/viewshow.component';


const routes: Routes = [{ path: 'add', component: AddshowComponent },
                        { path: 'view', component: ViewshowComponent }

                        ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
