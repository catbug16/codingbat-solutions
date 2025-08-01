public String stringBits(String str) {
  String str2="";
  for (int i=0; i<str.length(); i+=2){
    str2+=str.charAt(i);
  }
  return str2;
}

