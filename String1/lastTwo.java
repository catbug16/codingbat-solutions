public String lastTwo(String str) {
  String flip=str;
  if (str.length()>2){
    flip = 
str.substring(0,str.length()-2)+str.substring(str.length()-1,str.length())+str.substring(str.length()-2,str.length()-1);
  }
  else if (str.length()==2){
    flip = str.substring(1,2)+str.substring(0,1);
  }
  return flip;
}

