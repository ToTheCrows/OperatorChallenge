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
        Same problem as before and if statement will always be true because no ERROR in that case
        with booleans
        boolean isCar = false;
        if(isCar = true) {
            // execute Code
            System.out.println("This is not supposed to happen");
        }
        */

        //if(isCar) is the more professional way to check for "true"
        boolean isCar = false;
        if(isCar == true) {
            System.out.println("This is not supposed to happen");
        }
   }
}
