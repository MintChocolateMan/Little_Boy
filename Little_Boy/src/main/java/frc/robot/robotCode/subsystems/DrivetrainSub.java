package frc.robot.robotCode.subsystems;

import frc.robot.robotCode.ConstantsAndConfigs.Constants;
import frc.robot.robotCode.commands.TeleopDrive;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class DrivetrainSub extends SubsystemBase {
  Joystick driver;
/* 
  WPI_TalonSRX m_rearLeftDrive;
  WPI_TalonSRX m_frontLeftDrive;
  MotorControllerGroup m_left = new MotorControllerGroup(m_rearLeftDrive, m_frontLeftDrive);

  WPI_TalonSRX m_rearRightDrive;
  WPI_TalonSRX m_frontRightDrive;
  MotorControllerGroup m_right = new MotorControllerGroup(m_rearRightDrive, m_frontRightDrive);

  
*/
  DifferentialDrive drivetrain; 

  public DrivetrainSub(Joystick driver) {
    this.driver = driver;

    WPI_TalonSRX m_rearLeftDrive = new WPI_TalonSRX(Constants.DrivetrainConstants.rearLeftMotorPort);
    WPI_TalonSRX m_frontLeftDrive = new WPI_TalonSRX(Constants.DrivetrainConstants.frontLeftMotorPort);
    WPI_TalonSRX m_rearRightDrive = new WPI_TalonSRX(Constants.DrivetrainConstants.rearRightMotorPort);
    WPI_TalonSRX m_frontRightDrive = new WPI_TalonSRX(Constants.DrivetrainConstants.frontRightMotorPort);
    
    MotorControllerGroup m_left = new MotorControllerGroup(m_rearLeftDrive, m_frontLeftDrive);
    MotorControllerGroup m_right = new MotorControllerGroup(m_rearRightDrive, m_frontRightDrive);
    m_right.setInverted(true);
    drivetrain = new DifferentialDrive(m_left, m_right);

    setDefaultCommand(new TeleopDrive(this));
  }

  public void drive() {
    drivetrain.arcadeDrive(driver.getY(), driver.getZ());
  }

  @Override
  public void periodic() {
    //code for driving TODO
  }
}
