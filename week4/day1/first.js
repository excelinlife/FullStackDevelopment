var GlobalVar = 100;
function someFn() {
    console.log(GlobalVar);
    if (true) { //code block
        console.log(GlobalVar);
    }
    function nested() {
        console.log(GlobalVar);
    }
}
for (var c = 0; c < 3; c++) { //code block
    console.log(GlobalVar);
}
function someOtherFn1() {
    console.log(GlobalVar);
}
console.log(GlobalVar); //outside of any function/code block
