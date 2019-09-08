/*
 * Module requirements in order to build the project using the JavaFX version 11 library.
 * The JavaFX 11 library must be added to the modules for WorldOfTwoVillages project.
 * Only used for Java version 11 or greater.
 */
module WorldOfTwoVillages
  {
  requires javafx.fxml;
  requires javafx.controls;
  requires jdk.jdeps;
  
  opens Assignment3_000797152;
  }