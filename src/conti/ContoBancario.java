package conti;

public class ContoBancario {
    private String numeroConto;
    private double saldo;

    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }

    public void prelevaDaConto(double importo){
        if(importo >= 0 && importo <= saldo){
            this.saldo -= importo;
        }else {
            System.out.println("Impossibile prelevare una somma maggiore del saldo o un importo negativo");
        }
    }
    
    public void depositaInConto(double importo){
        if(importo >= 0){
            this.saldo += importo;
        }else {
            System.out.println("Impossibile depositare un importo negativo");
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public String getNumeroConto(){
        return numeroConto;
    }
}
