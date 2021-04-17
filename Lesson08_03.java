class Lesson08_04{//2次元配列(ロッカーのイメージ)の宣言と代入を別々に記載するサンプル
    public static void main(String[] args){
        String[][] arr; //データ型[][] 配列変数名;
        arr = new String[2][2]; //配列変数名 = new データ型[要素数];

        arr[0][0]="sato";
        arr[0][1]="suzuki";
        arr[1][0]="takahashi";
        arr[1][1]="tanaka";

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
    }
}
