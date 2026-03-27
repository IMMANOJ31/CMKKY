package practice;

public class Prime {
    public static void main(String[] args) {
        int n = 7;
        boolean prime = true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        System.out.println(prime);
    }
}
