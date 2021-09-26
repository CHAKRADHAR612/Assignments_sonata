import { Component } from "@angular/core";
import { Items } from "./Items";
@Component({
    selector:'my-items',
    template:
    `
    <div>
        <ul *ngFor="let i of items1"><li>{{i}}</li></ul>
    </div>
    `
})
export class ItemsComponent{
    item1:string='laptop';
    item2:string='mobile';
    items1!:string[]
    constructor(public items:Items){
        this.items1=items.addItem(this.item1);
        this.items1=items.addItem(this.item2);
    }
}