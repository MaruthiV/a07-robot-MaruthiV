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

    // Add power-up first (multiplies health by 2, giving 100 health)
    robot = new PowerUpDecorator(robot, PowerType.ENCHANTER);

    // Add another power-up (multiplies health by 3, giving 300 health)
    robot = new PowerUpDecorator(robot, PowerType.SORCERER);

    // Add armor pieces for shield
    robot = new HeadArmorDecorator(robot, ArmorType.DIAMOND);  // +25 shield
    robot = new TorsoArmorDecorator(robot, ArmorType.DIAMOND); // +25 shield
    robot = new ArmsArmorDecorator(robot, ArmorType.GOLD);     // +20 shield
    robot = new JetpackDecorator(robot);                       // +50 shield
    // Total shield: 25 + 25 + 20 + 50 = 120

    return robot;
  }

  public static void main(String[] args) {
    launch(RobotBuilder.class);
  }
}