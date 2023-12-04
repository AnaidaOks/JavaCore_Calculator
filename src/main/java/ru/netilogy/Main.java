package ru.netilogy;

public class Main {


    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);

        // Ошибка может возникнуть при делении на ноль.
        // Можно дописать проверку в devide и в случае деления на 0 вернуть 0
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);
    }
}