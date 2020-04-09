package practice;

public class Sum {
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.execute();
    }

    void execute() {
        outputSum(1,2);
        outputSum(2,22);
        outputSum(3,10);
    }

    //メソッド(処理のブロック)
    //メソッド名：outputSum
    //ちょっと遊んでみる
    void outputSum(int numberA,int numberB){
        //System.out.println(numberA + numberB);
        System.out.println(sum(numberA,numberB));
    }

    //int型の戻り値がある（足した結果を返す）
    int sum(int numberA,int numberB){
        return numberA + numberB;
    }
}
