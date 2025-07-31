public class oops {
    public static void main(String[] args) {
        OopsInherit obj = new OopsInherit();
        obj.display();
        
        OopsInterfaceImpl impl = new OopsInterfaceImpl();
        impl.display1();
    }
}

class OopsInherit {
    public void display() {
        System.out.println("Inheritance concept");
    }
}

class OopsInheritChild extends OopsInherit {
}

interface OopsInterface {
    public void display1();
}

class OopsInterfaceImpl implements OopsInterface {
    @Override
    public void display1() {
        System.out.println("Interface implementation");
    }
}
