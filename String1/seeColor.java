public String seeColor(String str) {
  String color="";
  if (str.length()>2){
    if(str.substring(0,3).equals("red")){
      color="red";
    }
  }
  if (str.length()>3){
    if (str.substring(0,4).equals("blue")){
      color="blue";
    }
  }
  return color;
}

