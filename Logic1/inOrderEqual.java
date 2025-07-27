public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  boolean order = false;
  if ( b > a && c > b ){
    order = true;
  }
  else if ( b == a && c==b && equalOk == true){
    order = true;
  }
  else if ( b == a && c>b && equalOk == true){
    order = true;
  }
  else if ( c == b && b>a && equalOk == true){
    order = true;
  }
  return order;
}

