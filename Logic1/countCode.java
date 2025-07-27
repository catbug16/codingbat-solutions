public int countCode(String str) {
  int count=0;
  if (str.length()>3){
    for (int i=0; i<str.length()-3; i++){
      if 
(str.substring(i,i+2).equals("co")&&str.substring(i+3,i+4).equals("e")){
        count+=1;
      }
    }
  }
  return count;
}

