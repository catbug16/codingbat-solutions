public String stringSplosion(String str) {
  String str2="";
  for (int i=0; i<str.length(); i++){
    str2+=str.substring(0,i+1);
  }
  return str2;
}

