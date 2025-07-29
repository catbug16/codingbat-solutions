public boolean haveThree(int[] nums) {
  int count = 0;
  if (nums.length>2){
    if (nums[0]==3 && nums[1]!=3){
    count+=1;
  }
  if (nums[nums.length-1]==3 && nums[nums.length-2]!=3){
    count+=1;
  }
  for (int i=1; i<nums.length-1; i++){
    if (nums[i]==3 && nums[i+1]!=3 && nums[i-1]!=3){
      count+=1;
    }
  }
  }
  if (count == 3){
    return true;
  }
  else {
    return false;
  }
}

