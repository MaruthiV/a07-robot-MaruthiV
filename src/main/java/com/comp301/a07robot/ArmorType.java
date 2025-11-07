package com.comp301.a07robot;

/**
 * Represents different armor types for robot upgrades.
 * Each type provides a different shield bonus.
 */
public enum ArmorType {
  BRONZE(10),
  IRON(15),
  GOLD(20),
  DIAMOND(25);

  private final int shieldUpgrade;

  /**
   * Creates an armor type with specified shield value.
   *
   * @param shieldUpgrade the shield bonus this armor provides
   */
  ArmorType(int shieldUpgrade) {
    this.shieldUpgrade = shieldUpgrade;
  }

  /**
   * Gets the shield upgrade value.
   *
   * @return the shield bonus
   */
  public int getShieldUpgrade() {
    return shieldUpgrade;
  }

  @Override
  public String toString() {
    return name();
  }
}