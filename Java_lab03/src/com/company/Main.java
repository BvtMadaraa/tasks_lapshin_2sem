package com.company;

import java.util.Arrays;

public class Main {
    //1) Города миллионники
    private static String millionsRounding(Object[][] obj) {
        for (int i = 0; i < obj.length; i++) {
            if ((int) obj[i][1]/1000000 > 0) {
                if ((int)obj[i][1]%1000000 >= 500000)
                    obj[i][1] = ((int)obj[i][1]/1000000+1)*1000000;
                else
                    obj[i][1] = ((int)obj[i][1]/1000000)*1000000;
            }
            else if((int) obj[i][1]/100000 >= 5)
                obj[i][1] = 1000000;
            else
                obj[i][1] = 0;
        }
        return Arrays.deepToString(obj);
    }

    //2)Треугольники
    private static String otherSides(double c){
        double a, b;
        a = 2 * c;
        b = Math.sqrt(a*a-c*c);

        return String.format("%.2f",a) + " " + String.format("%.2f",b);
    }

    //3)Камень ножницы бумага
    private static String rps(String first, String second){
        if (first == second) return "НИЧЬЯ";
        else {
            if (first == "ножницы"){
                if (second == "бумага") return "выиграл первый";
                else return "выиграл второй";
            }
            if (first == "бумага"){
                if (second == "камень") return "выиграл первый";
                else return "выиграл второй";
            }
            if (first == "камень"){
                if (second == "ножницы") return "выиграл первый";
                else return "выиграл второй";
            }
        }
        return "";
    }

    //4) сумма чет/нечет
    private static int phonk(int mas[]){
        int chet = 0, nechet = 0;
        for (int i = 0; i<mas.length; i++){
            if (mas[i] % 2 == 0) chet+=mas[i];
            else nechet+=mas[i];
        }
        return chet-nechet;
    }

    //5) нижний = верхний, верхний = нижний
    private static String reverseCase(String s) {
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < s.length();i++){
            if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90){
                result.setCharAt(i,Character.toLowerCase(s.charAt(i)));
            } else if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122){
                result.setCharAt(i,Character.toUpperCase(s.charAt(i)));
            }
        }
        return result.toString();
    }

    //6)странная штука
    private static String inatorInator(String s){
        String stroka[] = s.split("");
        String glas = "euioay";
        int len = s.length();
        String last = stroka[len-1];
        if (!glas.contains(last)) return s + "inator" + " " + len + "000";
        else return s + "-inator" + " " + len + "000";
    }

    //7)кирпич
    private static boolean doesBrickFit(int a, int b, int c, int w, int h){
        int min1 = a, min2 = b;

        if (c < a){
            min1 = c;
            if (a < b) min2 = a;
        }
        else if (c < b) min2 = c;

        return (Math.min(min1,min2)<=Math.min(w,h) && Math.max(min1,min2)<=Math.max(w,h));
    }

    //8)машинка
    private static String totalDistance(double bak, double rashod, int pas, boolean cond){
        double ret;
        if (cond) {
            ret = bak / (rashod +  (pas * rashod * 5/100));
            ret -= (ret * 0.1);
        }
        else
            ret = bak / (rashod + pas * (rashod * 5/100));
        ret*=100;
        return String.format("%.2F", ret);
    }
    //9) среднестатистическое массива
    private static String mean(double mas[]){
        double sum = 0, res;
        for (int i = 0; i < mas.length; i++){
            sum += mas[i];
        }
        res = sum/mas.length;
        return String.format("%.2f", res);
    }
    //10)четность числа и суммы цифр
    private static boolean parityAnalysis(int l){
        String s = Integer.toString(l);
        int sum = 0;
        String[] degit = s.split("");
        for (int i = 0; i < s.length(); i++){
            sum += Double.parseDouble(degit[i]);
        }
        return (sum % 2 == Double.parseDouble(s)%2);
    }
    public static void main(String[] args) {
        /*Object[][] matrix = {
                {"Nice", 942208},
                {"Abu Dhabi", 1482816},
                {"Vatican City", 572},
                {"Manila", 13923452},
                {"Kuala Lumpur", 7996830},
        };
        System.out.println(millionsRounding(matrix));*/
        //double mas[] = {1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3};
        System.out.println(rps("камень","ножницы"));
    }
}
