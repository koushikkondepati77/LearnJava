package PrintingPatterns;
//0
//10
//101
//0101

public class ZeroOneTrianglePattern {
    public static void main(String[] args) {
        for(int i =0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print((i+j)%2 + " ");
            }
            System.out.println();
        }
    }
}
