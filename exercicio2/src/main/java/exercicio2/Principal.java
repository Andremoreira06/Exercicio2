package exercicio2;

import exercicio2.DAO;

import java.util.*;

import exercicio2.Carro;

public class Principal {
	public static Scanner sc = new Scanner(System.in);

	public static void ListarCarros(DAO dao) {
		Carro[] carros = dao.getCarros();
		carros = dao.getCarros();
		for (int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}
	}

	public static void InserirCarros(DAO dao) {
		int id, ano;
		String nome, marca;
		System.out.println("Entre com o id do carro:");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Entre com o nome do carro:");
		nome = sc.nextLine();
		System.out.println("Entre com a marca do carro:");
		marca = sc.nextLine();
		System.out.println("Entre com o ano do carro:");
		ano = sc.nextInt();
		Carro carro = new Carro(id, nome, marca, ano);
		try {
			if (dao.inserirCarro(carro) == true) {
				System.out.println("Inserção com sucesso -> " + carro.toString());
			}
		} catch (Exception e) {
			System.out.println(
					"Ja existe um carro com esse id, e nao foi possivel inserie ele, tente novamente com outro id");
		}

	}

	public static void ExcluirCarros(DAO dao) {
		int id;
		System.out.println("Entre com o id do carro a ser excluido:");
		id = sc.nextInt();
		dao.excluirCarro(id);
	}

	public static void AtualizarCarros(DAO dao) throws Exception {
		int id;
		System.out.println("Entre com o id do carro a ser atualizado:");
		id = sc.nextInt();
		Carro carro = new Carro();
		try {

			carro = dao.getCarrosById(id);
			System.out.println(carro.toString());
		} catch (Exception e) {
			throw new Exception("Nao existe carro com esse id");

		}
		try {
		System.out.println("Qual parametro deseja atualizar?");
		System.out.println("Digite 1 para id");
		System.out.println("Digite 2 para nome");
		System.out.println("Digite 3 para marca");
		System.out.println("Digite 4 para ano");
		System.out.println("Digite qualquer outra coisa para sair");
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Digite o novo valor para o id");
			int nextid = sc.nextInt();
			carro.setId(nextid);
			break;
		case 2:
			System.out.println("Digite o novo valor para o nome");
			String nextnome = sc.nextLine();
			carro.setNome(nextnome);
			break;
		case 3:
			System.out.println("Digite o novo valor para a marca");
			String nextmarca = sc.nextLine();
			carro.setMarca(nextmarca);
			break;
		case 4:
			System.out.println("Digite o novo valor para o ano");
			int nextano = sc.nextInt();
			carro.setAno(nextano);
			break;
		}
		}catch(Exception e) {
			throw new Exception("Parametro invalido");
		}
	}

	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.conectar();
		int opcao;
		try {
			do {
			System.out.println("Entre com uma opção entre 1 e 5:");
			System.out.println("1)Listar");
			System.out.println("2)Inserir");
			System.out.println("3)Excluir");
			System.out.println("4)Atualizar");
			System.out.println("5)Sair");
			opcao = sc.nextInt();
				
			
			switch (opcao) {
			case 1:
				ListarCarros(dao);
				break;
			case 2:
				InserirCarros(dao);
				break;
			case 3:
				ExcluirCarros(dao);
				break;
			case 4:
				try {
					AtualizarCarros(dao);
				} catch (Exception e) {
					System.out.println(e);
				}
				break;
			case 5:

				break;
			}
		} while (opcao != 5);
		}catch(Exception e) {
			System.out.println("Parametro invalido");
		}
		dao.close();
	}
}