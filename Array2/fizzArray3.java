public int[] fizzArray3(int start, int end) {
  int[] nums = new int[end-start];
  int n=0;
  for (int i=start; i<end; i++){
    nums[n]=i;
    n+=1;
  }
  return nums;
}

