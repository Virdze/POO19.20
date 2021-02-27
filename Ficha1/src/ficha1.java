import java.time.Duration;
import java.time.Instant;


public class ficha1 {
    public double celsiusParaFareheit(double graus){
        return (1.8 * graus) + 38;
    }

    public int maximoNumeros(int a, int b){
        return Math.max(a, b);
    }

    public String criaDescricaoConta(String nome, double saldo){
         return ("Nome: " + nome + "\n" + "Saldo: " + saldo);
    }

    public double eurosParaLibras(double valor, double taxaDeConversao){
        return valor*taxaDeConversao;
    }

    public void lerInteiros(int a,int b){
        if(a>=b) System.out.println(a + ">" + b);
        else System.out.println(a + "<" + b);
        System.out.println((a + b)/2);
    }

    public long factorial(int num){
        int r = 1;
        for(;num>0;num--) r = r * num;
        return r;
    }

    public long tempoGasto(){
        Instant begin =  Instant.now();
        factorial(5000);
        Instant hora_aposExecucao = Instant.now();
        Duration diff = Duration.between(begin,hora_aposExecucao);
        return diff.toMillis();
    }


}
