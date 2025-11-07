package com.comp301.a07robot;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 * Decorator that adds leg armor to a robot.
 * Increases shield based on armor type.
 */
public class LegsArmorDecorator extends RobotDecorator {
  private ArmorType armorType;

  /**
   * Creates a legs armor decorator.
   *
   * @param decoratedRobot the robot to decorate
   * @param armorType the type of armor to add
   */
  public LegsArmorDecorator(Robot decoratedRobot, ArmorType armorType) {
    super(decoratedRobot);
    this.armorType = armorType;
  }

  @Override
  public String getDescription() {
    return decoratedRobot.getDescription() + ", " + armorType + " Legs Armor";
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
      imageName = "legs.png";
    } else {
      imageName = "legs_" + armorType.toString().toLowerCase() + ".png";
    }

    ImageView legsImage = new ImageView(new Image(imageName));
    pane.getChildren().add(legsImage);

    return pane;
  }
}