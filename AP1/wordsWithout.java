public String[] wordsWithout(String[] words, String target) {
  int count=0;
  for (int i=0; i<words.length; i++){
    if (words[i].equals(target)){
      count++;
    }
  }
  int len = words.length - count;
  String[] str = new String[len];
  int index = 0;
  for (int j=0; j<words.length; j++){
    if (!words[j].equals(target)){
      str[index]=words[j];
      index++;
    }
  }
  return str;
}

