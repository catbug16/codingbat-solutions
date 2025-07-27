public int maxMod5(int a, int b) {
  int max = 0;
  if ( a > b){
    max = a;
    if ( a%5==b%5 ){
      max = b;
    }
  }
  else if ( b > a){
    max = b;
    if ( a%5==b%5 ){
      max = a;
    }
  }
  return max;
}
