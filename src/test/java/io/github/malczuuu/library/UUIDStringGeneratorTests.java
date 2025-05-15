package io.github.malczuuu.library;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UUIDStringGeneratorTests {

  @Test
  void shouldGenerateActualUUID() {
    UUIDStringGenerator generator = new UUIDStringGenerator();

    String string = generator.generate();

    assertTrue(string.contains("-"));
  }

  @Test
  void shouldGenerateSimpleString() {
    UUIDStringGenerator generator = new UUIDStringGenerator();
    generator.setPlainEnabled(true);

    String string = generator.generate();

    assertFalse(string.contains("-"));
  }
}
