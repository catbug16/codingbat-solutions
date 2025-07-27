public int[] makeEnds(int[] nums) {
  int[] end = { nums[0], nums[nums.length - 1] };
  if (nums.length == 1) {
    end = new int[] { nums[0], nums[0] };
  }
  return end;
}

