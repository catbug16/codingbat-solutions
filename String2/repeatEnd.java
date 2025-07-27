public String repeatEnd(String str, int n) {
  String end="";
  for (int i=0; i<n; i++){
    end += str.substring(str.length()-n,str.length());
  }
  return end;
}

