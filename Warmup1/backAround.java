public String backAround(String str) {
  if (str.length()>0){
    return str.substring(str.length()-1,str.length()) + str 
+str.substring(str.length()-1,str.length());
  }
  return str;
}

