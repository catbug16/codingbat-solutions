public int[] front11(int[] a, int[] b) {
  int[] front = new int[2];
  if (a.length > 0 && b.length > 0){
    front = new int[]{a[0],b[0]};
  }
  else if (a.length == 0 && b.length > 0 ){
    front = new int[]{b[0]};
  }
  else if (b.length == 0 &&a.length > 0 ){
    front = new int[]{a[0]};
  }
  else if (a.length == 0 && b.length == 0) {
    front = new int[0];
  }
  return front;
}
