class Lesson08_01{//宣言と代入を別々に記載するサンプル
    public static void main(String[] args){
        String[] arr; //データ型[] 配列変数名;
        arr = new String[3]; //配列変数名 = new データ型[要素数];

        arr[0]="sato";
        arr[1]="suzuki";
        arr[2]="takahashi";

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
