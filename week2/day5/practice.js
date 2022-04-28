function a(){
    console.log("first function is calling second function");
    b();
    console.log("a ended");
}

function b(){
    c();
    console.log("second function is calling third function");
   
}

function c(){
    console.log("third function is ending");
}

a();