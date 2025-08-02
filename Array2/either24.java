public boolean either24(int[] nums) {
  boolean isTwo= false;
  boolean isFour= false;
  for (int i=0; i<nums.length-1; i++){
    if (nums[i]==2 && nums[i+1]==2){
      isTwo = true;
    }
    else if (nums[i]==4 && nums[i+1]==4){
      isFour = true;
    }
  }
  if (isTwo && isFour){
    return false;
  }
  else if (!isTwo && !isFour){
    return false;
  }
  else{
    return true;
  }
}
