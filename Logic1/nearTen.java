public boolean nearTen(int num) {
  boolean near= false;
  if ((num+1)%10==0 || (num-1)%10==0 || (num-2)%10==0 || (num+2)%10==0 || 
num%10==0 ){
    near = true;
  }
  return near;
}

