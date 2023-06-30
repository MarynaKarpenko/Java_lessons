package de.telran.modifiers;

public class TestSamePackage {
    int intDefault = 11;   //не объявляется. Доступен в том же классе и пакете, в котором определен.
    public int intPublic = 22;  //доступен во всех классах вашего приложения
    private int intPrivate = 33;  //доступен только внутри класса, в котором он определен
    protected int intProtected = 44;  // доступен в классе, в котором он определен, и в его подклассах
    public static int intStatic = 55;

    public void testMethod() {
        System.out.println("I am testMethod() in class TestOther");
        System.out.println(intDefault);
        System.out.println(intPublic);
        System.out.println(intPrivate);
        System.out.println(intProtected);
    }
}
