public String doubleChar(String str) {
  String dble="";
  for (int i = 0 ; i<str.length() ; i++){
    for (int j = 1 ; j<3 ; j++){
      dble += str.substring(i,i+1);
    }
  }
  return dble;
}

