public class Variables {
    public static void main(String[] args) {
        int a = 5;
        float b = 12.8f;
        System.out.println(a);
        System.out.println(b);

        String name = "ISRO";
        System.out.println(name);


        a = 10;        // a = b; 
        System.out.println("sum is" + (a+b));


        

        // Primitive Datatypes in Java
        byte m = 8; // 1 byte, Range: -128 to 127
        System.out.println(m);

        char ch = 'a'; // 2 bytes, Range: 0 to 65,535 (inclusive)
        System.out.println(ch);

        boolean var = false; // boolean 1 bit, Range: Only two possible values: true or false.
        System.out.println(var);

        float f = 12.5f; // 4 bytes, Range: Approximately ±3.40282347E+38 (6-7 significant decimal digits).
        System.out.println(f);

        double d = 122324321412.5342322; // 8 bytes, Range: Approximately ±1.79769313486231570E+308 (15 significant decimal digits).
        System.out.println(d);

        int n  = 34; // 4 bytes, Range: -2,147,483,648 to 2,147,483,647
        System.out.println(n);

        long l = 1233451234413L; // 8 bytes, Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println(l);

        short s = 10000; // 2 bytes, Range: -32,768 to 32,767
        System.out.println(s);



    }
    
}
