"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
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
var random = 10;
random = true;
random = "ashish";
console.log(random.name);
var aaa = 10;
aaa = 20;
var mylti;
mylti = 10;
mylti = true;
var any;
any = 100;
any = "ashish";
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
var Day;
(function (Day) {
    Day[Day["Monday"] = 0] = "Monday";
    Day[Day["Tueday"] = 1] = "Tueday";
    Day[Day["Wednesday"] = 2] = "Wednesday";
    Day[Day["Thurday"] = 3] = "Thurday";
})(Day || (Day = {}));
;
var day = Day.Tueday;
console.log(day);
var kishan = {
    name: "Kishan",
    age: 21,
    address: "abc",
    speak: function () { return "My name is kishan"; }
};
console.log(kishan.name);
console.log(kishan.age);
console.log(kishan.speak());
var Student = /** @class */ (function () {
    function Student() {
    }
    return Student;
}());
var chetan = new Student();
chetan.name = "chetan";
chetan.roolNo = 5;
console.log(chetan.name + " " + chetan.roolNo);
var Teacher = /** @class */ (function () {
    function Teacher() {
    }
    Teacher.prototype.print = function () {
        return this.name;
    };
    Teacher.prototype.setName = function (name) {
        this.name = name;
    };
    return Teacher;
}());
var aryan = new Teacher();
aryan.setName("Aryan");
console.log(aryan.print());
var Human = /** @class */ (function () {
    function Human(name, age) {
        this.name = name;
        this.age = age;
    }
    return Human;
}());
var Millenials = /** @class */ (function (_super) {
    __extends(Millenials, _super);
    function Millenials(name, age, netWorth) {
        var _this = _super.call(this, name, age) || this;
        _this.netWorth = netWorth;
        return _this;
    }
    Millenials.prototype.details = function () {
        return this.name + " " + this.age + " " + this.netWorth;
    };
    return Millenials;
}(Human));
var m = new Millenials("random", 21, 100);
console.log(m.details());
