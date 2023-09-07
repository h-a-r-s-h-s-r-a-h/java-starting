package multiplication;

public class Table {
    void multable(int n){
        for(int i=1; i<=10; i++){
            System.out.printf("%d * %d = %d",n,i,n*i).println();
        }
    }
    void multable(int n, int from, int to){
        for(int i=from; i<=to; i++){
            System.out.printf("%d * %d = %d ",n,i,n*i);
        }
    }
}
