export class Car{
	speed:number;
	regularPrice:number;
	color:string;
	constructor(s:number,rp:number,c:string){
		this.speed=s;
		this.regularPrice=rp;
		this.color=c;
	}
	getSalePrice():number{
        	return 0; 
	}
	display():void{
		console.log("initial speed:"+this.speed);
		console.log("color:"+this.color);
		console.log("initial price:"+this.regularPrice);
	}
}

export class Truck extends Car{
	 weight:number;
	 regularPrice:number;
	 totalPrice:number;
	constructor(s:number,rp:number,c:string,w:number){
		super(s,rp,c);
		this.weight=w;
		this.regularPrice=rp;
	}

	getSalePrice():number{
		if(this.weight>2000){
			this.totalPrice=this.regularPrice-((this.regularPrice*10)/100);
		}
		else{
			this.totalPrice=this.regularPrice-((this.regularPrice*20)/100);					
		}
	  return this.totalPrice;
	}

 display():void{
	super.display();
	console.log("Weight:"+this.weight);
	console.log("Sale Price:"+this.getSalePrice());
 }
		
}

var truck=new Truck(45,500000,'red',5000);
truck.display();