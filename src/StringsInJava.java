public class StringsInJava {
    public static void main(String[] args) {
        String name = "Java Programming";
        String name1 = "Language";
        String spaceName = "        Software Testing               ";
        System.out.println(name.toLowerCase());
        System.out.println(name1.toUpperCase());
        System.out.println("We are learning " + name);
        System.out.println(spaceName.trim());
        System.out.println(spaceName);
        System.out.println(name.indexOf('r' , 7));
        System.out.println(name.charAt(9));
    }
}