public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  Map<String,Boolean> mapb = new HashMap<String, Boolean>();
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
  for (int k=0; k<strings.length; k++){
    if (map.get(strings[k])>=2){
      mapb.put(strings[k],true);
    }
    else{
       mapb.put(strings[k],false);
    }
  }
  
  return mapb;
}

