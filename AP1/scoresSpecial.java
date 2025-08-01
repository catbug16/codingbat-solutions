public int scoresSpecial(int[] a, int[] b) {
  int sum = special(a)+special(b);
  return sum;
}

public int special(int[] a){
  int max=0;
  for (int num : a){
    if (num%10==0){
      max = Math.max(max, num);
    }
  }
  return max;
} 

