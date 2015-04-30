package org.usfirst.frc.team3467.robot.commands;

import org.usfirst.frc.team3467.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTimedH extends Command {
double m_leftspeed;
double m_rightspeed;
double m_centerspeed;
    public DriveTimedH(double left, double right, double strafe, double time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivebase);
		this.setInterruptible(true);
		
		m_leftspeed   = left;
		m_rightspeed  = right;
		m_centerspeed = strafe;
		setTimeout(time);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivebase.driveTimedHMode(m_leftspeed, m_rightspeed, m_centerspeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
