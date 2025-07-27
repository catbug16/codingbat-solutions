public int greenTicket(int a, int b, int c) {
  int result = 0;
  if ( a == b && b == c && c == a){
    result = 20;
  }
  else if ( a == b || b == c || c == a){
    result = 10;
  }
  return result;
}

