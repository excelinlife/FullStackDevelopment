let GlobalVar=100;  
 
function someFn() {          //function
 
  console.log(GlobalVar)
 
  if (true) {         //code block
    console.log(GlobalVar)
  }
 
  function nested() {         //nested function within someFn1
    console.log(GlobalVar)
  }
 
}
 
for (let c = 0; c < 3; c++){ 
    let a=100;   //code block
  console.log(GlobalVar);
}
 
function someOtherFn1() {       //another function
  console.log(GlobalVar)
}
 
console.log(GlobalVar)          //outside of any function/code block