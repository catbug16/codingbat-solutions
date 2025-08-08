public String[] mergeTwo(String[] a, String[] b, int n) {
  int ai=0;
  int bi=0;
  String[] str = new String[n];
  for (int i=0; i<str.length; i++){
    if (a[ai].compareTo(b[bi])<0){
      str[i]=a[ai];
      ai++;
    }
    else if (a[ai].compareTo(b[bi])>0){
      str[i]=b[bi];
      bi++;
    }
    else{
      str[i]=a[ai];
      ai++;
      bi++;
    }
  }
  return str;
}

