public String fizzString(String str) {
  if (str.substring(str.length()-1,str.length()).equals("b") && 
str.substring(0,1).equals("f")){
    str = "FizzBuzz";
  }
  else if (str.substring(0,1).equals("f")){
    str = "Fizz";
  }
  else if (str.substring(str.length()-1,str.length()).equals("b")){
    str = "Buzz";
  }
  return str;
}

