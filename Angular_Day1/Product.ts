export class Product{
    name:string;
    price:number;
    image:string;
    constructor(public n:string,public p:number,public i:string){
        this.name=n;
        this.price=p;
        this.image=i;
    }
}