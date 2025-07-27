public int[] makeMiddle(int[] nums) {
  int a = nums.length/2-1;
  int b = nums.length/2;
  int[] mid = {nums[a],nums[b]};
  return mid;
}

