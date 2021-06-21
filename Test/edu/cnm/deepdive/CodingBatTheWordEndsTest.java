package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatTheWordEnds.wordEnds;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatTheWordEndsTest {

  private String[] strParams = {
      "abcXY123XYijk",
      "XY123XY",
      "XY1XY",
      "XYXY",
      "XY",
      "Hi",
      "",
      "abc1xyz1i1j",
      "abc1xyz1",
      "abc1xyz11",
      "abc1xyz1abc",
      "abc1xyz1abc",
      "abc1abc1abc"
  };

  private String[] wordParams = {
      "XY",
      "XY",
      "XY",
      "XY",
      "XY",
      "XY",
      "XY",
      "1",
      "1",
      "1",
      "abc",
      "b",
      "abc"
  };

  private String[] strExpected = {

      "c13i",
      "13",
      "11",
      "XY",
      "",
      "",
      "",
      "cxziij",
      "cxz",
      "cxz11",
      "11",
      "acac",
      "1111"
  };

  @Test
  void wordEndsTest() {
    for (int i = 0; i < strParams.length; i++) {
      String actual = wordEnds(strParams[i], wordParams[i]);
      Assertions.assertEquals(actual, strExpected[i]);

    }
  }

}