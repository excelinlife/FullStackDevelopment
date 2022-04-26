function action(){
    alert('you have clicked on the button...');
    console.log('you have clicked');
    var variable = 'ashish';

    ;
    
    second=900;
    //var result =second;
    var arr =  ['vinay', 'harshita', 'maaz', 'sakshi', 'mahima', 'ashish'];
    //document.write(arr.length);
    document.write(variable.indexOf('h'));
    var second;
    /*for(var i=arr.length-1;i>=0;i--){
        document.write(arr[i] +" ");
    }*/

    /*var i=0;
    while(i<arr.length){
        document.write(arr[i] +" ");
        i++;
    }*/

    /*i am showing increment operators use here
    var i=10;
    var j=i++;
    //i=11, j=10

    var i=10;
    var j=++i;
    //i=11, j=11
    */

  /*  var i=arr.length-1;
    do{
        document.write(arr[i] +" ");
        i--
    } while(i>=0)
    */

    /*
    on the basis of age, print whether someone is kid, teen, adult or and old person.
    */
   /*var age= -10;
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
   
*/
   //Break and contnue

  /* for(var i=arr.length-1;i>=0;i--){
       if(i==3)
       break;
    document.write(arr[i] +" ");
}
*/

for(var i=arr.length-1;i>=0;i--){
    if(i==3)
    continue;
 document.write(arr[i] +" ");
}

//local: CM and global : PM
}
