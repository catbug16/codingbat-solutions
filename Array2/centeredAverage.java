public int maxArray(int[] nums){
  int max = nums[0];
  if (nums.length>1){
    for (int i=0; i < nums.length-1; i++){
      max = Math.max(max,nums[i+1]);
    }
  }
      return max;
}
public int minArray(int[] nums){
  int min = nums[0];
  if (nums.length>1){
    for (int i=0; i < nums.length-1; i++){
      min = Math.min(min,nums[i+1]);
    }
  }
      return min;
}
public int centeredAverage(int[] nums) {
    int sum = 0;
    int max = nums[0];
    int min = nums[0];


    for (int num : nums) {
        sum += num;
        max = Math.max(max, num);
        min = Math.min(min, num);
    }

  
    return (sum - max - min) / (nums.length - 2);
}


