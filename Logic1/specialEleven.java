public boolean specialEleven(int n) {
  boolean mult = false;
  if (n%11==0 || (n-1)%11==0){
    mult = true;
  }
  return mult;

}
