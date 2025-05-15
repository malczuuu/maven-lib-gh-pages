package io.github.malczuuu.library;

import java.util.UUID;

public class UUIDStringGenerator implements StringGenerator {

  private boolean plainEnabled = false;

  @Override
  public String generate() {
    String string = UUID.randomUUID().toString();
    if (plainEnabled) {
      string = string.replace("-", "");
    }
    return string;
  }

  public void setPlainEnabled(boolean plainEnabled) {
    this.plainEnabled = plainEnabled;
  }
}
