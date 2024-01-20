package frc.robot.robotCode.RobotKeybindsAndFunctions;

import frc.robot.robotCode.subsystems.DrivetrainSub;
import frc.robot.robotCode.commands.TeleopDrive;

import edu.wpi.first.wpilibj.Joystick;

public class RobotContainer {
    //Controller
    public final static Joystick driver = new Joystick(0);

    //Subsystems
    DrivetrainSub drivetrain = new DrivetrainSub();

    public RobotContainer() {
        drivetrain.setDefaultCommand(new TeleopDrive(drivetrain, driver));
        configureButtonBindings();
    }

    private void configureButtonBindings() {
    
    }
}