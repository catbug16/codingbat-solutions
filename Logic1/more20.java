public boolean more20(int n) {
  boolean mult = false;
  if ( (n-1)%20==0 || (n-2)%20==0){
    mult = true;
  }
  return mult;
}

