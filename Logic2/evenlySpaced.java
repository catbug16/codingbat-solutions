public int maxThree(int a, int b, int c){
  int max= Math.max(a,b);
  max = Math.max(max,c);
  return max;
}
public int minThree(int a, int b, int c){
  int min= Math.min(a,b);
  min = Math.min(min,c);
  return min;
}
public boolean evenlySpaced(int a, int b, int c) {
  int max = maxThree(a,b,c);
  int min = minThree(a,b,c);
  int mid=0;
  int arr[] = {a,b,c};
  for (int i=0; i<arr.length; i++){
    if (arr[i]!= max && arr[i]!=min){
      mid = arr[i];
    }
  }
  if (Math.abs(max-mid)==Math.abs(mid-min)){
    return true;
  }
  else {
    return false;
  }
}

