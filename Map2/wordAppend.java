public String wordAppend(String[] strings) {
  String append="";
  Map<String,Integer> map = new HashMap<String,Integer>();
  for (int i=0; i<strings.length; i++){
    if (map.get(strings[i])!=null){
       map.put(strings[i],map.get(strings[i])+1);
    }
    else {
      map.put(strings[i],1);
    }
    for (int j=2; j<strings.length; j+=2){
      if (map.get(strings[i])==j){
        append+=strings[i];
      }
    }

  
  }
  return append;
  
}
