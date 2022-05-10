"use strict";
exports.__esModule = true;
var a = 10;
console.log(a);
var undef = undefined;
var another = null;
var var1 = null;
var var2 = undefined;
var list = [1, 2, 3, 4, 5, 6];
var list2 = [1, 2];
var person = ['ashish', 21];
//collection of fix values
var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Green"] = 1] = "Green";
    Color[Color["Blue"] = 2] = "Blue";
})(Color || (Color = {}));
;
var c = Color.Green;
console.log(c);
var kishan = {
    name: "Kishan",
    age: 21,
    speak: function () { return "My name is kishan"; }
};
console.log(kishan.name);
console.log(kishan.age);
console.log(kishan.speak());
