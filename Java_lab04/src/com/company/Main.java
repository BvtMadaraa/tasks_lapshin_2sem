package com.company;

import java.util.Arrays;

public class Main {

    //1) если в массиве 7 то бум
    public static String sevenBoom(int mas[]){
        for (int i = 0; i < mas.length; i++){
            if (mas[i]==7) return "Boom!";
        }
        return "there is no 7 in the array";
    }
    //2) можно ли упорядочить
    public static boolean cons(int mas[]){
        Arrays.sort(mas);
        for (int i = 0; i < mas.length-1; i++){
            if (mas[i]!=mas[i+1]-1) return false;
        }
        return true;
    }
    //3) свап попарно каждых двух символов
    public static String unmix(String a){
        String swap;
        String res = "";
        String[] s = a.split("");
        for (int i = 1; i <= (a.length() / 2) * 2; i+=2){
            swap = s[i];
            s[i] = s[i-1];
            s[i-1] = swap;
            res+= s[i-1] + s[i];
        }
        if (a.length() % 2 == 0) return res;
        else return res + s[s.length - 1];

    }
    //4) убирает лишние восклицательные или вопросительные знаки в конце строки
    public static String noYelling(String a){
       String[] s = a.split("");
       int k = 0;
       a = "";
       for (int i = s.length-1; i > 0; i--) {
          if (s[i].equals("!") || s[i].equals("?")){
              if (s[i-1].equals("!") || s[i-1].equals("?")){
                  s[i] = "";
              }
              else break;
          }
          else break;
       }
       int i = 0;
       while (s[i]!=""){
           a += s[i];
           i++;
        }
        return a;
    }
    //5) замена иксов
    public static String xPronounce(String a){
        String[] str = a.split(" ");
        String res = "";
        for(int i = 0; i < str.length;i++){
            if (str[i].length()==1){
                str[i]=str[i].replace("x","ecks");
            } else if (str[i].charAt(0)=='x'){
                str[i]=str[i].replaceFirst("x","z");
            } else {
                str[i]=str[i].replaceAll("x","cks");
            }
        }
        for (int i = 0;i <str.length;i++) {
            res += str[i] + " ";
        }
        return res;
    }
    //6) нахождение наибольшего разрыва 
    public static int largestGap(int[] a) {
        int max = -2147483647;
        Arrays.sort(a);
        for (int i = a.length-1; i > 0; i--) {
            if (a[i]-a[i-1] > max)
                max = a[i]-a[i-1];
        }
        return max;
    }
    //7)создать функцию
    public static int strangeFunc(int a){
        String newstr = "";
        String stra = Integer.toString(a);
        int[] ne = new int[stra.length()];
        for (int i = 0; i < stra.length(); i++) {
            ne[i] = Integer.parseInt(stra.substring(i, i+1));
        }
        Arrays.sort(ne);
        for (int i = 0; i < stra.length(); i++) {
            newstr += Integer.toString(ne[i]);
        }
        int dif = a - Integer.parseInt(newstr);
        return a-dif<0?0:dif;
    }
    //8)
    public static String commonLastVowel(String s){
        String bukv = "aeyuoi";
        int[] kol = {0, 0, 0, 0, 0, 0};
        String[] slov = s.toLowerCase().split(" ");
        for (int i = 1; i < slov.length; i++) {
            if (bukv.indexOf(slov[i].charAt(slov[i].length() - 1)) > 0)
                kol[bukv.indexOf(slov[i].charAt(slov[i].length() - 1))] += 1;
        }
        int MaxInd = 0;
        for (int i = 0; i < kol.length; i++){
            if (kol[i] > kol[MaxInd])
                MaxInd = i;
        }
        return Character.toString(bukv.charAt(MaxInd));
    }
    //9) мемная сумма
    public static int memeSum(int a, int b){
        String res="";
        int maxlen=(int)Math.log10(Math.max(a, b));
        for (int i=0;i<=maxlen;i++) {
            res+=Integer.toString(a/(int)Math.pow(10, maxlen-i)+(int)b/(int)Math.pow(10, maxlen-i));
            a%=(int)Math.pow(10, maxlen-i);
            b%=(int)Math.pow(10, maxlen-i);
        }
        return Integer.parseInt(res) ;
    }


    //10)анрепит символв слова
    public static String unrepeated(String str) {
        String res="";
        for (int i=0;i<str.length();i++) {
            if(!res.contains(Character.toString(str.charAt(i)))) {
                res+=str.charAt(i);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int mas[] = {1,2,3,4,5,5,5,6,7,8};
        System.out.println(cons(mas));
    }
}
