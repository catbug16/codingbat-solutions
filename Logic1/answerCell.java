public boolean answerCell(boolean isMorning, boolean isMom, boolean 
isAsleep) {
  boolean ans = true;
  if ( isAsleep == true ){
    ans = false;
  }
  else if ( isMorning == true && isMom != true){
    ans = false;
  }
  return ans;
}

