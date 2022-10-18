package StringBufferAndBuilder;

public class BufferBuilderPerformance {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer strbuf = new StringBuffer("Training");
        for (int i = 0; i < 200000; i++) {
            strbuf.append("for job placements");
        }
        System.out.println("Time taken by String Buffer: "+ (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuilder strbui = new StringBuilder();
        for (int i = 0; i < 200000; i++) {
            strbui.append("Jobs");
        }
        System.out.println("Time taken by String Builder: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}
