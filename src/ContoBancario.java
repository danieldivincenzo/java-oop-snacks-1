public class ContoBancario {
    private int numeroConto;
    private double saldo;

    public ContoBancario(int numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }

    public void prelevaDaConto(double importo){
        this.saldo = this.saldo - importo;
    }
}
