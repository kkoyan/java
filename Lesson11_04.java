class Lesson11_04{//繰り返し for文の中にforを入れる（ネスト）
  public static void main(String[] args){
    
    for(int i = 0; i <= 2; i ++) {//外側の処理
      for(int j = 0; j <= 2; j ++) {//内側の処理
        System.out.println( i + "-" + j );
      }
    }
  }
}
//外側の処理を１回行い、内側の処理を２回繰り返し外側の２回目に戻る