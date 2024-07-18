import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactsComponent } from './contacts/contacts.component';
import { FacilitiesComponent } from './facilities/facilities.component';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { AppointmentComponent } from './appointment/appointment.component';
import { AppointmentStatusComponent } from './appointment-status/appointment-status.component';
import { ViewPrescriptionComponent } from './view-prescription/view-prescription.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { AdminViewAppComponent } from './admin-view-app/admin-view-app.component';
import { CasePaperComponent } from './case-paper/case-paper.component';
import { AddPrescriptionComponent } from './add-prescription/add-prescription.component';

export const routes: Routes = [
    {path:"",component:HomeComponent},
    {path:"contact",component:ContactsComponent},
    {path:"faci",component:FacilitiesComponent},
    {path:"signup",component:SignupComponent},
    {path:"log",component:LoginComponent},
    {path:"app",component:AppointmentComponent},
    {path:"vapp",component:AppointmentStatusComponent},
    {path:"vpre",component:ViewPrescriptionComponent},
    {path:"alog",component:AdminLoginComponent},
    {path:"vapps",component:AdminViewAppComponent},
    {path:"cp",component:CasePaperComponent},
    {path:"addpre",component:AddPrescriptionComponent},
];
