public boolean no14(int[] nums) {
  for (int num : nums){
    if (num==1){
      for (int num1 : nums){
        if (num1==4){
          return false;
        }
      }
    }
  }
  return true;
}

