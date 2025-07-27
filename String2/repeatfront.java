public String repeatFront(String str, int n) {
  String front="";
  for (int i=n; i>0; i--){
    front+=str.substring(0,i);
  }
  return front;
}

