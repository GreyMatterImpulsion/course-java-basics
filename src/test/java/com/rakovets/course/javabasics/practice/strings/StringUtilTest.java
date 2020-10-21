package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    private StringUtil stringUtil;

    @BeforeEach
    void init() {
        stringUtil = new StringUtil();
    }

    @Test
    void getStringsConcatTest() {
        Assertions.assertEquals("HelloWorld", stringUtil.getStringsConcat("Hello","World"));
        Assertions.assertEquals("Hello World", stringUtil.getStringsConcat("Hello ","World"));
        Assertions.assertEquals("123456", stringUtil.getStringsConcat("123","456"));
        Assertions.assertEquals("Hello123456World", stringUtil.getStringsConcat("Hello123","456World"));
        Assertions.assertEquals("Hp", stringUtil.getStringsConcat("H","p"));
    }
    @Test
    void getSymbolIndexTest() {
        Assertions.assertEquals("2", stringUtil.getSymbolIndex("Ich verstehe nicht","h"));
        Assertions.assertEquals("5", stringUtil.getSymbolIndex("Ich will deine Seele","i"));
        Assertions.assertEquals("0", stringUtil.getSymbolIndex("Wir werden alle sterben","W"));
        Assertions.assertEquals("19", stringUtil.getSymbolIndex("Gibt es noch Fragen?","?"));

    }

    @Test
    void getStringsEqualityTest() {
        Assertions.assertEquals("false", stringUtil.getStringsEquality("Das Aufzung", "Das aufzug"));
        Assertions.assertEquals("true", stringUtil.getStringsEquality("Ein Apfel", "Ein Apfel"));
        Assertions.assertEquals("false", stringUtil.getStringsEquality("Was ist da?", "123"));
        Assertions.assertEquals("false", stringUtil.getStringsEquality("Mein Java ist kaput", ""));
    }

    @Test
    void getStringTrimAndLowCaseTest() {
        Assertions.assertEquals("das aufzug", stringUtil.getStringTrimAndLowCase("  Das Aufzug"));
        Assertions.assertEquals("ein apfel", stringUtil.getStringTrimAndLowCase("Ein Apfel  "));
        Assertions.assertEquals("1251", stringUtil.getStringTrimAndLowCase("  1251  "));
        Assertions.assertEquals("mein java ist kaput", stringUtil.getStringTrimAndLowCase("   Mein Java ist kaput    "));
    }

    @Test
    void get10To23CharsTest() {
        Assertions.assertEquals(" wir trinken ", stringUtil.get10To23Chars("Was wollen wir trinken Sieben Tage lang"));
        Assertions.assertEquals("alles uber mi", stringUtil.get10To23Chars("Ich weiss alles uber mich"));
        Assertions.assertEquals("Nein", stringUtil.get10To23Chars("Was wollen wir"));
    }

    @Test
    void getBracketsReplaceTest() {
        Assertions.assertEquals("))))))))))))))))))", stringUtil.getBracketsReplace(")()()(()())))((()("));
        Assertions.assertEquals("1234)", stringUtil.getBracketsReplace("1234("));
        Assertions.assertEquals("11111", stringUtil.getBracketsReplace("11111"));
    }

    @Test
    void getStringStartsAndEndsWithWordTest() {
        Assertions.assertEquals("true", stringUtil.getStringStartsAndEndsWithWord("Blumen", "BlumeN"));
        Assertions.assertEquals("true", stringUtil.getStringStartsAndEndsWithWord("Geschaft ist Geschaft", "Geschaft"));
        Assertions.assertEquals("false", stringUtil.getStringStartsAndEndsWithWord("Was ist da?", "123"));
    }

    @Test
    void getVowelsNumberTest() {
        Assertions.assertEquals("2", stringUtil.getVowelsNumber("aba"));
        Assertions.assertEquals("6", stringUtil.getVowelsNumber("eyuIOA"));
        Assertions.assertEquals("0", stringUtil.getVowelsNumber("1245776543"));
        Assertions.assertEquals("1", stringUtil.getVowelsNumber("124  5776i543"));
        Assertions.assertEquals("4", stringUtil.getVowelsNumber("Entschuldigung"));
    }

    @Test
    void getDotsAndCommasNumberTest() {
        Assertions.assertEquals("1", stringUtil.getDotsAndCommasNumber("aba!"));
        Assertions.assertEquals("0", stringUtil.getDotsAndCommasNumber("eyuIOA"));
        Assertions.assertEquals("4", stringUtil.getDotsAndCommasNumber("12!457.76543,,"));
        Assertions.assertEquals("4", stringUtil.getDotsAndCommasNumber("1!24.\\5776i543,, "));
        Assertions.assertEquals("12", stringUtil.getDotsAndCommasNumber("....,,,,!!!!"));
    }

    @Test
    void getForwardEqualBackwardTest() {
        Assertions.assertEquals("true", stringUtil.getForwardEqualBackward("abba"));
        Assertions.assertEquals("false", stringUtil.getForwardEqualBackward("eyu123"));
        Assertions.assertEquals("false", stringUtil.getForwardEqualBackward("asaaaaaaa"));
        Assertions.assertEquals("true", stringUtil.getForwardEqualBackward("level"));
        Assertions.assertEquals("true", stringUtil.getForwardEqualBackward("123321"));
    }

    @Test
    void getWordsNumberTest() {
        Assertions.assertEquals("6", stringUtil.getWordsNumber("abba  dfga hgfsdf 123 654354 3453"));
    }
}