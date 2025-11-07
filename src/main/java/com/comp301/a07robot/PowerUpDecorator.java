package com.comp301.a07robot;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 * Decorator that adds power-ups to a robot.
 * Multiplies health and power based on type.
 */
public class PowerUpDecorator extends RobotDecorator {
  private PowerType powerType;

  /**
   * Creates a power-up decorator.
   *
   * @param decoratedRobot the robot to decorate
   * @param powerType the type of power-up
   */
  public PowerUpDecorator(Robot decoratedRobot, PowerType powerType) {
    super(decoratedRobot);
    this.powerType = powerType;
  }

  @Override
  public String getDescription() {
    return decoratedRobot.getDescription() + ", " + powerType + " Power Up";
  }

  @Override
  public int getHealth() {
    return decoratedRobot.getHealth() * powerType.getMultiplier();
  }

  @Override
  public int getPower() {
    return decoratedRobot.getPower() * powerType.getMultiplier() * 10;
  }

  @Override
  public Parent getVisual() {
    StackPane pane = (StackPane) decoratedRobot.getVisual();

    String imageName;
    switch (powerType) {
      case APPRENTICE:
        imageName = "yellow_power.png";
        break;
      case ENCHANTER:
        imageName = "red_power.png";
        break;
      case SORCERER:
        imageName = "blue_power.png";
        break;
      default:
        imageName = "yellow_power.png";
    }

    ImageView powerImage = new ImageView(new Image(imageName));
    powerImage.setFitWidth(600);
    powerImage.setFitHeight(700);
    pane.getChildren().addFirst(powerImage);

    return pane;
  }
}