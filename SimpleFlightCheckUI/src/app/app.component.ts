import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Simple Flight Check';

  // Object to save the response returned from the service.
  myresponse: any;

  // Url to fetch the flight info from the spring application.
  readonly APP_URL = 'http://localhost:8080/SimpleFlightCheck';

  constructor(private _http: HttpClient) { }

  // TODO: add input field params to http.get for filtered results
  getFlightInfo() {
    this._http.get(this.APP_URL + '/getflightinfo').subscribe(
      data => {
        this.myresponse = data;
      },
      error => {
        console.log('Error occured', error);
      }
    );
  }
}
