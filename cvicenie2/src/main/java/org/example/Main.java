package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getZodiacSign(); // Without date validation
//        defineAndPopulateArray();
//        defineAndInitializeArray();
//        sortArray();
//        init2dArray();
//        calcDeterminant();
    }

    //-------------------------------------------------------------------------------------------------
    // 2.1 Úloha: Základná syntax 2
    //-------------------------------------------------------------------------------------------------
    /*
        Vytvorte program, ktorý vypíše na obrazovku znamenie v horoskope.
        Vstupom do programu je váš dátum narodenia (deň a mesiac) a výstupom je výpis znamenia na obrazovku.
    */

    public static void getZodiacSign() {
        Scanner sc = new Scanner(System.in);
        int day = 1, mesiac = 1;
        System.out.println("Tvoje narodeniny vo formate DD MM: ");
        day = sc.nextInt();
        mesiac = sc.nextInt();
        String zodiac = determineZodiacSign(day, mesiac);
        System.out.println("Tvoje znamienko je: " + zodiac);
    }

    public static String determineZodiacSign(int day, int mesiac) {
        switch (mesiac) {
            case 1:
                if (day < 21) {
                    return "Kozorozec";
                }
                return "Vodnar";
            case 2:
                if (day < 20) {
                    return "Vodnar";
                }
                return "Ryby";
            case 3:
                if (day < 21) {
                    return "Ryby";
                }
                return "Baran";
            case 4:
                if (day < 21) {
                    return "Baran";
                }
                return "Byk";
            case 5:
                if (day < 22) {
                    return "Byk";
                }
                return "Blizenci";
            case 6:
                if (day < 22) {
                    return "Blizenci";
                }
                return "Rak";
            case 7:
                if (day < 23) {
                    return "Rak";
                }
                return "Lev";
            case 8:
                if (day < 24) {
                    return "Lev";
                }
                return "Panna";
            case 9:
                if (day < 24) {
                    return "Panna";
                }
                return "Vahy";
            case 10:
                if (day < 24) {
                    return "Vahy";
                }
                return "Skorpion";
            case 11:
                if (day < 23) {
                    return "Skorpion";
                }
                return "Strelec";
            case 12:
                if (day < 22) {
                    return "Strelec";
                }
                return "Kozorozec";
            default:
                return "Nespravny Format Datumu! Skus este raz";
        }
    }

    //-------------------------------------------------------------------------------------------------
    // 2.2 Úloha: Definovanie a naplnenie poľa
    //-------------------------------------------------------------------------------------------------
    /*
        Napíšte krátky program, na ktorom sa naučíte pracovať s poľom:
            - Definujte jednorozmerné pole celých čísel ľubovoľnej veľkosti.
            - Naplňte celé pole číslami zadanými z klávesnice.
            - Overte si správnosť načítaných hodnôt pomocou výpisu na obrazovku.
    */

    public static void defineAndPopulateArray() {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        System.out.println("Zadaj velkost pola: ");
        size = sc.nextInt();

        int[] pole = new int[size];

        for (int i = 0; i < pole.length; i++) {
            System.out.println("Zadaj " + (i + 1) + ". cislo: ");
            pole[i] = sc.nextInt();
        }

        System.out.println("Zadane cisla: ");
        for (int i = 0; i < pole.length; i++) {
            System.out.print(pole[i] + " ");
        }
    }

    //-------------------------------------------------------------------------------------------------
    // 2.3 Úloha: Inicializácia poľa
    //-------------------------------------------------------------------------------------------------
    /*
        Napíšte krátky program, na ktorom sa naučíte inicializovať novovytvorené pole:
            - Inicializujte jednorozmerné pole pevne danými hodnotami.
            - Overte si správnosť inicializačných hodnôt pomocou výpisu na obrazovku podobne
            ako v úlohe 2.2.
    */

    public static void defineAndInitializeArray() {
        int[] pole = {1, 2, 3, 4, 5};
        for (int i = 0; i < pole.length; i++) {
            System.out.println(pole[i] + " ");
        }
    }

    //-------------------------------------------------------------------------------------------------
    // 2.4 Úloha: Zoradenie poľa čísel
    //-------------------------------------------------------------------------------------------------
    /*
        Využite skúsenosti z predchádzajúcej úlohy a vytvorte program, ktorý zoradí pole čísel:
            - Inicializujte alebo zadajte do poľa celé čísla.
            - Použite ľubovoľný algoritmus na zatriedenie poľa od najmenšieho po najväčšie číslo.
    */

    public static void sortArray() {
        int[] pole = {1, 5, 7, 3, 6};
        bubbleSort(pole, pole.length);
        for (int i = 0; i < pole.length; i++) {
            System.out.print(pole[i] + " ");
        }
    }

    static void bubbleSort(int[] arr, int n) {
        if (n == 1) return;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSort(arr, n - 1);
    }

    //-------------------------------------------------------------------------------------------------
    // 2.5 Úloha: Definovanie a naplnenie dvojrozmerného poľa
    //-------------------------------------------------------------------------------------------------
    /*
        Postupujte podľa bodov z úlohy 2.2, 2.3.
        Prispôsobte program pre použitie 2-rozmerného poľa celých čísel.
    */

    public static int[][] init2dArray() {
        int[][] pole2d = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < pole2d.length; i++) {
            for (int j = 0; j < pole2d[i].length; j++) {
                System.out.println("Zadaj prvok na pozicii - " + (i + 1) + " riadok a " + (j + 1) + " stlpec:");
                pole2d[i][j] = sc.nextInt();
            }
        }
        System.out.println("Zadana matica: ");
        for (int i = 0; i < pole2d.length; i++) {
            for (int j = 0; j < pole2d[i].length; j++) {
                System.out.print(pole2d[i][j] + " ");
            }
            System.out.println();
        }
        return pole2d;
    }

    //-------------------------------------------------------------------------------------------------
    // 2.6 Úloha: Výpočet determinantu štvorcovej matice 3x3
    //-------------------------------------------------------------------------------------------------
    /*
        Využite skúsenosti z úlohy 4 na naplnenie 2-rozmerného poľa celých čísel.
    */
    public static void calcDeterminant() {
        int[][] pole2d = init2dArray();
        int determinant = 0;

        determinant =
            pole2d[0][0] * pole2d[1][1] * pole2d[2][2] +
            pole2d[0][1] * pole2d[1][2] * pole2d[2][0] +
            pole2d[0][2] * pole2d[1][0] * pole2d[2][1] -
            pole2d[0][2] * pole2d[1][1] * pole2d[2][0] -
            pole2d[0][1] * pole2d[1][0] * pole2d[2][2] -
            pole2d[0][0] * pole2d[1][2] * pole2d[2][1];

        System.out.println("Determinant je: " + determinant);
    }
}