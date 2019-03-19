import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';
import { Client } from './client';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable()
export class ClientService {

    constructor(private http: HttpClient) {

     }

    /** POST: add a new client to the database */
    addClient (client: Client) {

        var url = 'http://localhost:8080/client/add';
        var clientJson = JSON.stringify(client);
        var headers = new HttpHeaders();
        headers.append('Content-Type', 'application/json');
        headers.append('Access-Control-Allow-Origin', '*');

        return this.http.post(url, clientJson, {
            headers: headers
        }).pipe(map(res => res));
    }
}