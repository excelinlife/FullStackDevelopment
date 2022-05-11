export {}
let a:number=10;
console.log(a);

let undef:undefined=undefined
let another:null=null;

let var1:String=null;
let var2:String=undefined;

let list:number[] = [1,2,3,4,5,6];
let list2:Array<number>=[1,2];

let person:[string, number]=['ashish', 21];

let random:any=10;
random=true;
random="ashish";
console.log(random.name);

let aaa=10;
aaa=20;

let mylti:number|boolean;
mylti=10;
mylti=true;

let any:any;
any=100;
any="ashish"

//collection of fix values

enum Color {Red, Green, Blue};

let c:Color=Color.Green;
console.log(c);

enum Day{'Monday','Tueday', 'Wednesday','Thurday'};
let day:Day=Day.Tueday;
console.log(day);

interface Person{
    name:string;
    age:number;
    address:String;
    speak:()=>string;
}

let kishan:Person={
    name:"Kishan",
    age:21,
    address:"abc",
    speak:():string=>{return "My name is kishan"}
}

console.log(kishan.name);
console.log(kishan.age);
console.log(kishan.speak());


class Student{
    public roolNo:number;
    name:string;
}

let chetan = new Student();
chetan.name="chetan";
chetan.roolNo=5;
console.log(chetan.name+" "+chetan.roolNo);

class Teacher{
    public empId:number;
    private name:string;
    public print(){
        return this.name;
    }
    public setName(name:string){
        this.name=name;
    }
}

let aryan = new Teacher();
aryan.setName("Aryan");
console.log(aryan.print());

class Human{
    name:string;
    protected age:number;

    constructor(name:string, age:number){
        this.name=name;
        this.age=age;
    }
}

class Millenials extends Human{
    private netWorth:number;
    constructor(name:string, age:number, netWorth:number){
        super(name,age);
        this.netWorth=netWorth;
    }

    public details(){
        return this.name+" "+this.age+" "+this.netWorth;
    }
}

let m:Millenials = new Millenials("random", 21, 100);
console.log(m.details());