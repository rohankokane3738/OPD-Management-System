import { Component } from '@angular/core';
import { Admin } from '../models/admin';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { AdminService } from '../services/admin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-login',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './admin-login.component.html',
  styleUrl: './admin-login.component.css'
})
export class AdminLoginComponent {
p:Admin=new Admin()

constructor(private as:AdminService,private router:Router)
{

}
submitdata()
{
this.as.login(this.p.email,this.p.password).subscribe((data:Admin)=>{
  if(data!=null)
  {
    alert("login successful")
    localStorage.setItem("aemail",data.email)
    this.router.navigate(["/"])
  }
  else
  alert("Invalid emailid or password")
})
}
}
