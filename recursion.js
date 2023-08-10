let hashmap ={};
hashmap['gautam'] = 123
hashmap['gautam'] = 897
hashmap['Rahul'] = 765
hashmap['Pankaj'] = 234
hashmap['ashish'] = 321
hashmap['ashish'] = 321

console.log(hashmap['gautam'])


let map = new Map();
map.set('ashish', 'Mentor')
map.set("Pankaj","student");
map.set("Avi", "program manager")

console.log(map.get('Avi'))
console.log(map.has('ashish'))


function factorial(val){
    if(val <=1)
    return val;
    else
    return val*factorial(val-1)
}

function fib(n){
    if(n<2)
    return n;
    else
    return fib(n-1)+fib(n-2);
}


function recBinary(arr, st, end, target){
    if(st>end){
        return -1;
    } else{
        let mid = st+Math.floor((end-st)/2)
        if(arr[mid] == target){
            return mid;
        } else if(arr[mid] < target){
            recBinary(arr, mid+1, end,target)
        } else{
            recBinary(arr, st, mid-1, target)
        }
    }
}

// reverse a string : ashish : h rev ( ashis)  s(ashi)

function reverse(str){
    if(str.length == 0)
    return "";
    else{
        return str[str.length-1]+reverse(str.slice(0,str.length-1))
    }
}

console.log(reverse('ashish'))


