/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartooncharacter_padilla;
import java.awt.*;
import java.awt.geom.*;
/**
 *
 * @author Shem
 */
public class vehicle extends Frame {
    
    
    public void paint (Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(2.0f);
        g2d.setStroke(bs);  
        
        Color tint = Color.decode("#999999");
        Color bodyColor = Color.decode("#990000");
        Color wheelColor = Color.decode("#111111");
        Color tire = Color.decode("#a0afb3");
        Color headLight = Color.decode("#eedd82");
        
       
        //Chassis
        GeneralPath gp1 = new GeneralPath();
        gp1.moveTo(179, 334);
        gp1.curveTo(135, 342, 111, 298, 100, 279);
        gp1.curveTo(81, 244, 111, 245, 118, 241);        
        gp1.quadTo(177, 229, 233, 222);
        gp1.quadTo(296, 220, 340, 235); 
        gp1.lineTo(530, 238);
        gp1.curveTo(580, 239, 576, 234, 579, 229);
        gp1.quadTo(657, 224, 718, 230);
        gp1.quadTo(782, 241, 829, 265);
        gp1.curveTo(870, 294, 847, 309, 832, 321);
        gp1.quadTo(808, 335, 782, 339);
        gp1.curveTo(788, 250, 725, 249, 711, 251);
        gp1.curveTo(656, 247, 639, 315, 644, 300);
        gp1.quadTo(633,336,634, 348);
        gp1.lineTo(323, 347);
        gp1.quadTo(317,341,313,316);
        gp1.curveTo(305,252,265,253,247,252);
        gp1.curveTo(155,251,171,329,180,334);

        
        g2d.setPaint(bodyColor);
        g2d.fill(gp1);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp1);
        
        //WHEELS
        GeneralPath gp2 = new GeneralPath();
        
        gp2.moveTo(184, 316);
        gp2.curveTo(187, 395, 301, 390, 307, 316);
        gp2.curveTo(301, 234, 190, 227, 184, 316);
        
        
        
        Ellipse2D.Double tireLeft = new Ellipse2D.Double(207, 275, 282-207, 349-275);
        Ellipse2D.Double innertireLeft = new Ellipse2D.Double(233, 301, 257-233, 324-301);
        Ellipse2D.Double tireRight = new Ellipse2D.Double(649, 252, 771-649, 373-252);
        Ellipse2D.Double innertireRight = new Ellipse2D.Double(673, 275, 747-673, 349-275);
        Ellipse2D.Double innertireRight1 = new Ellipse2D.Double(698, 301, 721-698, 325-301);
        Line2D.Double line1 = new Line2D.Double(177, 328, 185, 330.5);
        Line2D.Double line2 = new Line2D.Double(304, 335.5, 315, 336);
        Line2D.Double line3 = new Line2D.Double(636, 336.5, 653, 336);
        Line2D.Double line4 = new Line2D.Double(770, 330, 780, 330);
        Line2D.Double line5 = new Line2D.Double(314, 316, 636, 318);
        Line2D.Double line6 = new Line2D.Double(315, 320, 379, 321);
        Line2D.Double line7 = new Line2D.Double(379, 321, 391, 346);
        g2d.setPaint(Color.BLACK);
        g2d.setPaint(wheelColor);
        g2d.fill(gp2);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp2);
        g2d.setPaint(tire);
        g2d.fill(tireLeft);
        g2d.setPaint(Color.BLACK);
        g2d.draw(tireLeft);
        g2d.draw(innertireLeft);
        g2d.setPaint(wheelColor);
        g2d.fill(tireRight);
        g2d.setPaint(Color.BLACK);
        g2d.draw(tireRight);
        g2d.setPaint(tire);
        g2d.fill(innertireRight);
        g2d.setPaint(Color.BLACK);
        g2d.draw(innertireRight1);
        
        
        g2d.setPaint(Color.BLACK);
        g2d.fill(line1);
        g2d.setPaint(Color.BLACK);
        g2d.draw(line1);
        g2d.draw(line2);
        g2d.draw(line3);
        g2d.draw(line4);
        g2d.draw(line5); 
        g2d.draw(line6); 
        g2d.draw(line7);
        
        
        GeneralPath gp3 = new GeneralPath();
        gp3.moveTo(572,237);
        gp3.quadTo(580, 294, 574, 317);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp3);
        
        
        GeneralPath gp4 = new GeneralPath();
        gp4.moveTo(364.5, 237);
        gp4.quadTo(376, 273, 401, 315);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp4);
        
        
        GeneralPath gp5 = new GeneralPath();
        gp5.moveTo(387, 242);
        gp5.quadTo(394, 241, 420, 244);
        gp5.quadTo(395, 247, 387, 244);
        
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp5);
        
        
        
        GeneralPath gp6 = new GeneralPath();
        gp6.moveTo(180, 229);
        gp6.quadTo(308, 195, 351, 183);
        gp6.quadTo(403, 175, 451, 178);
        
        
            g2d.setPaint(Color.BLACK);
        g2d.draw(gp6);
        
        //windshield
        
        GeneralPath gp7 = new GeneralPath();
        gp7.moveTo(452, 178);
        gp7.quadTo(501, 216, 527, 236);
        gp7.curveTo(582,239,574,229,576, 228);
        gp7.quadTo(457, 177, 454, 178);
        g2d.setPaint(tint);
        g2d.fill(gp7);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp7);
        
        //hood
          
        GeneralPath gp8 = new GeneralPath();
        gp8.moveTo(580, 230);
        gp8.quadTo(583, 232, 581, 235);
        gp8.quadTo(675, 233, 715, 238);
        gp8.curveTo(799, 253,810,269,829, 267);
        
        
        
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp8);
        
        
        
        
        //headlight
        GeneralPath gp9 = new GeneralPath();
        gp9.moveTo(787, 246);
        gp9.quadTo(778, 250, 782,253);
        gp9.quadTo(817, 269, 829, 267);
        gp9.closePath();
        
        
        
        
        
        g2d.setPaint(headLight);
        g2d.fill(gp9);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp9);
        
        
        //Passenger
        
        GeneralPath gp10 = new GeneralPath();
        gp10.moveTo(372, 234);
        gp10.quadTo(355, 199, 356, 189);
        gp10.quadTo(435, 184, 452, 188);
        gp10.quadTo(496, 233, 513, 237);
        gp10.quadTo(379, 236, 374, 234);
        g2d.setPaint(Color.BLACK);
        
        
        g2d.draw(gp10);
        
        GeneralPath gp11 = new GeneralPath();
        gp11.moveTo(405, 234);
        gp11.quadTo(396, 228, 392, 223);
        gp11.quadTo(388, 207, 358, 201);
        g2d.setPaint(Color.BLACK);
        
        
        g2d.draw(gp11);
        
        GeneralPath gp12 = new GeneralPath();
        gp12.moveTo(383, 205);
        gp12.quadTo(381, 198, 384, 195);
        gp12.quadTo(415, 190, 456, 192);
        g2d.setPaint(Color.BLACK);
        
        
        g2d.draw(gp12);
        
    }
    
    
      public static void main(String[] args) 
    {
        
        Color bg =  Color.decode("#dad7de");
        vehicle s = new vehicle();
        s.setUndecorated(false);
        s.setTitle("Vehicle");
        s.setBackground(bg); // s.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        s.setSize(1000,400);
        s.setForeground(Color.BLACK);
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        s.setResizable(false);
       
        
        
    } 
    
}
