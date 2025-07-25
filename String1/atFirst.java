public String atFirst(String str) {
  String tchr="";
  if (str.length()>1){
    tchr=str.substring(0,2);
  }
  else if (str.length()==1){
    tchr=str+"@";
  }
  else {
    tchr="@@";
  }
  return tchr;
}

