public List wordsWithoutList(String[] words, int len) {
   List<String> str = new ArrayList<>();
   for (int i=0; i<words.length; i++){
     String strin= words[i];
     if (strin.length()!=len){
       str.add(strin);
     }
   }
   return str;
}

