public int blueTicket(int a, int b, int c) {
  int ab = a + b;
  int ac = a + c;
  int bc = b + c;
  int result = 0;
  if ( ab == 10 || ac == 10 || bc==10 ){
    result = 10;
  }
  else if ( (ab-bc) == 10 || (ab-ac)== 10 ){
    result = 5;
  }
  return result;
}

