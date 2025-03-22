package br.com.fecaf.model;

import java.util.Scanner;

public class Circulo {
    public double raio, area , perimetro;
    //instacia de biblioteca = scanner
    //basicamente tenho que colocar isso quando quiser que alguem insira dados//
    Scanner scanner = new Scanner(System.in);
    /////////////////////////////coleta dados do terminal////////////////////////////////////////////////////////

    //cadastrar novo circulo
    //método
    public boolean cadastrarCirculo(){
        System.out.println("/*****************/");
        System.out.println("/* Cadastro */");
        System.out.println("/*****************/");
        System.out.println("Informe o raio do circulo : ");
        raio = scanner.nextDouble();
        System.out.println("Circulo cadastrado");
        System.out.println("/*****************/");
        return true;
    }
    public void calcularArea(){
        System.out.println("/Caculando Area");
        area = Math.PI * (raio*raio);
        System.out.println("A área do circulo é: " + area);


}
    public void calcularPerimetro(){
        System.out.println("O perimetro do circulo é : " + perimetro);
        perimetro = 2 * Math.PI*raio;
    }

}
