public boolean xyzThere(String str) {
  boolean there = false;
  for (int i=0 ; i<= str.length()-3 ; i++){
    if (str.substring(i,i+3).equals("xyz")){
      if (i == 0 || !str.substring(i-1,i).equals(".")) {
        return true;
      }
    }
      
  }
  return there;
}

