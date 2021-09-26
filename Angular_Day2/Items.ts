import { Injectable } from "@angular/core";

@Injectable({
    providedIn:'root'
})
export class Items{
    items:string[]=[];
    addItem(item:string):any{
        this.items.push(item);
        return this.items;
    }
}