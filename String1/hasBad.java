public boolean hasBad(String str) {
  boolean bad = false;
  if (str.length()>2){
    if (str.substring(0,3).equals("bad")){
    bad = true;
  }
  if (str.length()>3){
    if (str.substring(1,4).equals("bad")){
      bad = true;
    }
  }
  }
  return bad;
}

