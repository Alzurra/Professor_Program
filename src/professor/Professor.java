package professor;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Professor {

	private static String nome;
	private static int idade;
	private static String cpf;
	private static String disciplina;
	private static String endereco;
	private static double horaAula;
	private static double salario;
	private static int op;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("\nQual classe de professor você deseja realizar o cálculo?" + "\n 1 - PROFESSOR"
				+ "\n 2 - PROFESSOR MENSALISTA" + "\n 3 - PROFESSOR HORISTA");

		op = input.nextInt();

		switch (op) {
		case 1:
			public void cadNome() {
				nome = JOptionPane.showInputDialog(null, "Por gentileza digite o seu nome: ");
				validar(1);
				JOptionPane.showMessageDialog(null, "Nome do Professor: " + nome);
			}

			public void cadIdade() {
				idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Por gentileza digite o ano do seu nascimento: "));
				validar(2);
				idade = (2020 - idade);
				JOptionPane.showMessageDialog(null, "A idade do Professor = " + idade + " anos");
			}

			public void cadCpf() {
				cpf = JOptionPane.showInputDialog(null, "\nXXX.XXX.XXX-XX" + "\nPor gentileza digite o seu CPF: ");
				validar(3);
				JOptionPane.showMessageDialog(null, "CPF do Professor: " + cpf);
			}

			public void cadDisciplina() {
				disciplina = JOptionPane.showInputDialog(null, "Por gentileza digite a disciplina que vocÃª leciona: ");
				validar(4);
				JOptionPane.showMessageDialog(null, "\nDISCIPLINA PROFESSOR" + "\nDisciplina do professor: " + disciplina);
			}

			public void cadEndereco() {
				endereco = JOptionPane.showInputDialog(null, "Por gentileza digite o seu endereÃ§o: ");
				validar(5);
				JOptionPane.showMessageDialog(null, "EndereÃ§o do professor: " + endereco);
			}

			public void cadSalario() {
				salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite por gentileza o seu salÃ¡rio: R$"));
				validar(6);
				JOptionPane.showMessageDialog(null, "O salÃ¡rio do professor " + nome + " Ã© = R$" + salario);
				double salario;
			}

			public void mostrar() {
				JOptionPane.showMessageDialog(null,
						"\nINFORMAÃ‡Ã•ES SOBRE O PROFESSOR " + "\nNOME DO PROFESSOR: " + nome + "\n CPF: " + cpf
								+ "\nDISCIPLINA DO PROFESSOR: " + disciplina + "\n ENDEREÃ‡O DO PROFESSOR: " + endereco
								+ "\n IDADE: " + idade + " anos" + "\n SAlÃ�RIO DO PROFESSOR: R$" + salario);
			}

			public void validar(int etapa) {
				switch (etapa) {
				case 1:
					while ("".equals(nome)) {
						nome = JOptionPane
								.showInputDialog("[O CAMPO NOME NÃ‚O PODE FICAR VAZIO!!]\n " + "\nDigite o seu nome: ");
					}
					break;
				case 2:
					while (idade <= 1000 || idade <= 1920) {
						idade = Integer
								.parseInt(JOptionPane.showInputDialog("[ANO INVÃ�LIDO - VALOR DEVE SER SUPERIOR A 1920!!]\n "
										+ "\nDigite o seu ano de nascimento: "));
					}
					break;
				case 3:
					while ("".equals(cpf)) {
						cpf = JOptionPane.showInputDialog(
								"\n[O CAMPO NOME NÃ‚O PODE FICAR VAZIO!!] " + "\nXXX.XXX.XXX-XX" + "\nDigite o seu CPF: ");
					}
					break;
				case 4:
					while ("".equals(disciplina)) {
						disciplina = JOptionPane
								.showInputDialog("[O CAMPO NOME NÃ‚O PODE FICAR VAZIO!!]\n " + "\nDigite a disciplina: ");
					}
					break;
				case 5:
					while ("".equals(endereco)) {
						endereco = JOptionPane
								.showInputDialog("[O CAMPO NOME NÃ‚O PODE FICAR VAZIO!!]\n " + "\nDigite o seu endereÃ§o: ");
					}
					break;
				case 6:
					while (salario <= 1045) {
						salario = Double.parseDouble(JOptionPane
								.showInputDialog("[O SALÃ�RIO NÃƒO PODE SER INFERIOR AO SALÃ�RIO MÃ�NIMO [R$1045,00] !!]\n "
										+ "\nDigite o salÃ¡rio novamente: "));
					}
					break;
				default:
					break;
				}
			}
			break;
		case 2:
			public void cadNome() {
		        nome = JOptionPane.showInputDialog(null, "Por gentileza digite o seu nome: ");
		        validar(1);
		        JOptionPane.showMessageDialog(null, "Nome do Professor: " + nome);
		    }

		    public void cadIdade() {
		        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Por gentileza digite o ano do seu nascimento: "));
		        validar(2);
		        idade = (2020 - idade);
		        JOptionPane.showMessageDialog(null, "A idade do Professor = " + idade + " anos");
		    }

		    public void cadCpf() {
		        cpf = JOptionPane.showInputDialog(null, "\nXXX.XXX.XXX-XX" + "\nPor gentileza digite o seu CPF: ");
		        validar(3);
		        JOptionPane.showMessageDialog(null, "CPF do Professor: " + cpf);
		    }

		    public void cadDisciplina() {
		        disciplina = JOptionPane.showInputDialog(null, "Por gentileza digite a disciplina que vocÃª leciona: ");
		        validar(4);
		        JOptionPane.showMessageDialog(null, "\nDISCIPLINA PROFESSOR"  + "\nDisciplina do professor: " + disciplina);
		    }

		    public void cadEndereco() {
		        endereco = JOptionPane.showInputDialog(null, "Por gentileza digite o seu endereÃ§o: ");
		        validar(5);
		        JOptionPane.showMessageDialog(null, "EndereÃ§o do professor: " + endereco);
		    }

		    public void cadSalario() {
		        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite por gentileza o seu salÃ¡rio: R$"));
		        validar(6);
		        JOptionPane.showMessageDialog(null, "O salÃ¡rio do professor " + nome + " Ã© = R$" + salario);
		        double salario;
		    }

		    public void calcular_salario(double salario) {
		        if (salario > 0) {
		            salario += salario * 0.08;//Soma 8% ao salario
		        }
		    }

		    public void mostrar() {
		        JOptionPane.showMessageDialog(null, "\nINFORMAÃ‡Ã•ES SOBRE O PROFESSOR MENSALISTA " + "\nNOME DO PROFESSOR: " + nome +   
		                 "\n CPF: " + cpf + "\nDISCIPLINA DO PROFESSOR: " + disciplina + "\n ENDEREÃ‡O DO PROFESSOR: " + endereco + "\n IDADE: " + idade + " anos"
		                + "\n SAlÃ�RIO DO PROFESSOR COM REAJUSTE DE 8%: R$" + salario);
		    }

		    @Override
		    public void validar(int etapa) {
		        switch (etapa) {
		            case 1:
		                while ("".equals(nome)) {
		                    nome = JOptionPane.showInputDialog("[O CAMPO NOME NÃ‚O PODE FICAR VAZIO!!]\n " + "\nDigite o seu nome: ");
		                }
		                break;
		            case 2:
		               while (idade <= 1000 || idade <= 1920) {
		                    idade = Integer.parseInt(JOptionPane.showInputDialog("[ANO INVÃ�LIDO - VALOR DEVE SER SUPERIOR A 1920!!]\n " + "\nDigite o seu ano de nascimento: "));
		                }
		                break;
		            case 3:
		                  while ("".equals(cpf)) {
		                    cpf = JOptionPane.showInputDialog("\n[O CAMPO NOME NÃ‚O PODE FICAR VAZIO!!] " + "\nXXX.XXX.XXX-XX" + "\nDigite o seu CPF: ");
		                }
		                break;
		            case 4:
		               while ("".equals(disciplina)) {
		                    disciplina = JOptionPane.showInputDialog("[O CAMPO NOME NÃ‚O PODE FICAR VAZIO!!]\n " + "\nDigite a disciplina: ");
		                }
		                break;
		            case 5:
		              while ("".equals(endereco)) {
		                    endereco = JOptionPane.showInputDialog("[O CAMPO NOME NÃ‚O PODE FICAR VAZIO!!]\n " + "\nDigite o seu endereÃ§o: ");
		                }
		                break;
		            case 6:
		                while (salario <= 1045) {
		                    salario = Double.parseDouble(JOptionPane.showInputDialog("[O SALÃ�RIO NÃƒO PODE SER INFERIOR AO SALÃ�RIO MÃ�NIMO [R$1045,00] !!]\n " + "\nDigite o salÃ¡rio novamente: "));
		                }
		                break;
		            default:
		                break;
		        }         
		    }
		    
			break;
		case 3:
			Override
		    public void cadNome() {
		        nome = JOptionPane.showInputDialog(null, "Por gentileza digite o seu nome: ");
		        validar(1);
		        JOptionPane.showMessageDialog(null, "Nome do Professor: " + nome);
		    }

		    public void cadIdade() {
		        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Por gentileza digite o ano do seu nascimento: "));
		        validar(2);
		        idade = (2020 - idade);
		        JOptionPane.showMessageDialog(null, "A idade do Professor = " + idade + " anos");
		    }
		    

		    public void cadCpf() {
		        cpf = JOptionPane.showInputDialog(null, "\nXXX.XXX.XXX-XX" + "\nPor gentileza digite o seu CPF: ");
		        validar(3);
		        JOptionPane.showMessageDialog(null, "CPF do Professor: " + cpf);
		    }


		    public void cadDisciplina() {
		        disciplina = JOptionPane.showInputDialog(null, "Por gentileza digite a disciplina que vocÃª leciona: ");
		        validar(4);
		        JOptionPane.showMessageDialog(null, "\nDISCIPLINA PROFESSOR" + "\nDisciplina do professor: " + disciplina);
		    }


		    public void cadEndereco() {
		        endereco = JOptionPane.showInputDialog(null, "Por gentileza digite o seu endereÃ§o: ");
		        validar(5);
		        JOptionPane.showMessageDialog(null, "EndereÃ§o do professor: " + endereco);
		    }

		    public void cadHoraAula() {
		        horaAula = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite por gentileza as suas horas de aula: "));
		        validar(6);
		        JOptionPane.showMessageDialog(null, "Hora(s) Aula do Professor: " + horaAula);
		    }

		    @Override
		    public void cadSalario() {
		        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite por gentileza o seu salÃ¡rio: R$"));
		        validar(7);
		        JOptionPane.showMessageDialog(null, "O salÃ¡rio do professor " + nome + " Ã© = R$" + salario);
		        double salario;
		    }

		    public void calcular_hora_aula(double salario) {
		        if (horaAula > 0) {
		            horaAula = horaAula * 20;
		            salario = salario + horaAula;//Soma 8% ao salario
		        }
		    }

		    public void mostrar() {
		        JOptionPane.showMessageDialog(null, "\nINFORMAÃ‡Ã•ES SOBRE O PROFESSOR HORISTA " + "\nNOME DO PROFESSOR: " + nome
		                + "\n CPF: " + cpf + "\nDISCIPLINA DO PROFESSOR: " + disciplina + "\n ENDEREÃ‡O DO PROFESSOR: " + endereco + "\n IDADE: " + idade + " anos"
		                + "\n SAlÃ�RIO DO PROFESSOR + HORA AULA: R$" + salario);
		    }

		    public void validar(int etapa) {
		        switch (etapa) {
		            case 1:
		                while ("".equals(nome)) {
		                    nome = JOptionPane.showInputDialog("[O CAMPO NOME NÃ‚O PODE FICAR VAZIO!!]\n " + "\nDigite o seu nome: ");
		                }
		                break;
		            case 2:
		                while (idade <= 1000 || idade <= 1920) {
		                    idade = Integer.parseInt(JOptionPane.showInputDialog("[ANO INVÃ�LIDO - VALOR DEVE SER SUPERIOR A 1920!!]\n " + "\nDigite o seu ano de nascimento: "));
		                }
		                break;
		            case 3:
		                while ("".equals(cpf)) {
		                    cpf = JOptionPane.showInputDialog("\n[O CAMPO NOME NÃ‚O PODE FICAR VAZIO!!] " + "\nXXX.XXX.XXX-XX" + "\nDigite o seu CPF: ");
		                }
		                break;
		            case 4:
		                while ("".equals(disciplina)) {
		                    disciplina = JOptionPane.showInputDialog("[O CAMPO NOME NÃ‚O PODE FICAR VAZIO!!]\n " + "\nDigite a disciplina: ");
		                }
		                break;
		            case 5:
		                while ("".equals(endereco)) {
		                    endereco = JOptionPane.showInputDialog("[O CAMPO NOME NÃ‚O PODE FICAR VAZIO!!]\n " + "\nDigite o seu endereÃ§o: ");
		                }
		                break;
		            case 6:
		                while (horaAula <= 0) {
		                    salario = Double.parseDouble(JOptionPane.showInputDialog("[A Hora Aula deve ser superior a 0!!]\n " + "\nDigite a Hora Aula novamente: "));
		                }
		                break;
		            case 7:
		                while (salario <= 1045) {
		                    salario = Double.parseDouble(JOptionPane.showInputDialog("[O SALÃ�RIO NÃƒO PODE SER INFERIOR AO SALÃ�RIO MÃ�NIMO [R$1045,00] !!]\n " + "\nDigite o salÃ¡rio novamente: "));
		                }
		                break;
		            default:
		                break;
		        }
		    }
			break;
		default:
			break;
		}
	}

}
