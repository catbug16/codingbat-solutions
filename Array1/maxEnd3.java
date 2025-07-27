public int[] maxEnd3(int[] nums) {
  int max=0;
  if (nums[2]>=nums[0]){
    max = nums[2];
  }
  else if (nums[0]>=nums[2]){
     max = nums[0];
  }
  
  int[] end = {max,max,max};
  
  return end;
}
