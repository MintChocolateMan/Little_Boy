package frc.robot.robotCode.commands;

import frc.robot.robotCode.subsystems.DrivetrainSub;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Joystick;

public class TeleopDrive extends CommandBase {
    private DrivetrainSub drivetrain;
    
    public TeleopDrive(DrivetrainSub drivetrain) {
        this.drivetrain = drivetrain;
        addRequirements(drivetrain);


    }

    @Override
    public void execute() {
        drivetrain.drive();
    }
}
