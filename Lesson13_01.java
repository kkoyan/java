public class Lesson13_01{
  public static void main(String[] args){

  Student a001 = new Student();//　インスタンス化　クラス名　オブジェクト名（この場合学籍番号）
  a001.name = "sato";//フィールド名にsatoを代入。代入方法はオブジェクト名の後にピリオドフィールド名
  System.out.println(a001.name);
  a001.calculateAvg(90,80);

  Student a002 = new Student();
  a002.name = "suzuki";
  System.out.println(a002.name);
  a002.calculateAvg(70,80);

  }
}

class Student{//class名は必ず大文字
  String name = "sato";//フィールド

  public void calculateAvg(int math,int english) {
  System.out.println((math + english)/2);
  }
}



// 通常、上にあるクラスがメインクラス(main()があり、実行できるクラス)とJavaさんが解釈する仕様
// そのため、上のクラスにmain(String[] args)がないと、Javaさんとしてはおかしい という結果になってしまっている

// クラスは一度定義しておくと後からいくらでもオブジェクトを作ることができる（コピペのイメージ）