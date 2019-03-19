import { Component, OnInit, Input } from '@angular/core';
import { FormGroup, FormControl } from  '@angular/forms';

import { Client } from '../client';
import { ClientService } from '../client.service';

@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.css'],
  providers: [ClientService]
})
export class ClientComponent implements OnInit {

  postData:String;

  constructor(private _clientService: ClientService){}

  clientForm = new FormGroup({

    name: new FormControl(),
    creditLimit: new FormControl(),
    risk: new FormControl('A')
  });

  ngOnInit(): void {
  
  }

  onSubmit() {
    console.log(this.clientForm.value);
    this._clientService.addClient(this.clientForm.value)
    .subscribe(
      data => this.postData = JSON.stringify(data),
      error => alert(error),
      () => console.log("Finished")
    );
  }

}