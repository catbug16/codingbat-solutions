public int luckySum(int a, int b, int c) {
  int sum = a +b +c;
  if (a==13 && b==13 && c==13 ){
    sum=0; 
  }
  else if (a==13){
    sum=0;
  }
  else if (b==13){
    sum=a;
  }
  else if (c==13){
    sum-=c;
  }
  return sum;
}
