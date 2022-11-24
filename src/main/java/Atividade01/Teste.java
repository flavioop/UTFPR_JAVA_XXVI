/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Atividade01;

/**
 *
 * @author Flavio
 */
import java.util.Scanner;

/**
 *
 * @author Flavio
 */
public class Teste extends Veiculo {
    
 	public static void main(String[] args) {
            
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Informe a quantidade de veiculos, entre 1 e 5");
            
            int qtdVeiculos = entrada.nextInt();
            
            if(qtdVeiculos > 5){
                System.out.println("Por favor, informar um valor válido, entre 1 e 5");  
            }
            
            Veiculo carro = new Veiculo();
            
            
            for (int i = 0; i < qtdVeiculos ; i++) {
	            	 
	               	    System.out.println("Digite a placa do veiculo N°: " + i);
	            	    String placa = entrada.next();
	            	    carro.setPlaca(placa);
	            	    
	            	    System.out.println("Digite a marca do veiculo N°: " + i);
	            	    String marca = entrada.next();
	            	    carro.setMarca(marca);
	                    
	                    System.out.println("Digite o modelo do veiculo N°: " + i);
	            	    String modelo = entrada.next();
	            	    carro.setModelo(modelo);
	                    
	                    System.out.println("Digite a cor do veiculo N°: " + i);
	            	    String cor = entrada.next();
	            	    carro.setCor(cor);
	                    
	                    System.out.println("Digite a velocidade maxima do veiculo N°: " + i);
	            	    float velocMax = entrada.nextFloat();
	            	    carro.setVelocMax(velocMax);
                                           	 	                
	                    System.out.println("Digite a quantidade de rodas do veiculo N°: " + i);
	                    int qtdRodas = entrada.nextInt();
	                    carro.setQtdRodas(qtdRodas);
	                                	 
                            System.out.println("Digite a quantidade de pistões do motor do veiculo N°: " + i);
	                    int qtdPist = entrada.nextInt();
                            carro.setQtdPist(qtdPist);
	                    
	                    System.out.println("Digite a potencia do motor do veiculo N°: " + i);
	                    int potencia = entrada.nextInt();                                                       
	                    carro.setPotencia(potencia);
            }   
            
            
        }
}