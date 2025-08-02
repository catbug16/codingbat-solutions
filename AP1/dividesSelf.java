public boolean dividesSelf(int n) {
  int num =n;
  while (n!=0){
    if (n%10==0){
      return false;
    }
    if (num%(n%10)!=0){
      return false;
    }
    n=n/10;
  }
  return true;
}

