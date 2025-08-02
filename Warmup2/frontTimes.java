public String frontTimes(String str, int n) {
  String str2="";
  if (str.length()>=3){
    for (int i=0; i<n; i++){
    str2 +=str.substring(0,3);
  }
}
  else{
    for (int i=0; i<n; i++){
    str2 +=str;
  }
  }
  return str2;
}

