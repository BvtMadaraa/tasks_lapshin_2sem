package com.company;
public class Main {
    /*1)Минуты в секунды*/
    public static int convert(int min){
        return (min * 60);
    }
    /*2)Счёт кол-ва очков в баскетбольном матче*/
    public static int points(int two_point, int three_point){
        return (two_point * 2 + three_point * 3);
    }
    /*3)Считает кол-во очков, набранных командой в турнире*/
    public static int footballPoints (int win, int draw, int lose){
        return (win*3 + draw);
    }
    /*4)Определяет нацело число делится на пять или нет*/
    public static boolean divisibleByFive (int deg){
        return deg % 5 == 0;
    }
    /*5)Конъюнкция*/
    public static boolean and(boolean a, boolean b){
        return (a&&b);
    }
    /*6)сколько можно покрасить стен*/
    public static int howManyWalls(int n,int w,int h){
        return (n/(w*h));
    }
    /*7)исправление ошибки, squared(int b)->squared(int a) */
    public static int squared(int a){
        return (a*a);
    }
    /*8) возвращает true, если prob * prize > pay; в противном случае возвращает false.*/
    public static boolean profitableGamble(double prob, double prize, double pay){
        return prob*prize>pay;
    }
    /*9)Счёт кол-ва кадров за определенное кол-во минут*/
    public static int frames(int fps,int min){
        return(fps * min * 60);
    }
    /*10)Функция mod без использования %*/
    public static int mod(int a, int b){
        while (a>b){
            a -= b;
        }
        return a;
    }
    /*10_v2) Функция mod без использования %*/
    public static int mod_v2(int a, int b){
        return a-(a/b)*b;
    }
    public static void main(String[] args) {
        System.out.println(and(false, false));
    }
}

