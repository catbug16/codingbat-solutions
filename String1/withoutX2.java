public String withoutX2(String str) {
  if (str.length()>2 &&  str.substring(0,2).equals("xx")){
    str = str.substring(2,str.length());
  }
  else if (str.length() == 2 &&  str.equals("xx")){
    str = "";
  }
  else if (str.length()>2 &&  str.substring(0,1).equals("x")){
    str = str.substring(1,str.length());
  }
  else if (str.length()>2 &&  str.substring(1,2).equals("x")){
    str = str.substring(0,1) + str.substring(2,str.length());
  }
  else if (str.length()<2 &&  str.equals("x")){
    str = "";
  }
  return str;
}
