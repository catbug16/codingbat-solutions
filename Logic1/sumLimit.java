public int sumLimit(int a, int b) {
  int sum = a + b;
  String aS = String.valueOf(a);
  String sumS = String.valueOf(sum);
  
  if ( sumS.length() > aS.length() ){
    sum = a;
  }
  return sum;
}

