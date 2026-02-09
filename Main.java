class animals{
    void eat(){
        System.out.println("Animal class eat function");
    }
}
class lion extends animals{
    void roar(){
        System.out.println("Lion class roar method");
    }
}
class babylion extends lion{
    void weep(){
        System.out.println("Babylion class weep function");
    }
}
class Main{
    public static void main(String[] args) {
        babylion b1=new babylion();
        b1.eat();
        b1.roar();
        b1.weep();
    }
}
