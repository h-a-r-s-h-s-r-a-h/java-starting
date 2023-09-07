package allinone;

public class Allinone {
    void table(int a){
        for(int i=1; i<=10; i++){
            System.out.printf("%d * %d = %d",a,i,a*i).println();
        }
    }
    void addition(int a, int b){
        System.out.printf("%d + %d = %d",a,b,a+b).println();
    }
    void multiplication(int a, int b){
        System.out.printf("%d * %d = %d",a,b,a*b).println();
    }
    public static void main(String[] args){
        Allinone Definite = new Allinone();
        Definite.table(5);
        Definite.addition(3, 4);
        Definite.multiplication(7,8);
    }
}
