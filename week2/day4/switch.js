var day = prompt('give me day nummber');
var day=parseInt(day);


switch (day) {
case 0:
    day = "Sunday";
    console.log(day);
    break;
  case 1:
    day = "Monday";
    console.log(day);
    break;
  case 2:
     day = "Tuesday";
     console.log(day);
    break;
  case 3:
    day = "Wednesday";
    console.log(day);
    //break;
  case 4:
    day = "Thursday";
    console.log(day);
    //break;
  case 5:
    day = "Friday";
    console.log(day);
    //break;
  case 6:
    day = "Saturday";
    console.log(day);
    default:
        console.log("invalid day")
}


