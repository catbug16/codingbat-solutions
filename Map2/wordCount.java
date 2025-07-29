public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for (int  i=0; i<strings.length; i++){
    if (map.get(strings[i])==null){
      int count = 1;
      for (int j=i+1; j<strings.length; j++){
        if (strings[j].equals(strings[i])){
          count+=1;
        }
      }
      map.put(strings[i],count);
    }
    
  }
  return map;
}
