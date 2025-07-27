public int[] make2(int[] a, int[] b) {
  int[] make = new int[2];
  if (a.length==1){
    make = new int[]{a[0],b[0]};
  }
  else if (a.length>1){
    make = new int[]{a[0],a[1]};
  }
  else if (a.length == 0){
    make = new int[]{b[0],b[1]};
  }
  return make;
}

