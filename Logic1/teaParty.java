public int teaParty(int tea, int candy) {
  int outcome=0;
  if (tea > 4 && candy > 4){
    outcome = 1;
    if ( tea >= candy*2 || candy>=tea*2 ){
      outcome = 2;
    }
  }
  return outcome;
}

