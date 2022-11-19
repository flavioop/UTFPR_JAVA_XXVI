/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade01;

/**
 *
 * @author Flavio
 */
						
public class Veiculo extends Motor{
	
	private String placa = "";
	private String marca = "";
	private String modelo = "";
	private String cor = "";
	private float velocMax = 0;
	private float qtdRodas = 0; 
    Motor motor;
    
    
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getVelocMax() {
		return velocMax;
	}
	public void setVelocMax(float velocMax) {
		this.velocMax = velocMax;
	}
	public float getQtdRodas() {
		return qtdRodas;
	}
	public void setQtdRodas(float qtdRodas) {
		this.qtdRodas = qtdRodas;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
    
}

