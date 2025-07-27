public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  int sum = die1 + die2;
  if ( noDoubles == true ){
    if (die1 == die2 ){
      sum +=1;
      if (die1 == 6){
         sum -=6;
      }
    }
  }
  return sum;
}

