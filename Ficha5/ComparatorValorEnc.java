
/**
 * Write a description of class ComparatorValorEnc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Comparator;

public class ComparatorValorEnc implements Comparator<EncEficiente>
{
    public int compare(EncEficiente e1, EncEficiente e2){
        if(e1.calculaValorTotal() < e2.calculaValorTotal()) return 1;
        if(e1.calculaValorTotal() > e2.calculaValorTotal()) return -1;
        else return 0;
    }
}
