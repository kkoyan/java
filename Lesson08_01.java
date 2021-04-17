class Lesson08_02{//宣言と代入を同時に記載するサンプル
    public static void main(String[] args){
        String[] arr = {"sato","suzuki","takahashi"}; //データ型[] 配列変数 ={データ１,データ２}
                        //データを３つ記載しているの、要素数の記載
        arr[1] = "tanaka";//インデックス番号を指定して記載
        
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
