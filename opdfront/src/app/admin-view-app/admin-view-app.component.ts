import { Component, OnInit } from '@angular/core';
import { Appointment } from '../models/appointment';
import { AppointmentService } from '../services/appointment.service';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-view-app',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './admin-view-app.component.html',
  styleUrl: './admin-view-app.component.css'
})
export class AdminViewAppComponent implements OnInit{
a:Appointment[]=[]
showapps()
{
  this.as.getAll().subscribe((data:Appointment[])=>{
    if(data!=null)
      this.a=data
  })
}
constructor(private as:AppointmentService,private router:Router)
{

}
ngOnInit(): void {
 this.showapps()
}
change(aid:any)
{
this.as.search(aid).subscribe((data:Appointment)=>{
  if(data!=null)
  {
 //   alert(JSON.stringify(data))
    let ap:Appointment=data
    ap.status="Approve"
    this.as.update(aid,ap).subscribe((data1:Appointment)=>{
      if(data1!=null)
      {
        this.showapps()

      }
    })
  }
})
}
}
