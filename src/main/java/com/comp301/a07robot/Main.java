package com.comp301.a07robot;

import static javafx.application.Application.launch;

public class Main {

  /**
   * Builds a custom robot with decorators.
   * Final stats: Health 300, Shield 120.
   *
   * @return the decorated robot
   */
  public static Robot build() {
    Robot robot = new BasicRobot();

    // Add power-ups
    robot = new PowerUpDecorator(robot, PowerType.ENCHANTER);
    robot = new LaserDecorator(robot);
    robot = new PowerUpDecorator(robot, PowerType.SORCERER);

    // Add armor pieces for shield
    robot = new HeadArmorDecorator(robot, ArmorType.DIAMOND);
    robot = new TorsoArmorDecorator(robot, ArmorType.DIAMOND);
    robot = new ArmsArmorDecorator(robot, ArmorType.GOLD);
    robot = new JetpackDecorator(robot);

    return robot;
  }

  public static void main(String[] args) {
    launch(RobotBuilder.class);
  }
}