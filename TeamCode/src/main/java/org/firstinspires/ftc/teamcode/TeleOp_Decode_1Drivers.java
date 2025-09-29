package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name="TeleOp-1Drivers_Decode", group="STEAMachines_DECODE")
public class TeleOp_Decode_1Drivers extends LinearOpMode {
    private DcMotor leftDrive;
    private DcMotor rightDrive;

    public void runOpMode() {
        leftDrive = hardwareMap.get(DcMotor.class,"leftDrive");
        rightDrive = hardwareMap.get(DcMotor.class, "rightDrive");
        waitForStart();
        initializeAprilTag();
        while(opModeIsActive()) {
            double leftPower, rightPower;
            double drive = gamepad1.left_stick_y;
            double turn = -gamepad1.right_stick_x;
            leftPower = Range.clip(drive + turn, -1.0, 1.0);
            rightPower = Range.clip(drive - turn, -1.0, 1.0);
            leftDrive.setPower(leftPower);
            rightDrive.setPower(rightPower);
        }
    }
    public void initializeAprilTag() {

    }
}
