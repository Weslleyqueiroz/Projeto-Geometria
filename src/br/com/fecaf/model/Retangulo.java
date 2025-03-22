package br.com.fecaf.model;

import java.util.Scanner;

public class Retangulo {
    public double lado1, lado2, area, perimetro;

    Scanner scanner = new Scanner(System.in);


    public boolean cadastrarRetangulo(){
        System.out.println("/*****************/");
        System.out.println("/* Cadastrar retângulo */");
        System.out.println("/*****************/");
        System.out.println("Informe o lado 1 : ");
        lado1 = scanner.nextDouble();
        System.out.println("Informe o lado 2 : ");
        lado2 = scanner.nextDouble();
        System.out.println(" Retângulo cadastrado! ");
        System.out.println("/*****************/");
        return true;
    }
    public void calcularAreaRetangulo(){
        System.out.println(" Calculando Area ");
        area = lado1*lado2;
        System.out.println("A área é : "+ area);

    }
    public void calcularPerimetro(){
        System.out.println(" Calculando o perimetro ");
        perimetro = lado1+lado2;
        System.out.println("O perimetro é : " + perimetro);
    }
    public void definirQuadrado(){
        if (lado1==lado2){
            System.out.println("é um quadrado");
        }else {
            System.out.println("Não é um quadrado");
        }
    }
}
// to-do - triangulo retangulo = c2+c2 =h2
//fazer o menu do triangulo
//criar metodo para definir se é um triangulo retangulo
//comentar codigo
//informar se o triangulo é um 3,4,5