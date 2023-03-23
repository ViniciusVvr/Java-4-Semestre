package Pacoteatv;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		
		//declarar variaveis
			
		String nomeAluno;
		String sexoAluno;
		String nomeProfessor;
		String sexoProfessor;
		String nomeCurso;
		String nomeDiciplina;
		double nota1;
		double nota2;
		double nota3;
		double nota4;		
		double notaTotal;
		double notaExame = 0;
		
		//instaciar scanner
			Scanner entradaDados = new Scanner(System.in);
		
		//entrada de dados pelo usuario
			System.out.println("Olá, digite o nome do aluno... ");
			nomeAluno = entradaDados.next();
			
			System.out.println("Agora digite o genero do aluno( 'M' ou 'F'... ");
			sexoAluno = entradaDados.next();
			
			if(!sexoAluno.equals("M") && !sexoAluno.equals("F")) {
				System.out.println("Voce digitou um genêro desconhecido, por favor digite um genêro valido! ('M' ou 'F')");
				sexoAluno = entradaDados.next();
			}
			
			System.out.println("Agora digite o nome do professor... ");
			nomeProfessor = entradaDados.next();
			
			System.out.println("Agora digite o genero do professor( 'M' ou 'F'... ");
			sexoProfessor = entradaDados.next();
			
			if(!sexoProfessor.equals("M") && !sexoProfessor.equals("F")) {
				System.out.println("Voce digitou um genêro desconhecido, por favor digite um genêro valido! ('M' ou 'F')");
				sexoProfessor = entradaDados.next();
			}
			
			System.out.println("Agora digite o nome do curso... ");
			nomeCurso = entradaDados.next();
			
			System.out.println("Agora digite a diciplina... ");
			nomeDiciplina = entradaDados.next();
			
				System.out.println("Digite a nota número um");
				nota1 = entradaDados.nextDouble();
				if(nota1 > 100 || nota1 < 0) {
					System.out.println("As notas devem estar entre 1 e 100, o valor da primeira nota está incorreto");
					System.out.println("Digite novamente a nota número um");
					nota1 = entradaDados.nextDouble();
					}
			
					System.out.println("Digite a nota número dois");
					nota2 = entradaDados.nextDouble();
					if(nota2 > 100 || nota2 < 0) {
						System.out.println("As notas devem estar entre 1 e 100, o valor da segunda nota está incorreto");
						System.out.println("Digite novamente a nota número dois");
						nota2 = entradaDados.nextDouble();
						}
			
						System.out.println("Digite a nota número tres");
						nota3 = entradaDados.nextDouble();
						if(nota3 > 100 || nota3 < 0) {
							System.out.println("As notas devem estar entre 1 e 100, o valor da terceira nota está incorreto");
							System.out.println("Digite novamente a nota número tres");
							nota3 = entradaDados.nextDouble();
						}
			
							System.out.println("Digite a nota número quatro");
							nota4 = entradaDados.nextDouble();
							if(nota4 > 100 || nota4 < 0) {
								System.out.println("As notas devem estar entre 1 e 100, o valor da quarta nota está incorreto");
								System.out.println("Digite novamente a nota número quatro");
								nota4 = entradaDados.nextDouble();
						}
			
				
				notaTotal = (nota1 + nota2 + nota3 + nota4) / 4;
				
			// condição de aprovação
				String aprovacao = "";
				
				if(notaTotal > 70) {
					aprovacao = "aprovado";
				}else if(notaTotal < 50) {
					aprovacao = "reprovado";
					
				}else if(notaTotal >= 50 && notaTotal <= 69) {
					aprovacao = "exame";
					System.out.println("Digite a nota do exame, Por favor");
					notaExame = entradaDados.nextDouble();
					
				}
				
				double notaFinalComExame = (notaTotal + notaExame)/2;
				
				
				if(notaFinalComExame > 60) {
					aprovacao = "Aprovado";
				}else if(notaFinalComExame <= 60) {
					aprovacao = "Reprovado";
				}
				
				String Alunao;
				
				if(sexoAluno.equals("M")) {
					Alunao = "O aluno ";
				}else {
					Alunao = "A aluno ";
				}
				
				String Prof;
				
				if(sexoProfessor.equals("M")) {
					Prof = "O professor ";
				}else {
					Prof = "A professora ";
				}
				
				
				//textao
				
				System.out.println(
						Alunao+nomeAluno+" Foi "+aprovacao+" na diciplina "+nomeDiciplina+".");
				System.out.println("Curso: "+nomeCurso);
				System.out.println(Prof+" do curso chamasse: "+nomeProfessor);
				System.out.println("Notas do aluno: "+nota1+", "+nota2+", "+nota3+", "+nota4+", "+notaExame);
				
				if(notaExame == 0) {
					System.out.println("Média Final: "+notaTotal);
					
					System.out.println("O aluno passou sem necessitar do Exame!");
				}else {
					System.out.println("Média Final: "+notaFinalComExame);
					System.out.println("Média final do exame: "+notaExame);
				}			
					}
						}		
			
	
