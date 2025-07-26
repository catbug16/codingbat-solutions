public boolean in1To10(int n, boolean outsideMode) {
  boolean range = false;
  if (n>=1 && n<=10 && outsideMode == false){
    range = true;
  }
  else if (outsideMode == true && n<=1 || n>=10 && outsideMode == true){
     range = true;
  }
  return range;
}

