package com.company;

public class Main {
    /*1) Возвращает номер дома напротив*/
    public static int oppositeHouse (int num, int length){
        return (length*2+1-num);
    }
    /*2) Меняет 2 слова местами*/
    public static String nameShuffle(String a){
        String[] str = a.split(" ");
        return str[1] + ' ' + str[0];
    }
    /*3) Считает стоимость после применения скидки*/
    public static double discount(double prise, double discount){
        return prise/100*(100-discount);
    }
    /*4) Находим разницу между max и min в массиве*/
    public static int differenceMaxMin(int mas[]){
        int k = mas.length;
        int min = 2147483647, max = -2147483648;
        for (int i = 0; i < k; i++){
            if (mas[i]<min) min = mas[i];
            if (mas[i]>max) max = mas[i];
        }
        return max - min;
    }
    /*5) Находим кол-во одинаковых элементов из 3*/
    public static int equal(int a, int b, int c){
        if (a == b && b == c) return 3;
        else if (a == b || b == c || a ==c) return 2;
        else return 0;
    }
    /*6) Выводим строку наоборот*/
    public static String reverse (String str){
        StringBuilder reversestr = new StringBuilder(str);
        reversestr.reverse();
        return reversestr.toString();
    }
    /*7)Возвращает разницу между самым высокооплачиваемым программистом и самым низкооплачиваемым.*/
    public static int programmers(int a, int b, int c){
        int min = a, max = a;
        max = Math.max(a,Math.max(b,c));
        min = Math.min(a,Math.min(b,c));
        return max - min;
    }
    /*8)Принимает строку, проверяет, имеет ли она одинаковое количество x и o и возвращает либо true, либо false.*/
    public static boolean getXO(String str){
        int o=0, x=0;
        String mas[] = str.split("");
        for (int i = 0; i < str.length(); i++){
            mas[i].toLowerCase();
            if (mas[i]=="x") x++;
            if (mas[i]=="o") o++;
        }
        return o == x;
    }
    /*9) Есть bomb->ПРИГНИСЬ!, иначе -> Расслабься, бомбы нет*/
    public static String bomb(String str){
        str = str.toLowerCase();
        int duck = str.indexOf("bomb");
        if (duck != -1) return "ПРИГНИСЬ!";
        else return "Расслабься, бомбы нет";
    }
    /*10)Сумма элементов по аски равна или нет */
    public static boolean sameAscii(String a, String b){
        int ka = 0, kb = 0;
        byte[] mas_a = a.getBytes();
        byte[] mas_b = b.getBytes();
        for (int i = 0; i < a.length(); i++){
            ka+= (int) mas_a[i];
        }
        for (int i = 0; i < b.length(); i++){
            kb+= (int) mas_b[i];
        }
        return ka==kb;
    }
    public static void main(String[] args) {
        //int num[] = {10, 4, 1, 4, -10, -50, 32, 21};
	    System.out.println();
    }
}
