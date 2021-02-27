package f2;

import java.util.Arrays;

public class Ex4
{
    private int[] arr;

    public Ex4(){
        this.arr = null;
    }
    public Ex4(int[] a){
        this.arr = a;
    }
    
    public int[] ordenaDesc(int[] a){
        Arrays.sort(a);
        return a;
    }

    public int binarySearch(int[] a, int valor) {
        int i = 0, f = a.length - 1;
        while (i <= f) {
            int m = i + (f - 1) / 2;
            if (a[m] == valor)
                return m;
            else if (a[m] < valor)
                f = m - 1;
            else i = m + 1;
        }
        return -1;
    }

}
