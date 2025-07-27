public boolean lastDigit(int a, int b, int c) {
  boolean last = false;
  if (a%10==b%10 || a%10==c%10 || c%10==b%10){
    last = true;
  }
  return last;
}

