public class Estatistica {
	
    int ccidade;
    String ncidade;
    int qacidente;
    
    Estatistica() {
        this(0, "", 0);
    }
    
    Estatistica( 
    int CodigoCidade, 
    String NomeCidade,
    int QtdAcidentes) {
    	
        ccidade = CodigoCidade;
        ncidade = NomeCidade;
        qacidente = QtdAcidentes;
    }
}