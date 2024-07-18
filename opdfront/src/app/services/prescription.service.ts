import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';
import { isGeneratorFunction } from 'util/types';
import { Prescription } from '../models/prescription';

@Injectable({
  providedIn: 'root'
})
export class PrescriptionService {

  serverurl="http://localhost:8080/opd"
  constructor(private http:HttpClient) { }
  getAll():Observable<Prescription[]>
  {
  return  this.http.get<Prescription[]>(this.serverurl+"/Prescription")
  }
  insert(a:Prescription):Observable<Prescription>
  {
    return this.http.post<Prescription>(this.serverurl+"/Prescription",a)
  }
  delete(id:any):Observable<any>
  {
    return this.http.delete(this.serverurl+"/Prescription/"+id)
  }
  update(id:any,a:Prescription):Observable<Prescription>
  {
    return this.http.put<Prescription>(this.serverurl+"/Prescription/"+id,a)
  }
  search(id:any):Observable<Prescription>
  {
    return this.http.get<Prescription>(this.serverurl+"/Prescription/"+id)
  }
  getAllP(id:any):Observable<Prescription[]>
  {
  return  this.http.get<Prescription[]>(this.serverurl+"/Prescription/app/"+id)
  }
}
