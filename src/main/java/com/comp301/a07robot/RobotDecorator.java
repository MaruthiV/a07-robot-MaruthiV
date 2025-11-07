package com.comp301.a07robot;

import javafx.scene.Parent;

public abstract class RobotDecorator implements Robot {

  public RobotDecorator(Robot decoratedRobot) {}

  @Override
  public String getDescription() {
    return "";
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
