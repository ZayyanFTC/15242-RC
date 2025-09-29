package com.example.meepmeeptesting.Strategy1;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class Autonomous1_DECODE_MeepMeep {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);
        RoadRunnerBotEntity STEAMachines_bot = new DefaultBotBuilder(meepMeep)
                .setConstraints(60,60,Math.toRadians(180), Math.toRadians(180), 15)
                .build();
        STEAMachines_bot.runAction(STEAMachines_bot.getDrive().actionBuilder(new Pose2d(60,15, Math.PI))
                .turn(Math.toRadians(15))
                .lineToX(0)
                .waitSeconds(3)
                .turn(Math.toRadians(-60))
                .strafeTo(new Vector2d(-34, 34))
                .waitSeconds(3)
                .strafeTo(new Vector2d(25, -25))
                .build());
        meepMeep.setBackground(MeepMeep.Background.FIELD_DECODE_OFFICIAL)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(STEAMachines_bot)
                .start();
    }
}
