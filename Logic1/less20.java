public boolean less20(int n) {
  boolean less = false;
  if ( (n+1)%20==0 || (n+2)%20==0){
    less = true;
  }
  return less;
}

