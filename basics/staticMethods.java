
class Mobile{

    static String company; //static variable
    int price;
    String model;

    //static block - called only once when the first object is initialized.
    static {
        company = "samsung";
        System.out.println("static block");
    }

    Mobile(int price, String model){
        this.price = price;
        this.model = model;
        System.out.println("constructor block");
    }

    public void mobileDetails(){
        System.out.println(this.company + " " + this.price + " " + this.model);
    }

    //static function - can be called without any object initialization
    static void getCompanyName(){
        System.out.println(company);
    }
}

class staticMethods{
    public static void main(String args[]) throws ClassNotFoundException
    {
        // Mobile obj1 = new Mobile(20000, "s22");
        // Mobile obj2 = new Mobile(70000, "s24");
        // Mobile.getCompanyName();

        Class.forName("Mobile"); // loads the class without initializing the object
    }
}