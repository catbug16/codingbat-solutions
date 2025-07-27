public int redTicket(int a, int b, int c) {
  int result = 0;
  if ( a == b && a == c && c == b){
    result = 5;
    if (a == 2){
      result = 10;
    }
  }
  else if ( b != a && c != a){
    result =1;
  }
  return result;
}

