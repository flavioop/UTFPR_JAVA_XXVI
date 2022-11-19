/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade01;

import java.util.Scanner;

/**
 *
 * @author Flavio
 */
public class Teste extends Veiculo {
    
 	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int veiculos = entrada.nextInt();
 		System.out.println("teste2");

		Veiculo [] carros = new Veiculo [veiculos] ;
 		System.out.println("teste2");

		for(int i = 0; i< veiculos; i++) {
		        
			    System.out.println("Digite a placa do veiculo N°: " + i);
			    String placa = entrada.next();
	            carros[i].setPlaca(placa);
	                  	            
	            System.out.println("Digite a marca do veiculo N°: " + i);
			    String marca = entrada.next();
	            carros[i].setMarca(marca);
	            
	            System.out.println("Digite a modelo do veiculo N°: " + i);
			    String modelo = entrada.next();
	            carros[i].setMarca(modelo);
	            
	            System.out.println("Digite a modelo do veiculo N°: " + i);
			    String cor = entrada.next();
	            carros[i].setCor(cor);        	            
	            
	            System.out.println("Digite a placa do veiculo N°: " + i);
			    float velocMax = entrada.nextFloat();
	            carros[i].setVelocMax(velocMax);
	            
	            System.out.println("Digite a modelo do veiculo N°: " + i);
			    float qtdRodas = entrada.nextFloat();
	            carros[i].setQtdRodas(qtdRodas);
	            
		}
			
    }
}