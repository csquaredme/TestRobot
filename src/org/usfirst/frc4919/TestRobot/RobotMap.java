// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4919.TestRobot;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogAccelerometer;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController drivetrainLeft;
    public static SpeedController drivetrainRight;
    public static RobotDrive drivetrainTankDriveConfiguration;
    public static AnalogGyro drivetrainAnalogGyro1;
    public static AnalogInput drivetrainUltrasonicSensor;
    public static AnalogInput drivetrainAnalogInput1;
    public static AnalogAccelerometer drivetrainBuiltinAccelerometer;
    public static SpeedController towerTowerMotor;
    public static AnalogPotentiometer towerTowerSensor;
    public static SpeedController shooterShooterMotor;
    public static Relay shooterFeederMotor;
    public static Relay pickupPickupMotor;
    public static Servo cameraCameraServoMotor;
    public static Relay kickerKickerMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drivetrainLeft = new Talon(0);
        LiveWindow.addActuator("Drivetrain", "Left", (Talon) drivetrainLeft);
        
        drivetrainRight = new Talon(1);
        LiveWindow.addActuator("Drivetrain", "Right", (Talon) drivetrainRight);
        
        drivetrainTankDriveConfiguration = new RobotDrive(drivetrainLeft, drivetrainRight);
        
        drivetrainTankDriveConfiguration.setSafetyEnabled(false);
        drivetrainTankDriveConfiguration.setExpiration(0.1);
        drivetrainTankDriveConfiguration.setSensitivity(0.5);
        drivetrainTankDriveConfiguration.setMaxOutput(1.0);

        drivetrainAnalogGyro1 = new AnalogGyro(0);
        LiveWindow.addSensor("Drivetrain", "AnalogGyro 1", drivetrainAnalogGyro1);
        drivetrainAnalogGyro1.setSensitivity(0.007);
        drivetrainUltrasonicSensor = new AnalogInput(2);
        LiveWindow.addSensor("Drivetrain", "Ultrasonic Sensor", drivetrainUltrasonicSensor);
        
        drivetrainAnalogInput1 = new AnalogInput(3);
        LiveWindow.addSensor("Drivetrain", "Analog Input 1", drivetrainAnalogInput1);
        
        drivetrainBuiltinAccelerometer = new AnalogAccelerometer(4);
        LiveWindow.addSensor("Drivetrain", "Built in Accelerometer", drivetrainBuiltinAccelerometer);
        drivetrainBuiltinAccelerometer.setSensitivity(0.0);
        drivetrainBuiltinAccelerometer.setZero(2.5);
        towerTowerMotor = new Talon(2);
        LiveWindow.addActuator("Tower", "Tower Motor", (Talon) towerTowerMotor);
        
        towerTowerSensor = new AnalogPotentiometer(1, 1.0, 0.0);
        LiveWindow.addSensor("Tower", "Tower Sensor", towerTowerSensor);
        
        shooterShooterMotor = new Talon(3);
        LiveWindow.addActuator("Shooter", "Shooter Motor", (Talon) shooterShooterMotor);
        
        shooterFeederMotor = new Relay(0);
        LiveWindow.addActuator("Shooter", "Feeder Motor", shooterFeederMotor);
        
        pickupPickupMotor = new Relay(2);
        LiveWindow.addActuator("Pickup", "Pickup Motor", pickupPickupMotor);
        
        cameraCameraServoMotor = new Servo(5);
        LiveWindow.addActuator("Camera", "Camera Servo Motor", cameraCameraServoMotor);
        
        kickerKickerMotor = new Relay(1);
        LiveWindow.addActuator("Kicker", "Kicker Motor", kickerKickerMotor);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}