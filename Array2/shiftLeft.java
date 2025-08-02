public int[] shiftLeft(int[] nums) {
  int[] nums1 = new int[nums.length];
  if (nums.length>=1){
    nums1[nums1.length-1]=nums[0];
  for (int i=0; i<nums.length-1; i++){
    nums1[i]=nums[i+1];
  }
  }
  return nums1;
}

