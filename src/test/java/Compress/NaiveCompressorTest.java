package Compress;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.*;

public class NaiveCompressorTest {

    private String input;
    private String expected;
    private String result;
    private NaiveCompressor nc;

    @BeforeEach
    public void setup() throws Exception{
        nc = new NaiveCompressor();
    }

    @Test
    public void compressOneWord() {
        NaiveCompressor nc = new NaiveCompressor();
        input = "abc";
        expected = "Abc";

        assertEquals(expected, nc.compress(input));
    }

    @Test
    public void compressShortTextWithSpaceSmallLettersOnly() {
        NaiveCompressor nc = new NaiveCompressor();
        input = "abc abc";
        result = nc.compress(input);
        expected = "AbcAbc";

        assertEquals(expected, result);
    }

    @Test
    public void compressShortTextWithSpaceCapitalLettersOnly() {
        NaiveCompressor nc = new NaiveCompressor();
        input = "ABC DFG";
        result = nc.compress(input);
        expected = "AbcDfg";

        assertEquals(expected, result);
    }

    @Test
    public void uncompressOneWord() {
        NaiveCompressor nc = new NaiveCompressor();
        input = "Abcdfg";
        result = nc.uncompress(input);
        expected = "abcdfg";

        assertEquals(expected, result);
    }

    @Test
    public void uncompressTwoWords() {
        NaiveCompressor nc = new NaiveCompressor();
        input = "abcDfgE";
        result = nc.uncompress(input);
        expected = "abc dfg e";

        assertEquals(expected, result);
    }
}
