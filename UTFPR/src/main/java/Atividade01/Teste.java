package Atividade01;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
			
	 Scanner entrada = new Scanner(System.in);
		
		Veiculo carro = new Veiculo();
		String [] carros = new String [5] ;
		
		for(int i = 0; i< carros.length; i++) {
                    
                    System.out.println("Digite a placa do veiculo N°: " + i);
                    carros[i] = entrada.nextLine();					
                    carro.setPlaca(carros);					

                    System.out.println("Digite a marca do veiculo N°: " + i);
                    carros[i] = entrada.nextLine();
                    carro.setMarca(carros);	

                    System.out.println("Digite a modelo do veiculo N°: " + i);
                    carros[i] = entrada.nextLine();
                    carro.setModelo(carros);

                    System.out.println("Digite a cor do veiculo N°: " + i);
                    carros[i] = entrada.nextLine();
                    carro.setCor(carros);

                    System.out.println("Digite a velocidade máxima do veiculo N°: " + i);
                    carros[i]= entrada.nextLine();
                    carro.getVelocMax();

                    System.out.println("Digite a quantidade de rodas do veiculo N°: " + i);
                    carros[i]= entrada.nextLine();
                    carro.getQtdRodas();

                    System.out.println("Digite a quantidade de pistões no motor do veiculo N°: " + i);
                    carros[i] = entrada.nextLine();
                    carro.getQtdPist();

                    System.out.println("Digite a potencia do veiculo N°: " + i);
                    carros[i]= entrada.nextLine();
                    carro.getPotencia();

                }
		
		carro.imprimir();    	
			
    }
}      
