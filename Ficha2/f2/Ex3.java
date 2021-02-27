package f2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Ex3
{
    private LocalDate[] dates;

    public Ex3(LocalDate[] dates)
    {
        this.dates = dates;
    }

    public void insereData(LocalDate data)
    {
        int i = 0;
        for(; i < dates.length; i++)
        dates[i] = data;
    }

    public LocalDate dataMaisProxima(LocalDate data){
        LocalDate menor = dates[0];
        long diff = ChronoUnit.DAYS.between(data,menor),
             temp;

        for(int i = 1; i < dates.length; i++){
            if((temp = ChronoUnit.DAYS.between(data,dates[i])) < diff){
                diff = temp;
                menor = dates[i];
            }
        }
        return menor;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        String res = "";
        for(LocalDate data : dates)
            sb.append(data).append("");
        return sb.toString();
    }
}
