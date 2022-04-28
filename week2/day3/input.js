function action(){
    var age= prompt("Please enter your age and I will tell whether you are a kid, teen, aduld or and old person");
   if(age<=0){
    document.write("give the valid age");
   } else if(age>=0 && age<12){
    document.write("you are a bachcha");
   } else if( age >=12 && age <18){
    document.write("Not a baccha, but a teen");
   } else if(age>=18 && age<45){
    document.write("you are an a dult");
   } else{
    document.write("your old days have arrived");
   }
}

/*function table(){
    var num = prompt("give me the number");
    for(var i=1; i<=10; i++){
        document.write (num*i+"<br>");

        //document.write((num*i));
        //document.write("<br>");
        //document.write(num+"*"+i+"="+(num*i));
    }*/


   /* var num = [1,2,3,4,5,6,7,8,9,10];
    num.forEach(function(a){
        console.log(a);
    });

    */

var name1="Jitendra";
document.write(name1.indexOf('J'));
/*
    function printEven(){
       
       for(var i =0;i<num.length;i++){
           if(num[i]%2==0){ 
            document.write(num[i] + "<br>");
           }

       }
    }
    */