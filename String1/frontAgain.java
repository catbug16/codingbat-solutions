public boolean frontAgain(String str) {
  boolean fagn= false;
  if (str.length()>1 && 
str.substring(0,2).equals(str.substring(str.length()-2,str.length()))){
    fagn = true;
  }
  return fagn;
}

