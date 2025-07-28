public Map<String, String> topping1(Map<String, String> map) {
  map.put("bread","butter");
  if (map.get("ice cream")!=null){
    map.put("ice cream","cherry");
  }
  return map;
}
