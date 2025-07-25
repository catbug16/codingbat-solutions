public String lastChars(String a, String b) {
  String lst="";
  if (a.length() == 0 && b.length()!=0){
    lst = "@"+b.substring(b.length()-1,b.length());
  }
  else if (b.length() == 0 && a.length()!=0){
    lst = a.substring(0,1)+ "@";
  }
  else if (a.length() == 0 && b.length() == 0) {
    lst = "@@";
  }
  else{
    lst = a.substring(0,1)+b.substring(b.length()-1,b.length());
  }
  return lst;
}
