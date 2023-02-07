package uscs;

import java.util.Arrays;

public class Aluno {
	public String nome;
	public int codmat;
	public String cpf;
	public char sexo;
	public double notaP1;
	public double notaP2;
	public double notaP3;
	
	public Aluno(String nome, int codmat, String cpf, char sexo, double notaP1, double notaP2, double notaP3) {
		
		this.nome = nome;
		this.codmat = codmat;
		this.cpf = cpf;
		this.sexo = sexo;
		this.notaP1 = notaP1;
		this.notaP2 = notaP2;
		this.notaP3 = notaP3;
	}
	public void imprime_Aluno() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Código de MAtrícula: " + this.codmat);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Nota P1: " + this.notaP1);
		System.out.println("Nota P2: " + this.notaP2);
		System.out.println("Nota P3: " + this.notaP3);
	}
	public void imprime_Sexo() {
		if (this.sexo == 'M')
			System.out.println("Masculino");
		else
			System.out.println("Feminino");
		
		System.out.println("Nome: " + this.nome);
	}
	public double Media_Aluno() {
		double[] tabNotas = new double [3];
		tabNotas[0] = this.notaP1;
		tabNotas[1] = this.notaP2;
		tabNotas[2] = this.notaP3;
		
		Arrays.parallelSort(tabNotas);
		return(tabNotas[1] + tabNOtas[2]/ 2.0);
		
	}
	
}
