package com.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReportPathTest {
  @Test
  void usesPortableSeparators() {
    assertEquals(2, ReportPath.outputFile().getNameCount());
    assertEquals("result.txt", ReportPath.outputFile().getFileName().toString());
  }
}
