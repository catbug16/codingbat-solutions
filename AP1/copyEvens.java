public int[] copyEvens(int[] nums, int count) {
  int[] even = new int[count];
  int index = 0;
  for (int i=0; i<nums.length; i++){
    if (nums[i]%2==0 && index<count){
      even[index]=nums[i];
      index+=1;
    }
  }
  return even;
}

