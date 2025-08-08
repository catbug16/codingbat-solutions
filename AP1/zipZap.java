public String zipZap(String str) {
  String str2="";
  if (str.length()>2){
    for (int i=0; i<str.length(); i++){
    if (str.charAt(i)=='z' && str.charAt(i+2)=='p'){
      str2+=str.charAt(i);
      str2+=str.charAt(i+2);
      i+=2;
    }
    else{
      str2+=str.charAt(i);
    }
  }
  }
  else{
    return str;
  }
  return str2;
}
