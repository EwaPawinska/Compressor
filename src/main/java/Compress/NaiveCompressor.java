package Compress;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NaiveCompressor implements Compressor{

private String sms;

    @Override
    public String compress(String input) {
        return Arrays.stream(input.split(" "))
                .map(word -> word.length() > 0 ? word.substring(0,1).toUpperCase()
                        + word.substring(1).toLowerCase(): word)
                .collect(Collectors.joining(""));
    }

    @Override
    public String uncompress(String input) {
        if (input == null || input.isEmpty())
            return "";
        String[] words = input.split("(?=\\p{Lu}+)");
        StringBuilder sb = new StringBuilder();
        for(String word:words){
            sb.append(word.toLowerCase());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
