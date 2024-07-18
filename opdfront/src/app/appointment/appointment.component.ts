import { Component } from '@angular/core';
import { Appointment } from '../models/appointment';
import { FormsModule } from '@angular/forms';
import { AppointmentService } from '../services/appointment.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-appointment',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './appointment.component.html',
  styleUrl: './appointment.component.css'
})
export class AppointmentComponent {
submitdata() {
  this.a.status="Not Approved"
  this.a.pid=localStorage.getItem("pid")

  this.as.insert(this.a).subscribe((data:Appointment)=>{
    if(data!=null)
      alert("Appointment booked Successful")
    this.router.navigate(["/"])
    })
    
}
a:Appointment=new Appointment()
constructor(private as :AppointmentService,private router:Router)
{

}

}
