class Student{
  stdId:number;
  stdName:string;
  stdClass:string;
  constructor(public sid:number,public sname:string,public sclass:string){
	this.stdId=sid;
	this.stdName=sname;
	this.stdClass=sclass;	
  }
  display(){
	console.log(this.stdId+" "+this.stdName+" "+this.stdClass);
  }
}

var student1=new Student(1,'chakradhar','tenth');
var student2=new Student(2,'chakri','intermediate');

student1.display();
student2.display();