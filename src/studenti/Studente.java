package studenti;

public class Studente {
    private String nome;
    private String cognome;
    private int eta;

    public Studente(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }
    
    public String concatStudente(){
        return nome + " " + cognome + ", " + eta + " anni ";
    }
}
