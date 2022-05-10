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

//collection of fix values

enum Color {Red, Green, Blue};

let c:Color=Color.Green;
console.log(c);

interface Person{
    name:string;
    age:number;
    speak:()=>string;
}

let kishan:Person={
    name:"Kishan",
    age:21,
    speak:():string=>{return "My name is kishan"}
}

console.log(kishan.name);
console.log(kishan.age);
console.log(kishan.speak());


