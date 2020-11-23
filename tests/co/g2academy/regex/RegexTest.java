package co.g2academy.regex;

import org.junit.Test;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class RegexTest {

    @Test
    public void testSingleCharacterRegexUsingIterativeCode() {
        Pattern pattern = Pattern.compile(".s"); //Single character test
        Matcher matcher = pattern.matcher("as");
        boolean actual = matcher.matches();
        assertTrue(actual);
    }

    @Test
    public void testSingleCharacterRegexUsingChainingCode() {
        assertTrue(Pattern.compile(".s").matcher("as").matches());
    }

    @Test
    public void testSingleCharacterRegexUsingPatternMatchesMethod() {
        assertTrue(Pattern.matches(".s", "as"));
    }

    @Test
    public void testMatchOneCharacterInBracket() {
        // [] is exactly on character
        assertTrue(Pattern.matches("[abc]", "a"));
    }

    @Test
    public void testMatchZeroOrOneCharacterInBracket() {
        // ? is one or none
        assertTrue(Pattern.matches("[abc]?", ""));
    }

    @Test
    public void testMatchZeroOrManyCharacterInBracket() {
        // * is zero or many
        assertTrue(Pattern.matches("[abc]*", "abcabcabacab"));
    }

    @Test
    public void testMatchOneOrManyCharacterInBracket() {
        // * is zero or many
        assertTrue(Pattern.matches("[abc]*", "abcabcabacab"));
    }


    //http://www.rexegg.com/regex-quickstart.html#ref

}
