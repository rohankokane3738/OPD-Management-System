import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-navbar',
  standalone: true,
  imports: [RouterLink,CommonModule],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.css'
})
export class NavbarComponent implements OnInit{
logout() {
localStorage.removeItem("pemail")
this.router.navigate(["/"])
}
ngOnInit(): void {
  this.router.events.subscribe(()=>{
    let em=localStorage.getItem("pemail")
    if(em!=null)
    {
this.usertype="user"
    }
    else 
    {
      let am=localStorage.getItem("aemail")
      if(am!=null)
      {
  this.usertype="admin"
      }
      else
      {
        this.usertype="guest"
      }
     

      
    }
    
  })

}
usertype="guest"
constructor(private router:Router)
{

}
alogout()
{
  localStorage.removeItem("aemail")
  this.router.navigate(["/"])
}
}
