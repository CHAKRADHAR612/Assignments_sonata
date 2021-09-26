import { Component } from "@angular/core";
import { Product } from "./Product";
@Component({
    selector:'my-product',
    template:`
    <div>
        <ul *ngFor="let p of product"><li>{{p.name}} {{p.price}} <img src="/assets/{{p.image}}" alt="no image to show"></li></ul>
    </div>
    `
})
export class ProductComponent{
    product=[new Product('peace1',100,'peace1.png'),new Product('peace2',200,'peace2.jpg')];

}