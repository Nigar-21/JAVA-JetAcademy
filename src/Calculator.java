public class Calculator {
     private int doubleNumber(int n){
         return n * 2;
     }
     public int tripleNumber(int n){
         return n*3;
     }
     public int privDouble(int n){
         return doubleNumber(n);
     }

    public int add(int a,int b){
        return  a+b;
    }
    public int subtract(int a, int b){
        if(a>b){
            return a-b;
        }else{
            return b-a;
        }
    }
}
