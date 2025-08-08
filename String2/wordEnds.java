public String wordEnds(String str, String word) {
  String str2="";
  int n = word.length();
  for (int i=0; i<str.length(); i++){
    if (i+n<=str.length() && str.substring(i,i+n).equals(word)){
      if (i-1>=0){
        str2+=str.charAt(i-1);
      }
      if(i+n<str.length()){
        str2+=str.charAt(i+n);
      }
    }
  }
  return str2;
}

