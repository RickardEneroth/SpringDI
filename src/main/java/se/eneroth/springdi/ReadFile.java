package se.eneroth.springdi;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Rickard on 2015-02-17.
 */
public class ReadFile {

    public static void main(String[] args) throws IOException {
        System.out.println(readFile("resources/file.txt"));
    }

    static String readFile(String path) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, Charset.defaultCharset());
    }
}
