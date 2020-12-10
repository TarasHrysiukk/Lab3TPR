package CondorsMethod;
import  com.company.*;

public class CondorsMethod extends Main{
    Main main = new Main();

    public static void condors(){
        int nAB = 0, nAC = 0, nBA = 0, nBC = 0, nCA = 0, nCB = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i][0] == 'A') {
                if (A[i][1] == 'B') {
                    nAB += N[i];
                    nBC += N[i];
                    nAC += N[i];
                } else {
                    nAC += N[i];
                    nAB += N[i];
                    nCB += N[i];
                }
            } else if (A[i][0] == 'B') {
                if (A[i][1] == 'A') {
                    nBA += N[i];
                    nAC += N[i];
                    nBC += N[i];
                } else {
                    nBC += N[i];
                    nBA += N[i];
                    nCA += N[i];
                }
            } else if (A[i][0] == 'C') {
                if (A[i][1] == 'A') {
                    nCA += N[i];
                    nAB += N[i];
                    nCB += N[i];
                } else {
                    nCB += N[i];
                    nCA += N[i];
                    nBA += N[i];
                }
            }
        }

        int maxAB = Math.max(nAB,nBA);
        int maxBC = Math.max(nCB,nBC);
        int maxAC = Math.max(nCA,nAC);
        int maxAB_BC = Math.max(maxAB,maxBC);
        int maxBC_AC = Math.max(maxBC,maxAC);

        System.out.println("-----------------Kondorse-----------------");
        System.out.println("\tA перемагає B  = " + nAB);
        System.out.println("\tB перемагає A  = " + nBA);
        System.out.println("\tA перемагає C  = " + nAC);
        System.out.println("\tC перемагає A = " + nCA);
        System.out.println("\tB перемагає C = " + nBC);
        System.out.println("\tC перемагає B = " + nCB);
        System.out.println("переміг С , набравши "+maxBC_AC+" голосів");
        //return maxBC_AC;

    }

}