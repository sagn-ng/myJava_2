package class_obj;
public class Constructor {
    String modelName; int modelYear;
    public Constructor(String s, int t){
        modelName=s;
        modelYear=t;
    }
/*
Sometimes, in methods or constructors, the parameters have the same name as class' variables
Inside the methods or constructors themselves, the parameters will "hide" the class' variables.
To avoid, we can use "this":
    public Constructor(String modelName, int modelYear){
        this.modelName = modelName;
        this.modelYear = modelYear;
    }
*/

/*
"constructor" is a special method to initalize an object
it's automatically executed when using "new" to create an object
its name is the same as the class' name, with no return type
a constructor can be called inside another constructor using this()
*/
    public static void main(String[] args) {
        Constructor myCar = new Constructor("McLaren", 2022);
        System.out.println(myCar.modelName+" - "+myCar.modelYear);
    }
}
