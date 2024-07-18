import { Component, OnInit } from '@angular/core';
import { Appointment } from '../models/appointment';
import { AppointmentService } from '../services/appointment.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Patient } from '../models/patient';
import { PatientService } from '../services/patient.service';
import { Casepaper } from '../models/casepaper';
import { CasepaperService } from '../services/casepaper.service';

@Component({
  selector: 'app-case-paper',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './case-paper.component.html',
  styleUrl: './case-paper.component.css'
})
export class CasePaperComponent implements OnInit {
a:Appointment[]=[]
selap:any
pt:Patient=new Patient()
cp:Casepaper=new Casepaper()
constructor(private as :AppointmentService,private pp:PatientService,private cs:CasepaperService)
{

}
ngOnInit(): void {
  this.showapps()
}
showapps()
{
this.as.getAll().subscribe((data:Appointment[])=>{
  if((data!=null))
    this.a=data
})

}
showdetails()
{
this.as.search(this.selap).subscribe((data:Appointment)=>{
  if(data!=null)
  {
this.pp.search(data.pid).subscribe((datap:Patient)=>{
  if(datap!=null)
  this.pt=datap
})    
  }
})  
}
submitdata()
{
  this.cp.aid=this.selap
  this.cp.pid=this.pt.pid
  this.cp.dt=new Date().toDateString()
this.cs.insert(this.cp).subscribe((data:Casepaper)=>{
  if(data!=null)
    alert("Case added successfully")
})
}
}
