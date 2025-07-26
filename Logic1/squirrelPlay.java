public boolean squirrelPlay(int temp, boolean isSummer) {
  boolean isplay=false;
  if (temp >= 60 && temp <=90 && isSummer == false){
    isplay = true;
  }
  else if (temp >= 60 && temp <=100 && isSummer == true){
    isplay = true;
  }
  return isplay;
}

