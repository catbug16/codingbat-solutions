public String alarmClock(int day, boolean vacation) {
  String alarm = "7:00";
  if ( day ==0 && vacation == false|| day == 6 && vacation == false){
    alarm = "10:00";
  }
  else if ( day ==0 && vacation == true|| day == 6 && vacation == true){
    alarm = "off";
  }
  else if ( vacation == true){
    alarm = "10:00";
  }
  return alarm;
}

