public int blackjack(int a, int b) {
  if (a>0 && a <=21 && b>0 && b <=21){
    return Math.max(a,b);
  }
  else if (a>0 && a <=21){
    return a;
  }
  else if (b>0 && b <=21){
    return b;
  }
  else {
    return 0;
  }
}

