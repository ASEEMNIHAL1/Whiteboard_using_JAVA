package client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.PrintWriter;

public class DrawPanel extends JPanel {
    private int lastX, lastY;
    private PrintWriter out;
    private Color currentColor = Color.BLACK;
    private boolean eraserMode = false;
    private int eraserSize = 20;

    public DrawPanel(PrintWriter out) {
        this.out = out;
        setBackground(Color.WHITE);
        setLayout(new BorderLayout());

        // Create a color palette (Left Side)
        JPanel colorPalette = new JPanel();
        colorPalette.setLayout(new GridLayout(11, 1));
        colorPalette.setPreferredSize(new Dimension(50, 0));

        // Define colors
        Color[] colors = {
                Color.BLACK, Color.RED, Color.BLUE, Color.GREEN,
                Color.ORANGE, Color.MAGENTA, Color.CYAN, Color.PINK,
                Color.YELLOW, Color.GRAY
        };

        // Add color buttons
        for (Color color : colors) {
            JButton colorButton = new JButton();
            colorButton.setBackground(color);
            colorButton.setOpaque(true);
            //colorButton.setBorderPainted(true);
            colorButton.setPreferredSize(new Dimension(40, 40));
            colorButton.addActionListener(e -> {
                currentColor = color;
                eraserMode = false;
            });

            colorPalette.add(colorButton);
        }

        // Eraser button
        JButton eraserButton = new JButton("E");
        eraserButton.addActionListener(e -> {
            currentColor = Color.WHITE;
            eraserMode = true;
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                Graphics g = getGraphics();
                g.setColor(currentColor);

                if(eraserMode) {
                    //draw a circle(eraser)instead of a line
                    g.fillOval(x-eraserSize / 2,y-eraserSize/2,eraserSize,eraserSize);
                    out.println("DRAW " + (x - eraserSize / 2) + " " + (y - eraserSize / 2) + " " + (x + eraserSize / 2) + " " + (y + eraserSize / 2) + " " + currentColor.getRGB());
                } else {
                    //regular drawing (if not in eraser mode)
                    g.drawLine(lastX,lastY,x,y);
                    out.println("DRAW " + lastX + " " + lastY + " " + x + " " + y + " " + currentColor.getRGB());
                }
                lastX = x;
                lastY = y;
            }
        });
        colorPalette.add(eraserButton);

        add(colorPalette, BorderLayout.WEST);

        // Mouse events for drawing
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                lastX = e.getX();
                lastY = e.getY();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                Graphics g = getGraphics();
                g.setColor(currentColor);
                g.drawLine(lastX, lastY, x, y);
                lastX = x;
                lastY = y;
                out.println("DRAW " + lastX + " " + lastY + " " + x + " " + y + " " + currentColor.getRGB());
            }
        });
    }

    public void processDrawMessage(String data) {
        String[] parts = data.split(" ");
        int x1 = Integer.parseInt(parts[0]);
        int y1 = Integer.parseInt(parts[1]);
        int x2 = Integer.parseInt(parts[2]);
        int y2 = Integer.parseInt(parts[3]);
        Color color = new Color(Integer.parseInt(parts[4]));

        Graphics g = getGraphics();
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }
}
