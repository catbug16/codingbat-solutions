public String oneTwo(String str) {
  String str2 = "";
  if (str.length()>2){
    for (int i=0; i<str.length()-2; i+=3){
    str2+=str.charAt(i+1);
    str2+=str.charAt(i+2);
    str2+=str.charAt(i);
  }
  }
  else{
    return "";
  }
  return str2;
}

