public int[] zeroFront(int[] nums) {
  for (int i=0; i<nums.length; i++){
    if (nums[i]==0){
      for (int j=0; j<nums.length; j++){
        if (nums[j]!=0){
          nums[i]=nums[j];
          nums[j]=0;
          break;
        }
      }
    }
  }
  return nums;
}

