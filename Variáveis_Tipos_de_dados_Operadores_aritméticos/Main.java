public class Main {
    
    public static void main(String[] args) {
        
        // Clean the terminal screen
        cleanConsoleScreen();

        // Conceptualization and creation 
        class1();
        
        // Data types
        class2();

        // Arithmetic operators
        class3();

        System.out.println();
    }

    private static void cleanConsoleScreen() {

        System.out.print("\033[H\033[2J");
        System.out.flush();

    }

    private static void class1() {
        
        int i = 10;

        final int j = 10;
        //j = 15;
        int asdfa45asdf;
        //int asdf fdfd;
        //int ad$f fdfd;

        int quantidadeProduto = 50;
        // int qtdProd;
        //int QUANTIDADE_OPCOES;
        
        System.out.println("\n" + i);
        System.out.println();
    }
    
    private static void class2() {

        int t = 11;
        int k = 14;

        float f = 3.14f;
        float d = 14.22f;
        
        byte b = 10;
        byte bi = 20;

        short ew = 20000;
        //short we = 40000; have to be  < 32000

        long l1 = 1000000000000L;
        long l2 = 2000000000000L;

        double d2 = 4.555;
        double dd = 4545.555;

        char a = 'a';
        char w = '\u0057';

        String s1 = "foi";

        boolean v = true;
        boolean fa = false;


        System.out.println("\n" + f);
        System.out.println(w);
        System.out.println(s1);
        System.out.println();

    }

    private static void class3() {
        System.out.println("PrePos" + "\n");
        prePos();
        System.out.println("Arithmetic" + "\n");
        arithmetic();
        /*
        System.out.println("Assignment");
        assignment();
        System.out.println("Precedence");
        precedence();
        */
    }

    private static void prePos() {

        int k = 10;

        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("x:" + x);
        System.out.println();
        
    }
    

    private static void arithmetic() {
    
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        
        int r1 = a+b; 
        int r2 = c-a; 
        int r3 = d*b; 
        int r4 = e/a; 
        int r5 = c%b;
        
        System.out.println("a+b: " + r1);
        System.out.println("c-a: " + r2);
        System.out.println("d*b: " + r3);
        System.out.println("e/a: " + r4);
        System.out.println("c%d: " + r5);
    
    }
}   