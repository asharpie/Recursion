public class Recursion {
    public static void Demo (int n) {  // initialize variable

        if( n > 0 ){ // base case
            System.out.println(n); // code
            Demo(n  - 1);	// recursive call update
            System.out.println(n); // code
        }

    }
    public static void Demo2(int n, int stop){
        if(n < stop){
            for(int j = 0; j<n;j++){
                System.out.print(n);}
            System.out.println();


            Demo2(n+1, stop);
            for(int j = 0; j<n;j++){
                System.out.print(n);}
            System.out.println();

        }
    }
    public static void Demo3(int n, int stop){
        for(int j = 0; j<n;j++){
            System.out.print("#");}
        System.out.println();
        if(n < stop){



            Demo3(n+1, stop);
            for(int j = 0; j<n;j++){
                System.out.print("#");}
            System.out.println();

        }
    }

}
