public boolean cigarParty(int cigars, boolean isWeekend) {
  boolean isok=false;
  if (40<=cigars && cigars<=60 && isWeekend == false){
    isok = true;
  }
  else if (cigars>=40 && isWeekend == true){
    isok = true;
  }
  return isok;
}

