import { Component, OnInit, Input } from '@angular/core';
import { FormGroup, FormControl } from  '@angular/forms';

import { Client } from '../client';

@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.css']
})
export class ClientComponent {

  clientForm = new FormGroup({
    name: new FormControl(),
    creditLimit: new FormControl(),
    risk: new FormControl('A')
  });

  onSubmit() {
    console.log(this.clientForm.value);
  }

}