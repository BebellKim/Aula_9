package Aula_9;

public class Atividade_2 {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();

		pessoa1.setNome("Tom Cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereco("California,USA");
		pessoa1.setProfissao("Ator");
		pessoa1.setCPF("CPFFF");
		pessoa1.setRG("RGGGG");


		pessoa2.setNome("Tom Cruise");
		pessoa2.setIdade(35);
		pessoa2.setEndereco("Miami,USA");
		pessoa2.setProfissao("Jogador de futebol");
		pessoa2.setCPF("CPFFF");
		pessoa2.setRG("RGGGG");


		System.out.println("                 Objeto 1           ");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());
		System.out.println(pessoa1.getCPF());
		System.out.println(pessoa1.getRG());
		


		System.out.println("                 Objeto 2            ");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
		System.out.println(pessoa2.getCPF());
		System.out.println(pessoa2.getRG());


	}

}
