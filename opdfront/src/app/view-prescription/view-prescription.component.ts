import { Component, OnInit} from '@angular/core';
import { Prescription } from '../models/prescription';

import { CommonModule } from '@angular/common';
import { PrescriptionService } from '../services/prescription.service';
import { Appointment } from '../models/appointment';
import { AppointmentService } from '../services/appointment.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-view-prescription',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './view-prescription.component.html',
  styleUrl: './view-prescription.component.css'
})
export class ViewPrescriptionComponent implements OnInit{

  p:Prescription[]=[]
 selap:any
  a:Appointment[]=[]

  ngOnInit(): void{

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
constructor(private ps:PrescriptionService,private as :AppointmentService)
{

}
showpre()
{
  this.ps.getAllP(this.selap).subscribe((data1:Prescription[])=>{
    if(data1!=null)
    {
      this.p=data1
      
    }
  })

}
}
