package org.usfirst.frc.team3467.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired static into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	    public static int DRIVE_LEFT_1 = 0;
	    public static int DRIVE_LEFT_2 = 1;	
	    public static int DRIVE_LEFT_3 = 2;
	    public static int DRIVE_CENTER_1 = 3;
	    public static int DRIVE_CENTER_2 = 4;
	    public static int DRIVE_RIGHT_1 = 5;
	    public static int DRIVE_RIGHT_2 = 6;
	    public static int DRIVE_RIGHT_3 = 7;
	    public static int SOLENOID_DROP_TRACTION = 1;
	    public static int SOLENOID_DROP_CENTER = 0;
}
