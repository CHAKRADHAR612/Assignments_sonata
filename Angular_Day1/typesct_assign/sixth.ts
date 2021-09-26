class Tshirt{
  color:string;
  material:string;
  design:string;
  size:string;
  constructor(c:string,m:string,d:string,s:string){
	this.color=c;
        this.material=m;
        this.design=d;
        this.size=s;
  }

  display(){
  	console.log(this.color+" "+this.material+" "+this.design+" "+this.size);
  }
      
}

var t1=new Tshirt('red','cotton','striped','small');
var t2=new Tshirt('green','silk','plain','large');
var t3=new Tshirt('yellow','cotton','checks','xtra-large');
t1.display();
t2.display();
t3.display();