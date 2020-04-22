
/**
 * Write a description of class Ex1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
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
}