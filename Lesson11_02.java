class Lesson11_02{//繰り返し iに１ずつ代入し条件に当てはまったら処理を中止する
  public static void main(String[] args){
    
    for(int i = 0; i <= 4; i ++) {//for(スタート値;継続条件;増減式)
      if(i==3){
        break;//条件に合わせて処理を中止する。
      }
      System.out.println(i);
    }
  }
}
