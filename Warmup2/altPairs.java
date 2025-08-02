public String altPairs(String str) {
  String str2="";
  for (int i=0; i<str.length(); i++){
    str2+=str.charAt(i);
    if (i%2!=0){
      i+=2;
    }
  }
  return str2;
}

