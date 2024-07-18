import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Admin } from '../models/admin';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminService {
serverurl="http://localhost:8080/opd"
  constructor(private http:HttpClient) { }
  login(eid:any,p:any):Observable<Admin>
  {
    return this.http.get<Admin>(this.serverurl+"/admin/"+eid+"/"+p)
  }

}
