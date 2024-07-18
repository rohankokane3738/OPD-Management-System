import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Patient } from '../models/patient';
import { isGeneratorFunction } from 'util/types';

@Injectable({
  providedIn: 'root'
})
export class PatientService {
serverurl="http://localhost:8080/opd"
  constructor(private http:HttpClient) { }
  getAll():Observable<Patient[]>
  {
  return  this.http.get<Patient[]>(this.serverurl+"/patient")
  }
  insert(p:Patient):Observable<Patient>
  {
    return this.http.post<Patient>(this.serverurl+"/patient",p)
  }
  delete(id:any):Observable<any>
  {
    return this.http.delete(this.serverurl+"/patient/"+id)
  }
  update(id:any,p:Patient):Observable<Patient>
  {
    return this.http.put<Patient>(this.serverurl+"/patient/"+id,p)
  }
  search(id:any):Observable<Patient>
  {
    return this.http.get<Patient>(this.serverurl+"/patient/"+id)
  }
  login(em:any,ps:any):Observable<Patient>
  {
    return this.http.get<Patient>(this.serverurl+"/patient/"+em+"/"+ps)
  }
}
