package com.comp301.a07robot;

import javafx.scene.Parent;

public interface Robot {
  String getDescription();

  int getHealth();

  int getShield();

  int getPower();

  Parent getHealthBar();

  Parent getShieldBar();

  Parent getVisual();
}
