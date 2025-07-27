public boolean prefixAgain(String str, int n) {
  String pre=str.substring(0,n);
  boolean agn= false;
  for (int i=1; i<=str.length()-n; i++){
    if(str.substring(i,i+n).equals(pre)){
      agn = true;
    }
  }
  return agn;
}

