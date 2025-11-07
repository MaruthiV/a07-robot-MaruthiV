package com.comp301.a07robot;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 * Decorator that adds torso armor to a robot.
 * Increases shield based on armor type.
 */
public class TorsoArmorDecorator extends RobotDecorator {
  private ArmorType armorType;

  /**
   * Creates a torso armor decorator.
   *
   * @param decoratedRobot the robot to decorate
   * @param armorType the type of armor to add
   */
  public TorsoArmorDecorator(Robot decoratedRobot, ArmorType armorType) {
    super(decoratedRobot);
    this.armorType = armorType;
  }

  @Override
  public String getDescription() {
    return decoratedRobot.getDescription() + ", " + armorType + " Torso Armor";
  }

  @Override
  public int getShield() {
    return decoratedRobot.getShield() + armorType.getShieldUpgrade();
  }

  @Override
  public Parent getVisual() {
    StackPane pane = (StackPane) decoratedRobot.getVisual();

    String imageName;
    if (armorType == ArmorType.BRONZE) {
      imageName = "torso.png";
    } else {
      imageName = "torso_" + armorType.toString().toLowerCase() + ".png";
    }

    ImageView torsoImage = new ImageView(new Image(imageName));
    pane.getChildren().add(torsoImage);

    return pane;
  }
}