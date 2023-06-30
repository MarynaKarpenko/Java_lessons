package de.telran.modifiers;

import de.telran.modifiers.other.TestOther;

public class TestModifiers {
    public static void main(String[] args) {
        System.out.println(TestOther.intStatic);

        // работа с классом в другом классе
        System.out.println(TestOther.intStatic);
        TestOther testOtherPackage = new TestOther();
        testOtherPackage.testMethod();
        System.out.println(testOtherPackage.intPublic);

        // работаем с классом в том же пакете
        TestSamePackage testSamePackage = new TestSamePackage();
        testSamePackage.testMethod();
        System.out.println(testSamePackage.intDefault);
        System.out.println(testSamePackage.intPublic);
        System.out.println(testSamePackage.intProtected);
    }
}
