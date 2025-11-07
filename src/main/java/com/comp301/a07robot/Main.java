package com.comp301.a07robot;

import static javafx.application.Application.launch;

public class Main {

  public static Robot build() {
    Robot robot = new BasicRobot();
    return robot;
  }

  public static void main(String[] args) {
    launch(RobotBuilder.class);
  }
}
