public int[] pre4(int[] nums) {
  int count=0;
  for (int i=0; i<nums.length; i++){
    if (nums[i]==4){
      count+=i;
      break;
    }
  }
  int[] nums1 = new int[count];
  for (int j=0; j<nums1.length; j++){
    nums1[j]=nums[j];
  }
  return nums1;
}

