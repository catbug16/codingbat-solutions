public int makeChocolate(int small, int big, int goal) {
  int numBig = Math.min(goal/5,big);
  int goalAft = goal - numBig*5;
  if (goalAft > small){
    return -1;
  }
  else{
    return goalAft;
  }
}

