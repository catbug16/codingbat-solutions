public String deFront(String str) {  
  String a= "";
  String b= "";
  if (str.substring(0,1).equals("a") || str.substring(0,1).equals("A")){
    a = str.substring(0,1);
  }
  if (str.substring(1,2).equals("b") || str.substring(1,2).equals("B")){
    b = str.substring(1,2);
  }
   String defront= a + b + str.substring(2,str.length());
  return defront;
}
