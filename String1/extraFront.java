public String extraFront(String str) {
  String three=str+str+str;
  if (str.length()>2){
    three = str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
  }
  return three;
}

