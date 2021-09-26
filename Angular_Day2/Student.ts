export class Student{
    id:number;
    name:string;
    marks:number;
    constructor(public i:number,public n:string,public m:number){
        this.id=i;
        this.name=n;
        this.marks=m;
    }
}