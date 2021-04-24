class Lesson11_03{//繰り返し iに１ずつ代入し条件に当てはまったらスキップする
  public static void main(String[] args){
    
    for(int i = 0; i <= 4; i ++) {//for(スタート値;継続条件;増減式)
      if(i==3){
        continue;//条件に合わせて処理をスキップする。
      }
      System.out.println(i);
    }
  }
}
