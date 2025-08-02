public String stringX(String str) {
  String str2="";
  for (int i=1; i<str.length()-1; i++){
    if (str.charAt(i)!='x'){
      str2+=str.charAt(i);
    }
  }
  if (str.length()>1){
    return str.charAt(0) + str2 + str.charAt(str.length()-1);
  }
  else{
    return str;
  }
}

