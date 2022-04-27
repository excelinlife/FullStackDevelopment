var operation = prompt('what do you want to do: add, substract, multiply, divide');

var a=parseInt(prompt('first number'));
var b=parseInt(prompt('second number'));
var result;
switch (operation) {
    case "add":
        result=a+b;
        break;
      case "substract":
        result=a-b
        break;
      case "divide":
       result=a/b;
        break;
      case "multiply":
    result=a*b;
}
document.write(result);