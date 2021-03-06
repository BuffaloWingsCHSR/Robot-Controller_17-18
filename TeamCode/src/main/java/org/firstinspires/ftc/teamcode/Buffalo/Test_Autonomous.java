package org.firstinspires.ftc.teamcode.Buffalo;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created for team: 5015 Buffalo Wings by Noah Zulick on December 29, 2017 at 11:41 AM .
 */
@Autonomous (name = "Auto Test v 2.0.0")
public class Test_Autonomous extends LinearOpMode{

	private Definitions robot = new Definitions();
	private ElapsedTime runtime = new ElapsedTime(ElapsedTime.Resolution.SECONDS);

	@Override
	public void runOpMode() throws InterruptedException {

		telemetry.addData("Position on Field (with reference to the Relic matt", "back right");
		telemetry.addData("Status", "Initialized");

		boolean jewelGotten = false;
		boolean FORWARD = false;
		boolean BACKWARD = false;



		robot.init(hardwareMap);
		robot.servoInit();
		robot.encoderInit();
		robot.jewelSensor.enableLed(true);



		waitForStart();
		runtime.reset();
		robot.resetEncoders();


		while(opModeIsActive()); {

			telemetry.addData("Status", "Running");
			telemetry.update();


			robot.setDriveForward();
			robot.setBigPos(10);
			robot.runPos();
			robot.setPower(0.6);
			robot.waitForDriveStop();
			robot.setPower(0);




		}
		telemetry.addData("Jewel", "Not Gotten");
		telemetry.update();


	}
}
