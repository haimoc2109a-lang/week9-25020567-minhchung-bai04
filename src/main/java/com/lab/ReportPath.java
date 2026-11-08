package com.lab;

import java.nio.file.Path;

/** Builds platform-independent relative report paths. */
public final class ReportPath {
  private ReportPath() {
  }

  /** Returns the relative path for a report. */
  public static Path outputFile() {
    return Path.of("reports", "result.txt");
  }
}
