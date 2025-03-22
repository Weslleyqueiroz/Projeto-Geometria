package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {
    public double area, base, lado2, lado3, perimetro, altura;

    Scanner scanner = new Scanner(System.in);

    //Cadastrando o triangulo//
    public boolean cadastrarTriangulo() {
        System.out.println("*/********************/*");
        System.out.println("/* Cadastrar triângulo  /*");
        System.out.println("*/********************/*");
        System.out.println(" Informe o lado 1: ");
        base = scanner.nextDouble();
        System.out.println(" Informe o lado 2");
        lado2 = scanner.nextDouble();
        System.out.println(" Informe o lado 3");
        lado3 = scanner.nextDouble();
        System.out.println("Informe a altura");
        altura = scanner.nextDouble();
        System.out.println("*/Triângulo Cadastrado/*");
        System.out.println("*/********************/*");

        return true;
    }

    //Calculando a área do triangulo//
    public void calcularAreaTriangulo() {
        System.out.println("*/********************/*");
        System.out.println("Calculando a área : ");
        System.out.println("*/********************/*");
        area = (base * altura) / 2;
        System.out.println("A área é : " + area);
        System.out.println("*/********************/*");
    }

    //Calculando o perimetro do triangulo//
    public void calcularPerimetroTriangulo() {
        System.out.println("*/********************/*");
        System.out.println(" Calculando perímetro ");
        perimetro = base + lado2 + lado3;
        System.out.println("O perímetro é : " + perimetro);

    }

    //Definindo o tipo de triangulo: isoceles //escaleno//esquilatero//
    public void definirTipo() {
        System.out.println("Analisando qual é o tipo do triângulo...");
        if (base == lado2 && base == lado3) {
            System.out.println("O triângulo é equilátero");
        } else if (base == lado2 || lado2 == lado3 || base == lado3) {
            System.out.println("o triângulo é isóceles");

        } else {
            System.out.println("O triângulo é escaleno");
        }
        if (trianguloRetangulo(base,lado2,lado3)){
            System.out.println("O triângulo é um triângulo retângulo!");
        }else {
            System.out.println("O triângulo NÃO é um triângulo retângulo.");
        }
    }
    //como o VerificarTrianguloRetangulo está void, eu tive que chamar ele de novo mas dentro desse IF
    //Ai com isso ele verifica os tipos de triangulos escaleno e etc e depois verifica se  é um triangulo retangulo

    //fiz um método pra verificar se é triangulo retangulo com base na HIPOTENUSA, coloquei como se a hipotenusa
    // fosse C, B ou A
    public boolean trianguloRetangulo(double a, double b, double c) {
        return (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a);
    }


    //Aqui criei um método para verificar se é triangulo retangulo mas como é void ele não retorna um valor
    public  void verificarTrianguloRetangulo() {
        if (trianguloRetangulo(base, lado2, lado3)) {
            System.out.println("O triângulo é um triângulo retângulo!");
        } else {
            System.out.println("O triângulo NÃO é um triângulo retângulo.");
        }
    }
}




// to-do - triangulo retangulo = c2+c2 =h2
//criar metodo para definir se é um triangulo retangulo
//informar se o triangulo é um 3,4,5










