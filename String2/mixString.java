public String mixString(String a, String b) {
  String mix="";
  if (a.length()>=b.length()){
    for (int i = 0; i<b.length(); i++){
      mix+=a.substring(i,i+1);
       mix+=b.substring(i,i+1);
    }
    mix+=a.substring(b.length(),a.length());
  }
  else if (b.length()>a.length()){
    for (int i = 0; i<a.length(); i++){
      mix+=a.substring(i,i+1);
       mix+=b.substring(i,i+1);
    }
    mix+=b.substring(a.length(),b.length());
  }
  return mix;
}
