public String without2(String str) {
  String wout= str;
  if (str.length()>1 && 
str.substring(0,2).equals(str.substring(str.length()-2,str.length()))){
    wout= str.substring(2,str.length());
  }
  return wout;
}

