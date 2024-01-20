package frc.robot.robotCode.RobotKeybindsAndFunctions;

import frc.robot.robotCode.subsystems.DrivetrainSub;
import frc.robot.robotCode.commands.TeleopDrive;

import edu.wpi.first.wpilibj.Joystick;

public class RobotContainer {
    //Controller
    public final static Joystick driver = new Joystick(0);

    //Subsystems
    DrivetrainSub drivetrain;

    public RobotContainer() {
        System.out.println("robotcontainer constructor started");
        drivetrain = new DrivetrainSub(driver);
        //drivetrain.setDefaultCommand(new TeleopDrive(drivetrain));
        configureButtonBindings();
    }

    private void configureButtonBindings() {
    
    }
}