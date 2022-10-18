package WrapperClasses;

public class WrapperClassesInJava {
    public static void main(String[] args) {
        Integer integer = 678;
        Double newDouble = 3.14;
        Character character = 'A';
        System.out.println(integer.intValue());
        System.out.println(newDouble.doubleValue());
        System.out.println(character.charValue());
        Boolean boo = true;
        // System.out.println(boo.booleanValue());

        //to convert integer to string
        String newString = integer.toString();
        System.out.println(newString.length());
    }
}
