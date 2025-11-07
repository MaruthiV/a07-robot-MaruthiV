package com.comp301.a07robot;

/**
 * Represents power levels for robot upgrades.
 * Each level has a different multiplier effect.
 */
public enum PowerType {
  APPRENTICE(1),
  ENCHANTER(2),
  SORCERER(3);

  private final int multiplier;

  /**
   * Creates a power type with specified multiplier.
   *
   * @param multiplier the power multiplier value
   */
  PowerType(int multiplier) {
    this.multiplier = multiplier;
  }

  /**
   * Gets the multiplier value.
   *
   * @return the multiplier
   */
  public int getMultiplier() {
    return multiplier;
  }

  @Override
  public String toString() {
    return name();
  }
}