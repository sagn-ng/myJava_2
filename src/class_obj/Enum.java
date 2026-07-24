package class_obj;
public class Enum {
    enum level {
        LOW, MEDIUM, HIGH
    }

    enum level_2 {
        lv1(1, "LOW"),
        lv2(2, "MEDIUM"),
        lv3(3, "HIGH");
        private final int code;
        private final String muc_do;
        level_2(int code, String muc_do){
            this.code=code; this.muc_do=muc_do;
        } //constructor

        public int getCode(){
            return code;
        } //a method to get the "code" value
        public String getMuc(){
            return muc_do;
        } //method to get the "muc_do" value
    }
    
    public static void main(String[] args) {
        level myVar = level.MEDIUM;
        System.out.println(myVar);
        for (level u : level.values()) System.out.println(u); //loop through an enum
        System.out.println();
        level_2 myVar2 = level_2.lv1;
        System.out.println(myVar2.getCode()+" - "+myVar2.getMuc());
    }
    /*
    "enum" is actually 1 class, it also has methods, constructors.
    to assign a value to a variable/field inside enum, there are 3 parts:

    - declare the constants with values passed inside the (....); end the line by "," and by
    ";" after finishing the declaration
    
    - declare the variables with "private final" for their corresponding values

    - write a construtor to get the value for these variables

    *The constructor of enum must be "private" or "default", not "public"
    */
}
