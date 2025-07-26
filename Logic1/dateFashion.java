public int dateFashion(int you, int date) {
  int result=1;
  if (you >7 ||date >7){
    result = 2;
  }
  if (you <3 || date <3){
    result = 0;
  }
  return result;
}
