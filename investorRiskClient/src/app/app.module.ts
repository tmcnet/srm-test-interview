import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms'

import { AppComponent } from './app.component';
import { ClientComponent } from './client/client.component';

@NgModule({
  declarations: [
    AppComponent,
    ClientComponent
  ],
  imports: [
    BrowserModule, 
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
