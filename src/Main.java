public class Main {
    public static void main(String[] args) {
        /*
        wrong because instead of using the equal operator I
        used an assignment operator -> need == for if
        int newValue = 50;
        if (newValue = 50) {
            execute code
        }
         */
        int newValue = 50;
        if(newValue == 50) {
            // execute Code
            System.out.println("This is true");
        }

        /*
        Same problem as before and if statement will always
        be true
        boolean isCar = false;
        if(isCar = true) {
            // execute Code
            System.out.println("This is not supposed to happen");
        }
        */
        boolean isCar = false;
        if(isCar == true) {
            System.out.println("This is not supposed to happen");
        }
   }
}
