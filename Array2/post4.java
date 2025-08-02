public int[] post4(int[] nums) {
  int count=0;
  for (int i=nums.length-1; i>=0; i--){
    if (nums[i]==4){
      count=nums.length-i-1;
      break;
    }
  }
  int[] nums1 = new int[count];
  for (int j=0; j<count; j++){
    nums1[j]=nums[nums.length-count+j];
  }
  return nums1;
}

