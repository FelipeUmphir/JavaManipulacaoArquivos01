import javax.swing.*;
import java.io.*;

public class ClasseMetodos {
    public Estatistica[] FCadastrarEstatistica(Estatistica[] e) throws IOException {
    	
    	String fileName = "ArquivoEstatistica.txt";		
    	BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));	
    	  
    	for (int i = 0; i < e.length; i++) {	
    		e[i] = new Estatistica();
    		
    		e[i].ccidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da cidade:"));	    	    
    	    e[i].ncidade = JOptionPane.showInputDialog("Digite o nome da cidade:");	
    	    e[i].qacidente = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes:"));	
    	    
    	    writer.write(Integer.toString(e[i].ccidade) + "\n" + e[i].ncidade + "\n" + Integer.toString(e[i].qacidente));
    	    writer.newLine();
    	}	
    	
    	writer.close();	
    	
    	for (int i = 0; i < e.length; i++) {	
    		System.out.println(e[i].ccidade + ", " + e[i].ncidade + ", Acidentes: " + e[i].qacidente);	
    	}
    	
    	return e;
    }	
    
    public void PQtdAcidentes(Estatistica[] e) throws IOException {	
    	  
    	String fileName = "ArquivoEstatistica.txt";	  		
    	BufferedReader ler = new BufferedReader(new FileReader(fileName));	

    	for (int i = 0; i < e.length; i++) {
    		e[i] = new Estatistica();
    		
    		e[i].ccidade = Integer.parseInt(ler.readLine());  	
    		e[i].ncidade = ler.readLine();	
    		e[i].qacidente = Integer.parseInt(ler.readLine());	
    	}
    	
    	ler.close();
    	
    	for (int i = 0; i < e.length; i++) {
    		if (e[i].qacidente > 100 && e[i].qacidente < 500) {
    			System.out.println(e[i].ccidade + ", " + e[i].ncidade + ", Acidentes: " + e[i].qacidente);
    		}
    	}	
    }
    
    public void PMaiorMenor(Estatistica[] e) throws IOException {
    	
    	String fileName = "ArquivoEstatistica.txt";	  		
    	BufferedReader ler = new BufferedReader(new FileReader(fileName));

    	for (int i = 0; i < e.length; i++) {
    		e[i] = new Estatistica();
    		
    		e[i].ccidade = Integer.parseInt(ler.readLine());  	
    		e[i].ncidade = ler.readLine();	
    		e[i].qacidente = Integer.parseInt(ler.readLine());	
    		
    	}
    	
    	ler.close();
    	
    	int maior = e[0].qacidente, menor = e[0].qacidente;
    	int ma = 0, me = 0;

        for (int i = 1; i < e.length; i++) {
            if (e[i].qacidente > maior) {
                maior = e[i].qacidente;
                ma = i;
            }
            
            if (e[i].qacidente < menor) {
                menor = e[i].qacidente;
                me = i;
            }
        }
        
        System.out.println(e[ma].ccidade + ", " + e[ma].ncidade + ", Mais Acidentes: " + e[ma].qacidente);
        System.out.println(e[me].ccidade + ", " + e[me].ncidade + ", Menos Acidentes: " + e[me].qacidente);
    }
    
    public void PAcima(Estatistica[] e) throws IOException {
    	
    	String fileName = "ArquivoEstatistica.txt";	  		
    	BufferedReader ler = new BufferedReader(new FileReader(fileName));
    	int a = 0;

    	for (int i = 0; i < e.length; i++) {
    		e[i] = new Estatistica();
    		
    		e[i].ccidade = Integer.parseInt(ler.readLine());  	
    		e[i].ncidade = ler.readLine();	
    		e[i].qacidente = Integer.parseInt(ler.readLine());	
    		
    		a = a + e[i].qacidente;
    	}
    	
    	ler.close();
    	
    	a = a / e.length;
    	
    	for (int i = 0; i < e.length; i++) {
    		if (e[i].qacidente > a) {
    			System.out.println(e[i].ccidade + ", " + e[i].ncidade + ", Acidentes: " + e[i].qacidente);
     		}
    	}	
    }
}