public int[] midThree(int[] nums) {
  int a=nums.length/2-1;
  int b=nums.length/2;
  int c=nums.length/2+1;
  int[] mid = {nums[a],nums[b],nums[c]};
  return mid;
}

