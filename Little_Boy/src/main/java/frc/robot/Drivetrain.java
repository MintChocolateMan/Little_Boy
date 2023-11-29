package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;

public class Drivetrain {
  private final TalonSRX m_rearLeftDrive = new TalonSRX(0);
  private final TalonSRX m_rearRightDrive = new TalonSRX(1);
  private final TalonSRX m_frontLeftDrive = new TalonSRX(2);
  private final TalonSRX m_frontRightDrive = new TalonSRX(3);

  public void drive(double r, double l) {
    m_rearLeftDrive.set(TalonSRXControlMode.PercentOutput, l);
    m_rearRightDrive.set(TalonSRXControlMode.PercentOutput, r);
    m_frontLeftDrive.set(TalonSRXControlMode.PercentOutput, l);
    m_frontRightDrive.set(TalonSRXControlMode.PercentOutput, r);
  }
}