public boolean twoAsOne(int a, int b, int c) {
  boolean thrd = false;
  if ( a+b == c || a+c == b || b+c == a){
    thrd = true;
  }
  return thrd;
}
