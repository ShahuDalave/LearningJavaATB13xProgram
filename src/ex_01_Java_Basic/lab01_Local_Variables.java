package ex_01_Java_Basic;

public class lab01_Local_Variables {
    public static void main(String[] args) {
        int a = 10;
        {
            int b = 20;
            System.out.println(b);
        }
        int b = 50;
        System.out.println(b);
    }
}

