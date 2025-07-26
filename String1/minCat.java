public String minCat(String a, String b) {
  String append= a + b;
  if (a.length()>b.length()){
    append = a.substring(a.length()-b.length(),a.length())+b;
  }
  else if (b.length()>a.length()){
    append = a+b.substring(b.length()-a.length(),b.length());
  }
  return append;
}

