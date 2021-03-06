package OOP.MethodOverLoading;

public class Example {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        System.out.println(cat.getName());
//
//        Tiger tiger = new Tiger();
//        System.out.println(tiger.getName());

//        Cat parent = new Cat();
//        Cat me = new Cat();
//        me.setParent(parent);
//        Cat myParent = me.getParent();

//        Tiger tiger = new Tiger();
//        Tiger me = new Tiger();
//        me.setParent(tiger);
//        Tiger myTiger = (Tiger) me.getParent();


        print(1);
        print((byte) 1);
        print("1");
        print((Integer) null);

    }

    public static void print(int n){
        System.out.println(n);
    }
    public static void print(short n){
        System.out.println(n);
    }
    public static void print(Integer n){
        System.out.println(n);
    }
    public static void print(String n){
        System.out.println(n);
    }


}





















//class Cat{
//    public Cat parent;
//
//    public Cat getParent() {
//        return this.parent;
//    }
//    public void setParent(Cat cat){
//        this.parent = cat;
//    }
    //    protected String getName(){
//        return "Vaska";
//
//    }




//interface HasName{
//    String getName();
//    int getValue();
//}
//
//interface HasSize {
//    int getValue();
//}

//class Tiger extends Cat{
//    @Override
//    public Cat getParent() {
//        return (Tiger) this.parent;
//
//    }
    //    @Override
//    public String getName() {
//        return "Leo";
//    }


