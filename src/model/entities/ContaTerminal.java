package model.entities;

import java.util.Objects;
import application.Program;

public class ContaTerminal {
private String agencia;
private int numero;
private int senha;
private int confsenha;
private String nome; 
private Double saldo;


public ContaTerminal(String agencia, int numero, int senha, int confsenha, String nome, Double saldo) throws Exception {

	this.agencia = agencia;
	this.numero = numero;
	this.senha = senha;
	this.confsenha = confsenha;
	this.nome = nome;
	this.saldo = saldo;
	
}
public String getAgencia() {
	return agencia;
}
public void setAgencia(String agencia) {
	this.agencia = agencia;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public int getSenha() {
	return senha;
}
public void setSenha(int senha) {
	this.senha = senha;
}
public int getConfsenha() {
	return confsenha;
}
public void setConfsenha(int confsenha) {
	this.confsenha = confsenha;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Double getSaldo() {
	return saldo;
}
public void setSaldo(Double saldo) {
	this.saldo = saldo;
} 




}
