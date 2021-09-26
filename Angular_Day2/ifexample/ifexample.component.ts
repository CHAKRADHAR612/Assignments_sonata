import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ifexample',
  templateUrl: './ifexample.component.html',
  styleUrls: ['./ifexample.component.css']
})
export class IfexampleComponent implements OnInit {
  age:number=12;
  constructor() { }

  ngOnInit(): void {
  }

}
