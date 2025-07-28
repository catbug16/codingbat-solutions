public String everyNth(String str, int n) {
  String nth= "";
  for (int i=0; i<str.length(); i+=n){
    nth+=str.substring(i,i+1);
  }
  return nth;
}

