package StringBufferAndBuilder;

public class StringBufferExample {
    public void stringAppend(){
        StringBuffer sb = new StringBuffer("Training"); //sb =training
        System.out.println("Old Text: " + sb); //old text: training

        sb.append(" For Job"); //sb = for job
        System.out.println("New Text: " + sb); //new text: training for job
    }
    public void stringInsert(){
        StringBuffer sb = new StringBuffer("Ja");
        sb.insert(1, "av"); //at index 0 insert av
        System.out.println("After insertion: " + sb);
    }
    //reverse string using string buffer

    public void stringReverse() {
        StringBuffer sb = new StringBuffer("Core Java");
        sb.reverse();
        System.out.println("After reversing: " + sb);
    }

    public static void main(String[] args) {
        StringBufferExample strbuf = new StringBufferExample();
        strbuf.stringAppend();
        strbuf.stringInsert();
        strbuf.stringReverse();
    }
}
