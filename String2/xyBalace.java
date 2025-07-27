public boolean xyBalance(String str) {
 boolean xy=true;
 int n=-1;
 for (int i=0; i<str.length(); i++){
   if (str.substring(i,i+1).equals("x")){
     n=0;
     for (int j=i+1; j<str.length(); j++){
       if (str.substring(j,j+1).equals("y")){
         n=-1;
         break;
       }
     }
   }
 }
 if (n==0){
   xy = false;
 }
 return xy;
}

