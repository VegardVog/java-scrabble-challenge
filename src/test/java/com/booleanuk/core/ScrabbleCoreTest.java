package com.booleanuk.core;

import com.booleanuk.Scrabble;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScrabbleCoreTest {
    @Test
    public void shouldGive0ForEmptyWords() {
        Scrabble scrabble = new Scrabble("");
        Assertions.assertEquals(0, scrabble.score());
    }

    @Test
    public void shouldGive0ForWhiteSpace() {
        Scrabble scrabble = new Scrabble("\n\r\t\b\f");
        Assertions.assertEquals(0, scrabble.score());
    }

    @Test
    public void shouldScore1ForA() {
        Scrabble scrabble = new Scrabble("a");
        Assertions.assertEquals(1, scrabble.score());
    }

    @Test
    public void shouldScore4ForF() {
        Scrabble scrabble = new Scrabble("f");
        Assertions.assertEquals(4, scrabble.score());
    }

    @Test
    public void shouldScore6ForStreet() {
        Scrabble scrabble = new Scrabble("street");
        Assertions.assertEquals(6, scrabble.score());
    }

    @Test
    public void shouldScore22ForQuirky() {
        Scrabble scrabble = new Scrabble("quirky");
        Assertions.assertEquals(22, scrabble.score());
    }

    @Test
    public void shouldScore41ForCaseInsensitiveWord() {
        Scrabble scrabble = new Scrabble("OXyPHEnBUTaZoNE");
        Assertions.assertEquals(41, scrabble.score());
    }

    @Test
    public void shouldScoreXForCheeseBracket() {
        Scrabble scrabble = new Scrabble("che[e]se");
        Assertions.assertEquals(13, scrabble.score());
    }
    @Test
    public void shouldScoreXForCheeseBracketWord() {
        Scrabble scrabble = new Scrabble("[cheese]");
        Assertions.assertEquals(33, scrabble.score());
    }

    @Test
    public void shouldScoreXForCheeseCurlyBracket() {
        Scrabble scrabble = new Scrabble("che{e}se");
        Assertions.assertEquals(12, scrabble.score());
    }
    @Test
    public void shouldScoreXForCheeseCurlyBracketWord() {
        Scrabble scrabble = new Scrabble("{cheese}");
        Assertions.assertEquals(22, scrabble.score());
    }
}
