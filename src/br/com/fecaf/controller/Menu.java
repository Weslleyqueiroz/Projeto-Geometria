package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    public static void executarMenu() {
        boolean exit = false;

        //Instanciando todos meus objetos
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();
        Triangulo triangulo = new Triangulo();

        //validandos os cadastros das minhas classes
        boolean validaCadastroCirculo = false;
        boolean validaCadastroRetangulo = false;
        boolean validaCadastroTriangulo = false;

        //iniciando as estruturas de repetição de cada classe
        while (!exit) {
            System.out.println("*/********************/*");
            System.out.println("/*    Geometria    /*");
            System.out.println("*/********************/*");
            System.out.println("/* 1 - Circulo   /*");
            System.out.println("/* 2 - Retângulo   /*");
            System.out.println("/* 3 - Triângulo   /*");
            System.out.println("/* 4 -   Sair      /*");
            System.out.println("*/********************/*");

            System.out.println("Informe a opção desejada");

            int optionUser = scanner.nextInt();

            //se o usuario escolher a primeira opção: Vai escolher cadastrar o circulo//
            switch (optionUser) {
                case 1:
                    boolean exitCirculo = false;
                    while (!exitCirculo) {
                        System.out.println("*/********************/*");
                        System.out.println("/**** Circulo ****/ ");
                        System.out.println("*/********************/*");
                        System.out.println("*/ 1 - Cadastrar Circulo /*");
                        System.out.println("*/ 2 - Calcular área /*");
                        System.out.println("*/ 3 - Calcular perimetro /*");
                        System.out.println("*/ 4 -       Sair         /*");
                        System.out.println("Informe a opção desejada: ");
                        int optionCirculo = scanner.nextInt();

                        switch (optionCirculo) {
                            case 1:
                                validaCadastroCirculo = circulo.cadastrarCirculo();
                                break;
                            case 2:
                                if (validaCadastroCirculo) {
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um circulo: ");
                                }
                                break;
                            case 3:
                                if (validaCadastroCirculo) {
                                    circulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um circulo");
                                }
                                break;
                            case 4:
                                System.out.println("Saindo do circulo");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida");
                        }
                    }
                    break;
                //Caso ele escolha a segunda : Vai escolher cadastrar o retangulo//
                case 2:
                    boolean exitRetangulo = false;
                    while (!exitRetangulo) {
                        System.out.println("*/********************/*");
                        System.out.println("/**** Retângulo ****/ ");
                        System.out.println("*/********************/*");
                        System.out.println("*/ 1 - Cadastrar Retângulo /*");
                        System.out.println("*/ 2 - Calcular área /*");
                        System.out.println("*/ 3 - Calcular perimetro /*");
                        System.out.println("*/ 4 -       Sair         /*");
                        System.out.println("Informe a opção desejada: ");
                        int optionRetangulo = scanner.nextInt();

                        switch (optionRetangulo) {
                            case 1:
                                validaCadastroRetangulo = retangulo.cadastrarRetangulo();
                                break;
                            case 2:
                                if (validaCadastroRetangulo) {
                                    retangulo.calcularAreaRetangulo();
                                } else {
                                    System.out.println("Calcule um retângulo!");
                                }
                                break;
                            case 3:
                                if (validaCadastroRetangulo) {
                                    retangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Calcule o perimetro do retângulo!");
                                }
                                break;
                            case 4:
                                System.out.println("Saindo do retângulo");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida");
                        }
                    }
                    break;
                //Caso ele escolha a terceira : Vai escolher cadastrar o triangulo//

                case 3:
                    boolean exitTriangulo = false;
                    while (!exitTriangulo) {
                        System.out.println("*/********************/*");
                        System.out.println("/**** Triângulo ****/ ");
                        System.out.println("*/********************/*");
                        System.out.println("*/ 1 - Cadastrar Triângulo /*");
                        System.out.println("*/ 2 - Calcular área /*");
                        System.out.println("*/ 3 - Calcular perimetro /*");
                        System.out.println("*  4 -/Definir o tipo do triângulo/*");
                        System.out.println("*/ 5 -       Sair         /*");
                        System.out.println("Informe a opção desejada: ");
                        int optionTriangulo = scanner.nextInt();

                        //aqui ocorre meio que as opções que o usuário escolher do objeto e em seguida calcula ou cadastra
                        switch (optionTriangulo) {
                            case 1:
                                validaCadastroTriangulo = triangulo.cadastrarTriangulo();
                                break;
                            case 2:
                                if (validaCadastroTriangulo) {
                                    triangulo.calcularAreaTriangulo();
                                } else {
                                    System.out.println("Calcule a área : ");
                                }
                                break;
                            case 3:
                                if (validaCadastroTriangulo) {
                                    triangulo.calcularPerimetroTriangulo();
                                } else {
                                    System.out.println("Calcule o perimetro");
                                }
                                break;
                            case 4:
                                if (validaCadastroTriangulo) {
                                    triangulo.definirTipo();
                                }else {
                                    System.out.println("Cadastre um triângulo");
                                }
                                break;
                            case 5:
                                if (validaCadastroTriangulo){
                                    triangulo.verificarTrianguloRetangulo();

                                }else{
                                    System.out.println("Cadastre o triangulo:");
                                }
                                System.out.println("Saindo do triângulo");
                                exitTriangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida");
                        }
                        //no caso 5 eu fiz essa opção a "mais" para encaixar essa verificação do triangulo
                    }
                    break;

                case 4:
                    exit = true;
                    System.out.println("Escolheu o 4 - Saindo...");
                    break;

                default:
                    System.out.println("Escolha uma opção válida");
            }
        }

    }

}
