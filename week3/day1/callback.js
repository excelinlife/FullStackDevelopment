function a(){
    console.log("first function is calling second function");
}
function b(){
    console.log("second function is calling third function");
}

function c(){
    console.log("third function is ending");
}


c();
a();
b();


function myCalculator(num1, num2) {
    var sum = num1 + num2;
    callback(sum);
  }
  function callback(sum){
      document.write(sum);
  }