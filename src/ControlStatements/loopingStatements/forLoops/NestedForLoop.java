package ControlStatements.loopingStatements.forLoops;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.println(i + j); /* 1st itteration i=0 & j= 0+0
                                            0+1
                                            0+2
                                            0+3
                                            0+4 */
            }
        }
    }
}
