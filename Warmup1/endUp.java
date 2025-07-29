public String endUp(String str) {
  if (str.length()>2){
    String end = str.substring(str.length()-3,str.length());
    return str.substring(0,str.length()-3) + end.toUpperCase();
  }
  return str.toUpperCase();
}

