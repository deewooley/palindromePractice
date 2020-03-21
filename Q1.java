public class Q1 {

    //Given a sentence such as "Cash rules everything around me".
    //Complete the method to count and return the number of words in the sentence. In this sentence there are a total of five words as seen below!
    //| Cash |  rules | everything | around |  me
    //|    1    |  2       |         3        |      4     |   5
    //Input
    // Cash rules everything around me
    //Output
    //5

    public static void main(String[] args) {
        cashRules("Cash rules everything around me dolla dolla bills yal.");
    }
    public static void cashRules(String sentence){
      char[] sentenceConvert = sentence.toCharArray();
      int counter =0;
      for(int i = 0; i<sentenceConvert.length; i++) {
          if(sentenceConvert[i]==' '){
              counter+= 1;
          }
      }
        System.out.println(counter+1);
    }
}
