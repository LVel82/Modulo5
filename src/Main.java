import models.Produto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(" --- PEDIDO DE VENDAS ---");
        int option;
        do {
            System.out.println("1 - Cadastrar Produto");
            System.out.println("0 - Sair");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Qual operação você deseja realizar?");
            option = scanner.nextInt();
            process(option);
        }
        while ((option != 0));
    }


    public static void process (int option) throws Exception {
        switch (option) {
            case 1: {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Qual a descrição deseja dar ao novo produto: ");
                String descricao = scanner.nextLine();

                System.out.print("Qual ID você deseja dar ao novo produto: ");
                int id = scanner.nextInt();

                System.out.print("Qual o preço do produto: ");
                double preco = scanner.nextDouble();

                System.out.print("Qual a data de validade: ");
                String dataString = scanner.next();

                Date dataValidade = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
                Produto novoProduto = new Produto(id, descricao, preco, dataValidade);

                System.out.println("Produto criado com sucesso!");
                System.out.println("---ID: " + novoProduto.getId());
                System.out.println("---DESCRIÇÃO: " + novoProduto.getDescricao());
                System.out.println("---PREÇO: " + novoProduto.getPreco());
                System.out.println("---VALIDADE: "+ novoProduto.getDataValidade());
                System.out.println("----------------------------------");

            }
        }
    }
}


