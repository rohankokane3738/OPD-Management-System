import { Component, OnInit } from '@angular/core';
import { Casepaper } from '../models/casepaper';
import { CasepaperService } from '../services/casepaper.service';
import { CommonModule, JsonPipe } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { PatientService } from '../services/patient.service';
import { Patient } from '../models/patient';
import { Prescription } from '../models/prescription';
import { PrescriptionService } from '../services/prescription.service';

@Component({
  selector: 'app-add-prescription',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './add-prescription.component.html',
  styleUrl: './add-prescription.component.css'
})
export class AddPrescriptionComponent implements OnInit {
cp:Casepaper[]=[]
selc:any
selcase:Casepaper=new Casepaper()
pt:Patient=new Patient()
pc:Prescription=new Prescription();
constructor(private cs:CasepaperService,private ps:PatientService,private psc:PrescriptionService)
{

}
ngOnInit(): void {
  this.showallcp()
}
showallcp()
{
  this.cs.getAll().subscribe((data:Casepaper[])=>{
    if(data!=null)
      this.cp=data
  })
}
showdetails()
{
this.cs.search(this.selc).subscribe((data:Casepaper)=>{
  if(data!=null)
  {
this.selcase=data

this.ps.search(this.selcase.pid).subscribe((data:Patient)=>{
  if(data!=null)
    this.pt=data
})
  }
})
}
submitdata()
{
this.pc.aid=this.selcase.aid
this.psc.insert(this.pc).subscribe((data:Prescription)=>{
  if(data!=null)
  {
    alert("Presciption Added")
  }
})
}
}
