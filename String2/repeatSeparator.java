public String repeatSeparator(String word, String sep, int count) {
  String rep="";
  for (int i=0; i<count; i++){
    rep+=word;
    if (i!=count-1){
      rep+=sep;
    }
  }
  return rep;
}

