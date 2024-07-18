import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { isGeneratorFunction } from 'util/types';
import { Appointment } from '../models/appointment';

@Injectable({
  providedIn: 'root'
})
export class AppointmentService {
serverurl="http://localhost:8080/opd"
  constructor(private http:HttpClient) { }
  getAll():Observable<Appointment[]>
  {
  return  this.http.get<Appointment[]>(this.serverurl+"/Appointment")
  }
  insert(a:Appointment):Observable<Appointment>
  {
    return this.http.post<Appointment>(this.serverurl+"/Appointment",a)
  }
  delete(id:any):Observable<any>
  {
    return this.http.delete(this.serverurl+"/Appointment/"+id)
  }
  update(id:any,a:Appointment):Observable<Appointment>
  {
    return this.http.put<Appointment>(this.serverurl+"/Appointment/"+id,a)
  }
  search(id:any):Observable<Appointment>
  {
    return this.http.get<Appointment>(this.serverurl+"/Appointment/"+id)
  }
  
}
