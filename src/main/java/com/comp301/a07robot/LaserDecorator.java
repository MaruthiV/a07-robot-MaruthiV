package com.comp301.a07robot;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 * Custom decorator that adds laser weapons to a robot.
 * Increases power by 20.
 */
public class LaserDecorator extends RobotDecorator {

  /**
   * Creates a laser decorator.
   *
   * @param decoratedRobot the robot to decorate
   */
  public LaserDecorator(Robot decoratedRobot) {
    super(decoratedRobot);
  }

  @Override
  public String getDescription() {
    return decoratedRobot.getDescription() + ", Laser Weapons";
  }

  @Override
  public int getPower() {
    return decoratedRobot.getPower() + 20;
  }

  @Override
  public Parent getVisual() {
    StackPane pane = (StackPane) decoratedRobot.getVisual();

    ImageView laserImage = new ImageView(new Image("jetpack.png"));
    laserImage.setFitWidth(100);
    laserImage.setFitHeight(100);
    pane.getChildren().add(laserImage);

    return pane;
  }
}