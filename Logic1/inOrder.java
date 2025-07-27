public boolean inOrder(int a, int b, int c, boolean bOk) {
  boolean order = false;
  if ( b > a && c > b){
    order = true;
  }
  else if ( c > b && bOk == true){
    order = true;
  }
  return order;
}

