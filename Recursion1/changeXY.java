public String changeXY(String str) {
  if (str.length()>1){
    if (str.substring(0,1).equals("x")){
      return "y"+changeXY(str.substring(1,str.length()));
    }
    else {
      return str.substring(0,1) +changeXY(str.substring(1,str.length()));
    }
  }
  else {
    if (str.length()==1){
      if (str.equals("x")){
        return "y";
      }
      else {
        return str;
      }
    }
    return "";
  }
}
