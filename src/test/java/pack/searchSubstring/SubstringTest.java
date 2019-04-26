package pack.searchSubstring;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SubstringTest {

    private SubstringCalculator calculator = new SubstringCalculatorImpl();

    @Test
    public void test1() {
        String input = "aaaaafafafafafa";
        String res = calculator.getSubstringContainingNoMoreThanTwoDifferentCharacters(input);
        String expected = "aaaaafafafafafa";
        assertEquals(expected, res);
    }

    @Test
    public void test2() {
        String input = "aaaaafafafafafad";
        String res = calculator.getSubstringContainingNoMoreThanTwoDifferentCharacters(input);
        String expected = "aaaaafafafafafa";
        assertEquals(expected, res);
    }

    @Test
    public void test3() {
        String input = "aaaaafafafafafaddddccccc";
        String res = calculator.getSubstringContainingNoMoreThanTwoDifferentCharacters(input);
        String expected = "aaaaafafafafafa";
        assertEquals(expected, res);
    }

    @Test
    public void test4() {
        String input = "fafafaddddcccccccc111";
        String res = calculator.getSubstringContainingNoMoreThanTwoDifferentCharacters(input);
        String expected = "ddddcccccccc";
        assertEquals(expected, res);
    }

    @Test
    public void test5() {
        String input = "fafafadcccccccc111";
        String res = calculator.getSubstringContainingNoMoreThanTwoDifferentCharacters(input);
        String expected = "cccccccc111";
        assertEquals(expected, res);
    }

    @Test
    public void test6() {
        String input = "tgfsdfdsafsdr3fdasgdreryyyyyyyyyyytttttttrfbfbfdbfdrrrrrrrrrttttttttttttttttttttttttttttttggert464564362";
        String res = calculator.getSubstringContainingNoMoreThanTwoDifferentCharacters(input);
        String expected = "rrrrrrrrrtttttttttttttttttttttttttttttt";
        assertEquals(expected, res);
    }

    @Test
    public void test7() {
        String input = "dre33435435435437878787878788888888877877887fhgfhgfhfhf66669090909090909909hhhjuutytuytd6";
        String res = calculator.getSubstringContainingNoMoreThanTwoDifferentCharacters(input);
        String expected = "7878787878788888888877877887";
        assertEquals(expected, res);
    }

    @Test
    public void test8() {
        String input = "dr";
        String res = calculator.getSubstringContainingNoMoreThanTwoDifferentCharacters(input);
        String expected = "dr";
        assertEquals(expected, res);
    }

    @Test
    public void test9() {
        String input = "dr56757575775fffffffffffggggggggggg66666666uuuthfghfhgf5643343543uiutttttttttttttttttttttttttttttttttttttttttttt";
        String res = calculator.getSubstringContainingNoMoreThanTwoDifferentCharacters(input);
        String expected = "utttttttttttttttttttttttttttttttttttttttttttt";
        assertEquals(expected, res);
    }

    @Test
    public void test10() {
        String input = "456tttt";
        String res = calculator.getSubstringContainingNoMoreThanTwoDifferentCharacters(input);
        String expected = "6tttt";
        assertEquals(expected, res);
    }

    @Test
    public void test11() {
        String input = "aaaaaaaaaaaaaaaaaa";
        String res = calculator.getSubstringContainingNoMoreThanTwoDifferentCharacters(input);
        String expected = "aaaaaaaaaaaaaaaaaa";
        assertEquals(expected, res);
    }

    @Test
    public void test12() {
        String input = "aaaaaaaaaaaaaaaaaabbbcccggg";
        String res = calculator.getSubstringContainingNoMoreThanTwoDifferentCharacters(input);
        String expected = "aaaaaaaaaaaaaaaaaabbb";
        assertEquals(expected, res);
    }

    @Test
    public void test13() {
        String input = "abcdefg";
        String res = calculator.getSubstringContainingNoMoreThanTwoDifferentCharacters(input);
        String expected = "ab";
        assertEquals(expected, res);
    }

    @Test
    public void test14() {
        String input = "aaaaa";
        String res = calculator.getSubstringContainingNoMoreThanTwoDifferentCharacters(input);
        String expected = "aaaaa";
        assertEquals(expected, res);
    }
}
