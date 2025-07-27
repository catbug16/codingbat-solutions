public boolean endOther(String a, String b) {
  String al= a.toLowerCase();
  String bl = b.toLowerCase();
  boolean end = false;
  if (a.length()>b.length()){
    if (al.substring(a.length()-b.length(),a.length()).equals(bl)){
    end = true;
  }
  }
  else {
    if (bl.substring(b.length()-a.length(),b.length()).equals(al)){
    end = true;
  }
  }
  return end;
}

