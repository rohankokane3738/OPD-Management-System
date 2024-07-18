import { Component } from '@angular/core';
import { Patient } from '../models/patient';
import { FormsModule } from '@angular/forms';
import { PatientService } from '../services/patient.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
submitdata() {
  this.ps.login(this.p.email,this.p.password).subscribe((data:Patient)=>{
   if(data!=null)
   {
    alert("Login Successful")
    localStorage.setItem("pemail",this.p.email)
    localStorage.setItem("pid",data.pid)
    this.router.navigate(["/"])
   }
   else
   alert("incorrect username or password")
  })
}

 p:Patient=new Patient()

 constructor(private ps :PatientService,private router:Router)
{

}
}
