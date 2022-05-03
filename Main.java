import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int SelecaoTexto(){
        int selecao;
        while(true){
            try{
                System.out.println("1\t\t=>\t\tCadastrar nova Pessoa\n" +
                        "2\t\t=>\t\tCadastrar novo Produto\n" +
                        "3\t\t=>\t\tCadastrar novo Animal\n" +
                        "4\t\t=>\t\tChecar qual é a pessoa mais velha\n" +
                        "5\t\t=>\t\tChecar qual é a pessoa mais pesada\n" +
                        "6\t\t=>\t\tMostrar todas as Pessoas\n" +
                        "7\t\t=>\t\tMostrar todos os Animais\n" +
                        "8\t\t=>\t\tMostrar todos os Produtos\n" +
                        "0\t\t=>\t\tFECHA O PROGRAMA\n\n");

                System.out.print("Digite sua opção: ");
                selecao = new Scanner(System.in).nextInt();

                if (selecao < 0) {
                    System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                    continue;
                } else if (selecao > 8) {
                    System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                    continue;
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                continue;
            }
        }
        return selecao;

    }

    public static void main(String[] args) {
        System.out.println("Atividade SENAI 3/5/2022 - Exercício 1 Orientação a Objetos - Curso: Desenvolvedor Java Vespertino\n\n");

        List<Pessoa> pessoas = new ArrayList<>();
        List<Produto> produtos = new ArrayList<>();
        List<Animal> animais = new ArrayList<>();

        String nome,especie;
        Double peso, altura,preco_venda,preco_custo;
        int idade,quant_patas;

        Boolean run = true;
        while(run){
            int selecionado = SelecaoTexto();

            switch (selecionado) {
                case 1:
                    System.out.print("\n\nNome da nova Pessoa: ");
                    nome = new Scanner(System.in).nextLine();
                    System.out.print("\n\nPeso da nova Pessoa: ");
                    peso = new Scanner(System.in).nextDouble();
                    System.out.print("\n\nAltura da nova Pessoa: ");
                    altura = new Scanner(System.in).nextDouble();
                    System.out.print("\n\nIdade da nova Pessoa: ");
                    idade = new Scanner(System.in).nextInt();

                    pessoas.add(new Pessoa(nome,peso,altura,idade));
                    System.out.println("\n\nPESSOA CADASTRADA COM SUCESSO!\n\n");
                    continue;

                case 2:
                    System.out.print("\n\nNome do novo Produto: ");
                    nome = new Scanner(System.in).nextLine();
                    System.out.print("\n\nPreço de custo do novo Produto: ");
                    preco_custo = new Scanner(System.in).nextDouble();
                    System.out.print("\n\nPreço de venda do novo Produto: ");
                    preco_venda = new Scanner(System.in).nextDouble();

                    produtos.add(new Produto(nome,preco_venda,preco_custo));
                    System.out.println("\n\nPRODUTO CADASTRADO COM SUCESSO!\n\n");
                    continue;

                case 3:
                    System.out.print("\n\nNome do novo Animal: ");
                    nome = new Scanner(System.in).nextLine();
                    System.out.print("\n\nQuantidade de patas do novo Animal: ");
                    quant_patas = new Scanner(System.in).nextInt();
                    System.out.print("\n\nEspecie do novo Animal: ");
                    especie = new Scanner(System.in).nextLine();

                    animais.add(new Animal(nome,quant_patas,especie));
                    System.out.println("\n\nANIMAL CADASTRADO COM SUCESSO!\n\n");
                    continue;

                case 4:

                    if(!pessoas.isEmpty()){
                        Pessoa pessoa_velha = null;
                        int maior_idade = 0;

                        for(Pessoa p : pessoas){
                            if(p.getIdade() >= maior_idade){
                                pessoa_velha = p;
                                maior_idade = p.getIdade();
                            }
                        }

                        System.out.println("\n=====");
                        System.out.println("PESSOA MAIS VELHA:");
                        System.out.println("Nome = "+pessoa_velha.getNome());
                        System.out.println("Altura = "+pessoa_velha.getAltura());
                        System.out.println("Idade = "+pessoa_velha.getIdade());
                        System.out.println("Peso = "+pessoa_velha.getPeso());
                        System.out.println("=====\n");
                    }else{
                        System.out.println("\n\nCADASTRE UMA PESSOA ANTES DE RODAR ESSA OPÇÃO!\n\n");
                    }

                    continue;

                case 5:
                    if(!pessoas.isEmpty()){
                        Pessoa pessoa_pesada = null;
                        Double maior_peso = 0.0;

                        for(Pessoa p : pessoas){
                            if(p.getIdade() >= maior_peso){
                                pessoa_pesada = p;
                                maior_peso = p.getPeso();
                            }
                        }

                        System.out.println("\n=====");
                        System.out.println("PESSOA MAIS PESADA:");
                        System.out.println("Nome = "+pessoa_pesada.getNome());
                        System.out.println("Altura = "+pessoa_pesada.getAltura());
                        System.out.println("Idade = "+pessoa_pesada.getIdade());
                        System.out.println("Peso = "+pessoa_pesada.getPeso());
                        System.out.println("=====\n");
                    }else{
                        System.out.println("\n\nCADASTRE UMA PESSOA ANTES DE RODAR ESSA OPÇÃO!\n\n");
                    }

                    continue;

                case 6:

                    if(!pessoas.isEmpty()){
                        for(Pessoa p : pessoas){
                            System.out.println("\n=====");
                            System.out.println("Nome = "+p.getNome());
                            System.out.println("Altura = "+p.getAltura());
                            System.out.println("Idade = "+p.getIdade());
                            System.out.println("Peso = "+p.getPeso());
                            System.out.println("=====\n");
                        }
                    }else{
                        System.out.println("\n\nCADASTRE UMA PESSOA ANTES DE RODAR ESSA OPÇÃO!\n\n");
                    }

                    continue;

                case 7:

                    if(!animais.isEmpty()) {
                        for (Animal a : animais) {
                            System.out.println("\n=====");
                            System.out.println("Nome = " + a.getNome());
                            System.out.println("Quantidade de patas = " + a.getQuant_patas());
                            System.out.println("Especie = " + a.getEspecie());
                            System.out.println("=====\n");
                        }
                    }else{
                        System.out.println("\n\nCADASTRE UM ANIMAL ANTES DE RODAR ESSA OPÇÃO!\n\n");
                    }
                    continue;

                case 8:

                    if(!produtos.isEmpty()) {
                        for (Produto p : produtos) {
                            System.out.println("\n=====");
                            System.out.println("Nome = " + p.getNome());
                            System.out.println("Preço de custo = " + p.getPreco_custo());
                            System.out.println("Preço de venda = " + p.getPreco_venda());
                            System.out.println("=====\n");
                        }
                    }else{
                        System.out.println("\n\nCADASTRE UM PRODUTO ANTES DE RODAR ESSA OPÇÃO!\n\n");
                    }
                    continue;

                case 0:
                    run = false;
                    break;
            }

        }
    }
}
