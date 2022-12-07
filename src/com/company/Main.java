package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main {

    public static void main(String[] args) {
        // 创建一个新的JFrame实例
        JFrame frame = new JFrame();

        // 设置窗口的大小
        frame.setSize(1920, 1080);

        // 设置窗口的标题
        frame.setTitle("My Window");

        // 创建一个新的JPanel实例
        JPanel panel = new JPanel();

        // 创建一个新的JToggleButton实例
        JToggleButton button = new JToggleButton();

        // 设置图标
        Icon onIcon = new ImageIcon("SwitchOn.jpg");
        Icon offIcon = new ImageIcon("SwitchOff.jpg");

        // 设置icon和母对象的margin
        button.setMargin(new Insets(0, 0, 0, 0));

        // 设置按钮图标
        button.setIcon(offIcon);
        button.setSelectedIcon(onIcon);

        // 将按钮添加到JPanel中
        panel.add(button);

        // 将JPanel添加到JFrame中
        frame.add(panel);

        // 取消默认的布局管理器
        frame.setLayout(null);

        // 获取容器的宽度和高度
        int containerWidth = frame.getWidth();
        int containerHeight = frame.getHeight();
        // 计算JPanel的坐标
        int panelWidth = 132;
        int panelHeight = 80;
        int x = (containerWidth - panelWidth) / 2;
        int y = (containerHeight - panelHeight) / 2;
        // 设置JPanel的位置
        panel.setBounds(x, y, panelWidth, panelHeight);

        // 设置窗口为可见
        frame.setVisible(true);

        // 为该按钮添加ItemListener
        button.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                // 如果该按钮的状态为选中状态，则打印"Button is ON"
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Button is ON");
                }
                // 如果该按钮的状态为未选中状态，则打印"Button is OFF"
                else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    System.out.println("Button is OFF");
                }
            }
        });
    }
}
