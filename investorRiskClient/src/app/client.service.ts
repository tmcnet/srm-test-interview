import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';
import { Client } from './client';
import { Observable } from 'rxjs';

@Injectable
export class ClientService {
    
    private _url: string = 'http://localhost:8080/client/add';

    constructor(private http: HttpClient) { }

    /** POST: add a new client to the database */
    addClient (client: Client): Observable<Client> {

    let headers = new HttpHeaders({
        'Content-Type': 'application/json',
        });
    let options = { headers: headers };

    return this.http.post<Client>(this._url, client, options);

    }
    

}