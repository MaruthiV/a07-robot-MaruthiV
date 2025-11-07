package com.comp301.a07robot;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * Abstract decorator for robot upgrades.
 * Provides default delegation to wrapped robot.
 */
public abstract class RobotDecorator implements Robot {
  protected Robot decoratedRobot;

  /**
   * Creates a decorator wrapping another robot.
   *
   * @param decoratedRobot the robot to wrap
   */
  public RobotDecorator(Robot decoratedRobot) {
    this.decoratedRobot = decoratedRobot;
  }

  @Override
  public String getDescription() {
    return decoratedRobot.getDescription();
  }

  @Override
  public int getHealth() {
    return decoratedRobot.getHealth();
  }

  @Override
  public int getShield() {
    return decoratedRobot.getShield();
  }

  @Override
  public int getPower() {
    return decoratedRobot.getPower();
  }

  @Override
  public Parent getHealthBar() {
    HBox healthBar = new HBox();
    int health = getHealth();

    int fullHearts = health / 10;
    for (int i = 0; i < fullHearts; i++) {
      ImageView heart = new ImageView(new Image("health.png"));
      heart.setFitWidth(30);
      heart.setFitHeight(30);
      healthBar.getChildren().add(heart);
    }

    if (health % 10 > 0) {
      ImageView halfHeart = new ImageView(new Image("health_half.png"));
      halfHeart.setFitWidth(30);
      halfHeart.setFitHeight(30);
      healthBar.getChildren().add(halfHeart);
    }

    return healthBar;
  }

  @Override
  public Parent getShieldBar() {
    HBox shieldBar = new HBox();
    int shield = getShield();

    int fullShields = shield / 10;
    for (int i = 0; i < fullShields; i++) {
      ImageView bar = new ImageView(new Image("bar.png"));
      bar.setFitWidth(30);
      bar.setFitHeight(30);
      shieldBar.getChildren().add(bar);
    }

    if (shield % 10 > 0) {
      ImageView halfBar = new ImageView(new Image("bar_half.png"));
      halfBar.setFitWidth(30);
      halfBar.setFitHeight(30);
      shieldBar.getChildren().add(halfBar);
    }

    return shieldBar;
  }

  @Override
  public abstract Parent getVisual();
}