public boolean twoTwo(int[] nums) {
  int count = 0;
  if (nums.length>=2){
    if (nums[0]==2 && nums[1]!=2){
    return false;
  }
  if (nums[nums.length-1]==2 && nums[nums.length-2]!=2){
    return false;
  }
  }
  for (int i=1; i<nums.length-1; i++){
    if (nums[i]==2){
      if(nums[i+1]!=2 && nums[i-1]!=2){
        return false;
      }
    }
  }
  if (nums.length==1 && nums[0]==2){
    return false;
  }
  return true;
}
