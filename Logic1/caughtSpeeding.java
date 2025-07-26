public int caughtSpeeding(int speed, boolean isBirthday) {
  int ticket=0;
  if (isBirthday == true){
    speed -=5;
  }
  if (speed>60 && speed<81){
    ticket =1;
  }
  if (speed>80){
    ticket =2;
  }
  return ticket;
}

