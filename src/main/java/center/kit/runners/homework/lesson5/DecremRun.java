package center.kit.runners.homework.lesson5;

import center.kit.app.homework.lesson5.MyMathFunc;

import java.util.Scanner;

public class DecremRun {
    public static void main(String[] args) {
        MyMathFunc myMathFunc = new MyMathFunc();
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        System.out.println(val+" > "+myMathFunc.DecrementCalc(val));
    }
}
