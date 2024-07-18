import { Component, OnInit } from '@angular/core';
import { Appointment } from '../models/appointment';
import { AppointmentService } from '../services/appointment.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-appointment-status',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './appointment-status.component.html',
  styleUrl: './appointment-status.component.css'
})
export class AppointmentStatusComponent implements OnInit{

  a:Appointment[]=[]

  ngOnInit(): void {
 this.as.getAll().subscribe((data:Appointment[])=>{
  if(data!=null)
  {
    this.a=data
   this.a= this.a.filter((ap:Appointment)=>{
      return ap.pid==localStorage.getItem("pid")
    })

  }
 })
}
constructor(private as:AppointmentService)
{

}


}
