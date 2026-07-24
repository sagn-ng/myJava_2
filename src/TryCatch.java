public class TryCatch {
    static void checkAge(int age){
        if (age<18){
            throw new ArithmeticException("Access denied - you must be 18 or older!");
        }
        else {
            System.out.println("Access granted!");
        }
        /*
        the keyword "throw" allows us to create a custom error
        it is used with a kind of exception: ArithmeticException, FileNotFoundException,
        ArrayIndexOutOfBoundsException,...
        */
    }

    public static void main(String[] args) {
        try {
            int[] nums={1, 2, 3};
            System.out.println(nums[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Finished the \"try - catch\"!");
        }
        /*
        try {
            //block of code to try
        } catch (Exception e) {
            //block of code to handle errors
        } finally {
            //the code to be executed regardless of the result
        } //the "finally" block is optional

        we can add more than one "catch" block, Java will run the first one that matches the exception type
        */

        checkAge(17);
    }
}
