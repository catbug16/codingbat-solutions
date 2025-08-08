public String plusOut(String str, String word) {
  String str2=""; 
  int n = word.length();
  for (int i=0; i<str.length(); i++){
    if (i+n>str.length() || !str.substring(i,i+n).equals(word)){
      str2+='+';
    }
    else{
      str2+=word;
      i+=n-1;
    }
  }
  return str2;
}

