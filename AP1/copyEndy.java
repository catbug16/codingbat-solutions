public int[] copyEndy(int[] nums, int count) {
  int[] endy = new int[count];
  int index = 0;

  for (int i = 0; i < nums.length; i++) {
    int n = nums[i];
    if ((n >= 0 && n <= 10) || (n >= 90 && n <= 100)) {
      if (index < count) {
        endy[index] = n;
        index++;
      }
    }
  }

  return endy;
}

