public boolean hasOne(int n) {
  while (n/10!=0 || n==1){
    if (n%10==1 || n==1){
      return true;
    }
    n=n/10;
  }
  return false;
}

