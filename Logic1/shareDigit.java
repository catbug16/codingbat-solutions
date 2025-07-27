public boolean shareDigit(int a, int b) {
  int righta = a%10;
  int lefta = a/10;
  int rightb = b%10;
  int leftb = b/10;
  boolean share = false;
  if ( righta == rightb || righta == leftb ){
    share = true;
  }
  else if ( lefta == rightb || lefta == leftb ){
     share = true;
  }
  return share;
}

