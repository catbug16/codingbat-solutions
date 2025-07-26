public boolean old35(int n) {
  boolean old = false;
  if ( n%5 == 0 && n%3!=0){
    old = true;
  }
  else if ( n%3 == 0 && n%5!=0){
      old = true;
  }
  return old;
}
