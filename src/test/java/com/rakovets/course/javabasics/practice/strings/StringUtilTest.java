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


}
