package com.ivanmontejano.IFCD0014_2026_02_HolaMundoSpringWS.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public static int sumar(int num1, int num2) {
        System.out.println("Gracias por usar Calculatron");
        return num1+num2;
    }
    public static float sumar(float num1, float num2) {
        System.out.println("Gracias por usar Calculatron");
        return num1+num2;
    }
    public static float restar(float num1, float num2) {
        System.out.println("Gracias por usar Calculatron");
        return num1-num2;
    }
    public static int restar(int num1, int num2) {
        System.out.println("Gracias por usar Calculatron");
        return num1-num2;
    }
    public static float multiplicar(float num1, float num2) {
        System.out.println("Gracias por usar Calculatron");
        return num1*num2;
    }
    public static int multiplicar(int num1, int num2) {
        System.out.println("Gracias por usar Calculatron");
        return num1*num2;
    }
    public static float dividir(float num1, float num2) {
        System.out.println("Gracias por usar Calculatron");
        return num1/num2;
    }



}
