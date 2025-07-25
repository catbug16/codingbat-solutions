public String withouEnd2(String str) {
  String WE="";
  if (str.length()>=3){
    WE = str.substring(1,str.length()-1);
  }
  return WE;
}

