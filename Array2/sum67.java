public int sum67(int[] nums) {
  int sum=0;
  for (int i=0; i<nums.length; i++){
    if (nums[i]==6){
      int end=0;
      for (int j =i+1; j<nums.length; j++){
        if (nums[j]==7){
          end=j;
          break;
        }
      }
      i=end;
      continue;
    }
    sum+=nums[i];
  }
  return sum;

}
