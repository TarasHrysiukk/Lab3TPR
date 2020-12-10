package BordMethod;

import com.company.Main;

public class BordMethod  extends Main {
    public static void bord(){
    int a=0, b=0, c=0 ;
    int sumB =0,sumA = 0,sumC=0;
        for (int i = 0; i < A.length; i++) {
            if (A[i][0] == 'A') {
                sumA += N[i]*3;
                if (A[i][1] == 'B'){
                    sumB += N[i]*2;
                    sumC += N[i]*1;
                }else {
                    sumC += N[i]*2;
                    sumB += N[i]*1;
                }
            }
            else if (A[i][0] == 'B'){
                sumB += N[i]*3;
                if (A[i][1] == 'C'){
                    sumC += N[i]*2;
                    sumA += N[i]*1;
                }else {
                    sumA += N[i]*2;
                    sumC += N[i]*1;

                }

            }
            else if (A[i][0] == 'C'){
                sumC += N[i]*3;
                if (A[i][1] == 'B'){
                    sumB += N[i]*2;
                    sumA += N[i]*1;
                }else {
                    sumA += N[i]*2;
                    sumB += N[i]*1;
                }
            }
        }
        int maxAB = Math.max(sumA,sumB);
        int maxABC = Math.max(maxAB,sumC);
        System.out.println("");
        System.out.println("-----------------Bord-----------------");
        System.out.println("\tA набрав  = " + sumA);
        System.out.println("\tB набрав  = " + sumB);
        System.out.println("\tC набрав  = " + sumC);
        System.out.println(" Перемагає С , набравши "+maxABC+"голосів");
        
    }
}
