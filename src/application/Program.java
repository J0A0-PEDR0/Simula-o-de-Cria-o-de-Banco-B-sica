package application;

import java.util.Scanner;

import model.entities.ContaTerminal;

public class Program {
	public static void main (String [] args) throws Exception {
		
Scanner sc = new Scanner(System.in);
System.out.println("Olá Obrigado por iniciar o processo de criaruma conta no banco CHUVA");
System.out.println("Por favor insira os dados abaixo.");
System.out.println("Nome Completo: " );
String nome = sc.next();
System.out.print("Digite O número da Conta: ");
int numero = sc.nextInt();
 System.out.println("Digite o número da agência no modelo XXX-X: ");
String agencia = sc.next();
System.out.println("Digite Sua senha apenas com números:");
int senha = sc.nextInt();
System.out.println("Confirme Sua senha:");
int confsenha = sc.nextInt();
if(confsenha != senha) {
	throw new Exception("A Confirmação da sua Senha falhou, volte e tente novamente");
}
System.out.println("Digite o Valor do Saldo que Será Depositado: ");
Double saldo = sc.nextDouble();
ContaTerminal ct = new ContaTerminal(agencia, numero, senha, confsenha, nome, saldo);
System.out.println("Parabéns você completou o processo de Criação de aqui está seus dados: "  );
System.out.println("Nome: " + ct.getNome());
System.out.println("Número da Conta: " + ct.getNumero());
System.out.println("Agência: " + ct.getAgencia());
		}
}
