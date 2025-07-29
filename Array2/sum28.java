public boolean sum28(int[] nums) {
  int count=0;
  for (int num : nums){
    if (num==2){
      count+=2;
    }
  }
  if(count==8){
    return true;
  }
  else{
    return false;
  }
}

