public int bigDiff(int[] nums) {
  int min = nums[0];
  int max = nums[0];
  if (nums.length>1){
    for (int i=0; i < nums.length-1; i++){
      max = Math.max(max,nums[i+1]);
      min = Math.min(min,nums[i+1]);
    }
    return Math.abs(max-min);
  }
  else{
    return 0;
  }
}

