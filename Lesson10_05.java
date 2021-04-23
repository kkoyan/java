class Lesson10_05{//条件分岐
    public static void main(String[] args){
        int age = 0;
        
        if (age >= 20) {//条件A
            System.out.println("adult");//条件Aを満たした時の処理
        } else if (age==0) {//条件B
            System.out.println("baby");//条件Bを満たした時の処理
        } else {
            System.out.println("child");//どちらの条件も満たさなかった時の処理
        }
    }
}
