public Map<String, String> mapAB4(Map<String, String> map) {
  String aword = map.get("a");
  String bword = map.get("b");
  if (map.get("a")!=null & map.get("b")!=null){
    if (aword.length()>bword.length()){
    map.put("c",aword);
  }
  else if (aword.length()==bword.length()){
    map.put("a","");
    map.put("b","");
  }
  else {
    map.put("c",bword);
  }
  }
  return map;
}

