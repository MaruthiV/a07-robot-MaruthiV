package com.comp301.a07robot;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 * Decorator that adds arm armor to a robot.
 * Increases shield based on armor type.
 */
public class ArmsArmorDecorator extends RobotDecorator {
  private ArmorType armorType;

  /**
   * Creates an arms armor decorator.
   *
   * @param decoratedRobot the robot to decorate
   * @param armorType the type of armor to add
   */
  public ArmsArmorDecorator(Robot decoratedRobot, ArmorType armorType) {
    super(decoratedRobot);
    this.armorType = armorType;
  }

  @Override
  public String getDescription() {
    return decoratedRobot.getDescription() + ", " + armorType + " Arms Armor";
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
      imageName = "arms.png";
    } else {
      imageName = "arms_" + armorType.toString().toLowerCase() + ".png";
    }

    ImageView armsImage = new ImageView(new Image(imageName));
    pane.getChildren().add(armsImage);

    return pane;
  }
}