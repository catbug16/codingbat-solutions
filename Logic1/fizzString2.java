public String fizzString2(int n) {
  String num="";
  if ( n % 3 == 0 && n % 5 == 0 ){
    num = "FizzBuzz!";
  }
  else if ( n % 3 == 0 ){
    num = "Fizz!";
  }
  else if ( n % 5 == 0 ){
    num = "Buzz!";
  }
  else {
    num = Integer.toString(n)+"!";
  }
  return num;
}

