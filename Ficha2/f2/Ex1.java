package f2;

import static java.lang.System.*;

public class Ex1
{
    public int minimo(int[] a){
        int i,menor = a[0];
        for (i = 1; i < a.length; i++){
            if (a[i] < menor) {
                menor = a[i];
            }
        }
        return menor;
    }

    public int[] entreI(int[] a, int inicio, int fim) {
        int length = fim-inicio;
        int[] aux = new int[length];
        arraycopy(a,inicio,aux,0,length);
        return aux;
    }
    /*
    public int[] elemIguais(int[] a,int[] b){
        int temp;
        int[] res = new int[];
        int indice = 0;
        for(int i = 0; i < a.length ; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    res[indice] = a[i];
                    indice++;
                }
            }
        }
    }
   */
}