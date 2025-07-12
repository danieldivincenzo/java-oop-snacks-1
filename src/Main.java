public class Main {
    public static void main(String[] args) {
       /*  Studente studente1 = new Studente("Marco", "Rossi", 20);
        System.out.println(studente1.concatStudente());
 */

        ContoBancario conto1 = new ContoBancario(123456789);
        System.out.println(conto1.getSaldo());
        System.out.println(conto1.getNumeroConto());
        
        System.out.println("");

        conto1.prelevaDaConto(10);
        System.out.println(conto1.getSaldo());

        System.out.println("");

        conto1.depositaInConto(100);
        System.out.println(conto1.getSaldo());

    }
}
