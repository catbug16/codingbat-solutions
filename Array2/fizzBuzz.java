public String[] fizzBuzz(int start, int end) {
  String[] nums = new String[end-start];
  int j=0;
  for (int i=start; i<end; i++){
    if (i%3==0 && i%5==0){
      nums[j]="FizzBuzz";
    }
    else if (i%3==0){
      nums[j]="Fizz";
    }
    else if(i%5==0){
      nums[j]="Buzz";
    }
    else{
      nums[j]=String.valueOf(i);
    }
    j+=1;
  }
  return nums;
}
