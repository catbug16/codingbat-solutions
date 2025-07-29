public int countX(String str) {
  
  if (str.length()>1){
    if (str.substring(0,1).equals("x")){
    return 1+countX(str.substring(1,str.length()));
  }
  else{
    return countX(str.substring(1,str.length()));
  }
  }
  else{
    if  (str.equals("x")){
    return 1;
  }
  else{
    return 0;
  }
  }
}
