var nums = [1,2,3,4,5,6,7,8,9,10];
var result = nums.filter(a=>a%2==1);
result.forEach(function(a){
    console.log(a);
});


var names=["Ram", "Bharat", "Shiv", "Shartughna", "Sonakshi", "Parvati", "Sakshi"];
names.filter(name=>name.charAt('0')=='S').forEach(a=>console.log(a));

var malesNames=["Ram", "Bharat", "Shiv", "Shartughna"];
malesNames.map(name=>name.concat(" Kumar")).forEach(a=>console.log(a));


nums.map(kabab=>kabab*2).forEach(biryani=>console.log(biryani));
