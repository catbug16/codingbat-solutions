public String withoutX(String str) {
  if (str.length()>1 && str.substring(0,1).equals("x") && 
str.substring(str.length()-1,str.length()).equals("x")){
    str = str.substring(1,str.length()-1);
  }
  else if (str.length()>1 && str.substring(0,1).equals("x")){
    str = str.substring(1,str.length());
  }
  else if (str.length()>1 && 
str.substring(str.length()-1,str.length()).equals("x")){
    str = str.substring(0,str.length()-1);
  }
  else if (str.length()== 1 && str.equals("x")){
    str = "";
  }
  return str;
}

