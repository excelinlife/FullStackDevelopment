let promise =new Promise((success,failure)=>{
    let one = 1;
    let two = 2;
    if(one+two==2){
        success("Its completely fine");
    } else{
        failure("Its not okay..something is wrong");
    }
});


promise.then((msg)=>{
    console.log("looks good "+msg);
}).catch((msg)=>{
    console.log("this is caught "+msg);
})

const fibnums= (num)=>{
    let result = [];
    for(let i =0;i<num;i++){
        if(i==0 || i==1){
            result[i]=i;
        } else{
            result[i]=result[i-1]+result[i-2];
        }
    }
    return result;
}


console.log(fibnums(100));