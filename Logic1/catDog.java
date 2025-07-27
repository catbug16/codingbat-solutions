public boolean catDog(String str) {
  int countc=0;
  int countd=0;
  boolean eql= false;
  if (str.length()>2){
    for (int i=0; i<str.length()-2; i++){
      if (str.substring(i,i+3).equals("cat")){
        countc += 1;
        
      }
      if (str.substring(i,i+3).equals("dog")){
        countd += 1;
      } 
    }
    
  }
  if ( countc == countd ){
    eql= true;
  }
  return eql;
}
