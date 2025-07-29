public boolean loneTeen(int a, int b) {
  if ( 13<= a && a<= 19 && b>19 || b<13){
    return true;
  }
   if ( 13<= b && b<= 19 && a>19 || a<13){
    return true;
  }
  return false;
}

