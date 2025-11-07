package com.comp301.a07robot;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 * Decorator that adds a jetpack to a robot.
 * Increases shield by 50.
 */
public class JetpackDecorator extends RobotDecorator {

  /**
   * Creates a jetpack decorator.
   *
   * @param decoratedRobot the robot to decorate
   */
  public JetpackDecorator(Robot decoratedRobot) {
    super(decoratedRobot);
  }

  @Override
  public String getDescription() {
    return decoratedRobot.getDescription() + ", Jetpack";
  }

  @Override
  public int getShield() {
    return decoratedRobot.getShield() + 50;
  }

  @Override
  public Parent getVisual() {
    StackPane pane = (StackPane) decoratedRobot.getVisual();

    ImageView jetpackImage = new ImageView(new Image("jetpack.png"));
    pane.getChildren().add(jetpackImage);

    return pane;
  }
}