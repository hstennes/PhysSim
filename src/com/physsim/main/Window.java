package com.physsim.main;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas{

    private static final long serialVersionUID = -1478604005915452565L;

    public Window(int width, int height, String title, PhysSim sim){
        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setTitle(title);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.add(sim);
        frame.setVisible(true);
        sim.start();
    }
}
