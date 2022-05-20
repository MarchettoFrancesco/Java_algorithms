import huffman_toolkit.*;

public class IOTest {

    public static int copyFile(String src, String dst){
        InputTextFile in = new InputTextFile(src);
        OutputTextFile out = new OutputTextFile(dst);
        int count = 0;
        while (in.textAvailable()){

            String s = in.readTextLine();
            out.writeTextLine(s);

            // char c = in.readChar();
            // out.writeChar(c);

            // while in.bitsAvailable
            // int b = in.readBit();
            // out.writeBit(b);
            count++;
        }
        in.close();
        out.close();
        return count;
    }
}