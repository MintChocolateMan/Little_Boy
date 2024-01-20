package frc.robot.robotCode.commands;

import frc.robot.robotCode.subsystems.DrivetrainSub;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Joystick;

public class TeleopDrive extends CommandBase {
    private DrivetrainSub drivetrain;
    private Joystick driver;
    
    public TeleopDrive(DrivetrainSub drivetrain, Joystick driver) {
        this.drivetrain = drivetrain;
        this.driver = driver;
        addRequirements(drivetrain);


    }

    @Override
    public void execute() {
        drivetrain.drive(driver);
    }
}
