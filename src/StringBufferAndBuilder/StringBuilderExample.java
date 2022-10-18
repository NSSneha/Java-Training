package StringBufferAndBuilder;

public class StringBuilderExample {
    public void stringAppend(){
        StringBuilder sb = new StringBuilder("Training"); //sb =training
        System.out.println("Old Text: " + sb); //old text: training

        sb.append(" For Job"); //sb = for job
        System.out.println("New Text: " + sb); //new text: training for job
    }
    public void stringInsert(){
        StringBuilder sb = new StringBuilder("Ja");
        sb.insert(1, "av"); //at index 0 insert av
        System.out.println("After insertion: " + sb);
    }
    //reverse string using string buffer

    public void stringReverse() {
        StringBuilder sb = new StringBuilder("Core Java");
        sb.reverse();
        System.out.println("After reversing: " + sb);
    }

    public static void main(String[] args) {
        StringBuilderExample strbu = new StringBuilderExample();
        strbu.stringAppend();
        strbu.stringInsert();
        strbu.stringReverse();
    }
}
