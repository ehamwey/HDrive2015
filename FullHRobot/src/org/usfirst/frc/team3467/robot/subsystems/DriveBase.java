package org.usfirst.frc.team3467.robot.subsystems;

import org.usfirst.frc.team3467.robot.OI;
import org.usfirst.frc.team3467.robot.Robot;
import org.usfirst.frc.team3467.robot.RobotMap;
import org.usfirst.frc.team3467.robot.commands.DriveInHMode;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveBase extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Solenoid centerdrop;
	public Solenoid tractiondrop;
    VictorSP left1, left2, left3, center1, center2, right1, right2, right3;
    private double leftspeed, rightspeed, centerspeed;
	public DriveBase(){
        left1   	 = new VictorSP(RobotMap.DRIVE_LEFT_1);
        left2   	 = new VictorSP(RobotMap.DRIVE_LEFT_2);
        left3   	 = new VictorSP(RobotMap.DRIVE_LEFT_3);
        center1 	 = new VictorSP(RobotMap.DRIVE_CENTER_1);
        center2 	 = new VictorSP(RobotMap.DRIVE_CENTER_2);
        right1  	 = new VictorSP(RobotMap.DRIVE_RIGHT_1);
        right2  	 = new VictorSP(RobotMap.DRIVE_RIGHT_2);
        right3  	 = new VictorSP(RobotMap.DRIVE_RIGHT_3);
        centerdrop   = new Solenoid(RobotMap.SOLENOID_DROP_CENTER);
        tractiondrop = new Solenoid(RobotMap.SOLENOID_DROP_TRACTION);
	}
	public void driveInHMode(){
    	leftspeed  = Robot.oi.leftStick.getY();
    	rightspeed = -(Robot.oi.rightStick.getY()); //negate value due to cims being flipped 
    	centerspeed = (Robot.oi.leftStick.getX()/2) + (Robot.oi.rightStick.getX()/2);

    	left1.set(leftspeed);
    	left2.set(-leftspeed); //negate this value due to gearbox arrangement
    	left3.set(leftspeed);
    	center1.set(centerspeed);
    	center2.set(centerspeed);
    	right1.set(rightspeed);
    	right2.set(-rightspeed); //negate this value due to gearbox arrangement
    	right3.set(rightspeed);
    	
    	if(Robot.tractionMode == true){
    		SmartDashboard.putString("DriveBase Current Mode", "TRACTION");
    	}
    	if(Robot.tractionMode == false){
    		SmartDashboard.putString("DriveBase Current Mode", "AGILITY");
    	}
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        this.setDefaultCommand(new DriveInHMode());
    	
    }
}

