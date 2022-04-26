var num=prompt('no of input');
var arr=[];
for (let index = 0; index < num; index++) {
    arr[index] = prompt('give input');
}

for (let index = 0; index < arr.length; index++) {
    document.write(arr[index]+"<br>");
}