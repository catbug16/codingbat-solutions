public boolean bobThere(String str) {
  boolean bob=false;
  if (str.length()>=3){
    for (int i=0; i<str.length()-2; i++){
      if (str.substring(i,i+1).equals("b") && 
str.substring(i+2,i+3).equals("b")){
        bob=true;
      }
    }
  }
  return bob;
}

