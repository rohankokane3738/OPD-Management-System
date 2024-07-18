import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Casepaper } from '../models/casepaper';

@Injectable({
  providedIn: 'root'
})
export class CasepaperService {
  serverurl="http://localhost:8080/opd"
  constructor(private http:HttpClient) { }
  getAll():Observable<Casepaper[]>
  {
  return  this.http.get<Casepaper[]>(this.serverurl+"/CasePaper")
  }
  insert(p:Casepaper):Observable<Casepaper>
  {
    return this.http.post<Casepaper>(this.serverurl+"/CasePaper",p)
  }
  delete(id:any):Observable<any>
  {
    return this.http.delete(this.serverurl+"/CasePaper/"+id)
  }
  update(id:any,p:Casepaper):Observable<Casepaper>
  {
    return this.http.put<Casepaper>(this.serverurl+"/CasePaper/"+id,p)
  }
  search(id:any):Observable<Casepaper>
  {
    return this.http.get<Casepaper>(this.serverurl+"/CasePaper/"+id)
  }
  login(em:any,ps:any):Observable<Casepaper>
  {
    return this.http.get<Casepaper>(this.serverurl+"/CasePaper/"+em+"/"+ps)
  }

}
