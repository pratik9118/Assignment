package Java;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Claculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sol = sc.nextInt();
        switch (sol){
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if(b == 0){
                System.out.println("unde find");
        }else{
            System.out.println(a/b);
        }

        break;
            case 5:
        System.out.println("default");
        }
    }

}