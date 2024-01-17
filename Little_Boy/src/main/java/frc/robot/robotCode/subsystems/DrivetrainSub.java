package frc.robot.robotCode.subsystems;


import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;

public class DrivetrainSub extends SubsystemBase {

  TalonSRX m_rearLeftDrive = new TalonSRX(2);
  TalonSRX m_rearRightDrive = new TalonSRX(3);
  TalonSRX m_frontLeftDrive = new TalonSRX(4);
  TalonSRX m_frontRightDrive = new TalonSRX(5);

  public DrivetrainSub() {
    m_rearRightDrive.setInverted(true);
    m_frontRightDrive.setInverted(true);
  }

  @Override
  public void periodic() {
    //code for driving TODO
  }
}
