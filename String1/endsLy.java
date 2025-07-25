public boolean endsLy(String str) {
  boolean ly=false;
  if (str.length()>1 && 
str.substring(str.length()-2,str.length()).equals("ly")){
    
    ly=true; }
  
  return ly;
}

