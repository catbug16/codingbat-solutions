public String startWord(String str, String word) {
  String match="";
  if (str.length()>=word.length() && 
str.substring(1,word.length()).equals(word.substring(1,word.length()))){
    match = str.substring(0,word.length());
  }
  return match;
}

