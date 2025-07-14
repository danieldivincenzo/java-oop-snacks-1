package quiz;
public class DomandaQuiz {
    private String testo;
    private String rispostaCorretta;

    public DomandaQuiz(String testo, String rispostaCorretta){
        this.testo = testo;
        this.rispostaCorretta = rispostaCorretta;
    }

    public String getTesto(){
        return testo;
    }

    public boolean verificaRisposta(String rispostaUtente){
        return rispostaCorretta.equalsIgnoreCase(rispostaUtente);
    }

    public void stampaRisultato(String rispostaUtente){
        if(verificaRisposta(rispostaUtente)){
            System.out.println("Risposta esatta");
        }else{
            System.out.println("Risposta sbagliata. Quella corretta era: " + rispostaCorretta);
        }
    }
}
