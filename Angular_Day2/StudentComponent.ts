import { Component } from "@angular/core";
import { Student } from "./Student";
@Component({
    selector:'my-student',
    template:
    `
        <div>
        <ul *ngFor="let s of student"><li>{{s.id}} {{s.name}} {{s.marks}}</li></ul>
        </div>
    `
})
export class StudentComponent{
    student=[new Student(1,'chakradhar',98),new Student(2,'prudhvi',90),new Student(3,'chandra',100)]
}