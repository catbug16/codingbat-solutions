public int maxTriple(int[] nums) {
  if (nums.length == 1){
    return nums[0];
  }
  int a = nums[0];
  int b = nums[nums.length/2];
  int c = nums[nums.length-1];
  
  int max = Math.max(a,b);
  max= Math.max(max,c);
  return max;
  
}

