package com.comp301.a07robot;

import javafx.scene.Parent;

public class BasicRobot implements Robot {

  @Override
  public String getDescription() {
    return "Basic Robot";
  }

  @Override
  public int getHealth() {
    return -1;
  }

  @Override
  public int getShield() {
    return -1;
  }

  @Override
  public int getPower() {
    return -1;
  }

  @Override
  public Parent getHealthBar() {
    return null;
  }

  @Override
  public Parent getShieldBar() {
    return null;
  }

  @Override
  public Parent getVisual() {
    return null;
  }
}
