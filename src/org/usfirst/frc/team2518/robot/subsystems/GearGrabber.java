package org.usfirst.frc.team2518.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team2518.robot.RobotMappings;


public class GearGrabber extends Subsystem {

    DoubleSolenoid gearGrabberSol = new DoubleSolenoid(RobotMappings.controllerUSBport);



    public void initDefaultCommand() {

    }

    public void closeGrabber() {

    }

    public void openGrabber(){

    }
}

