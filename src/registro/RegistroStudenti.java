package registro;

import studenti.Studente;

public class RegistroStudenti {
    private Studente[] registro;

    private int numStudenti;

    public RegistroStudenti(){
        registro = new Studente[3];
    }

    public RegistroStudenti(int numStudenti){
        this();
        this.numStudenti = numStudenti;
    }

    public void aggiungiStudente(Studente studente){
        if(numStudenti < registro.length) {
            registro[numStudenti] = studente;
            numStudenti++;
        }
    }

    public void stampaRegistro(){
        for (int i = 0; i < registro.length; i++) {
            if(registro[i] != null){
                
                System.out.println(registro[i].concatStudente());
            }
        }
    }
    
}
