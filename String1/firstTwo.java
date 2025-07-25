public String firstTwo(String str) {
  String chr="";
  if (str.length()>=2){
      chr = str.substring(0,2);
  }
  else if (str.length() ==1 ){
    chr = str.substring(0,1);
  }
  else if (str.length() == 0 ){
    chr = "";
  }
  return chr;
}

