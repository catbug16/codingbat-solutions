public int scoresAverage(int[] scores) {
 
  int avg1= scoresAverage(scores, 0, scores.length/2);
  int avg2= scoresAverage(scores, scores.length/2, scores.length);
  
  return Math.max(avg1, avg2);

}
 public int scoresAverage(int[] scores, int start, int end){
    int sum=0;
    for (int i=start; i<end; i++){
      sum +=scores[i];
    }
    int average= sum/(end-start);
      return average;
  }
  
