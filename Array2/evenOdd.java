public int[] evenOdd(int[] nums) {
  for (int i=0; i<nums.length; i++){
    if (nums[i]%2!=0){
      for (int j=i+1; j<nums.length; j++){
        if (nums[j]%2==0){
          int x=nums[j];
          nums[j]=nums[i];
          nums[i]=x;
          break;
        }
      }
    }
  }
  return nums;
}

