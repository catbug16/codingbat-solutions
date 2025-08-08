public String getSandwich(String str) {
  int n = "bread".length();
  int s = 0;
  int e = 0;
  for (int i=0; i<str.length(); i++){
    if (i+n<str.length() && str.substring(i,i+n).equals("bread")){
      s = i+n;
      break;
    }
  }
  for (int j=str.length(); j>=0; j--){
    if (j-n>=0 && str.substring(j-n,j).equals("bread")){
      e = j-n;
      break;
    }
  }
  if (e>s){
    return str.substring(s,e);
  }
  else{
    return "";
  }
}
