public boolean lessBy10(int a, int b, int c) {
  boolean less = false;
  if (Math.abs(a-b)>9 || Math.abs(c-b)>9 || Math.abs(a-c)>9){
    less = true;
  }
  return less;
}
