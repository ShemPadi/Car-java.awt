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
 * @author PADILLA
 */

public class CartoonCharacter_PADILLA extends Frame {
    
    public void paint (Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke bs = new BasicStroke(3.0f);
        g2d.setStroke(bs);              
        
        //COLORS
        Color color1 = Color.decode("#52ae31");
        Color bodyColor = Color.decode("#F17B29");
        Color cheek = Color.decode("#f5af6b");
        Color cheek1 = Color.decode("#f39a50");
        Color mouth = Color.decode("#da1a2e");
        Color tongue = Color.decode("#ea3c4f");
        
        GeneralPath gp25 = new GeneralPath();
        gp25.moveTo(293, 264);
        gp25.quadTo(323, 249, 341, 230.90);
        gp25.lineTo(317, 272);
        gp25.lineTo(293, 264);
        g2d.setPaint(bodyColor);
        g2d.fill(gp25);
        
        //SOCK
        GeneralPath gp1 = new GeneralPath();
        gp1.moveTo(185, 368);
        gp1.lineTo(218, 367);
        gp1.lineTo(253, 366); 
        gp1.lineTo(253, 388);
        gp1.lineTo(219, 389);
        gp1.lineTo(218, 367);
        gp1.lineTo(219, 389);
        gp1.lineTo(186, 390);
        gp1.lineTo(185, 368);
        g2d.setPaint(Color.WHITE);
        g2d.fill(gp1);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp1);
        
        
        //RightShoe RTU
        GeneralPath gp2 = new GeneralPath();
        gp2.moveTo(253, 388);
        gp2.lineTo(256,425);
        gp2.lineTo(274,425);
        gp2.lineTo(261,474);
        gp2.curveTo(226, 475, 226, 476, 221.5, 460);
        gp2.lineTo(219, 389);
        gp2.lineTo(253, 388);
       
        g2d.setPaint(color1);
        g2d.fill(gp2);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp2);
        
        GeneralPath gp3 = new GeneralPath();
        gp3.moveTo(274,425);
        gp3.curveTo(312, 424, 312, 442, 312, 450);
        gp3.curveTo(311, 475, 293, 475, 261,474);
        gp3.lineTo(274, 425);
                
        g2d.setPaint(Color.WHITE);
        g2d.fill(gp3);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp3);
        
        //LeftShoe RTU
        
        GeneralPath gp4 = new GeneralPath();
        gp4.moveTo(186, 390);
        gp4.lineTo(219, 389);
        gp4.lineTo(221.5, 460);
        gp4.curveTo(219, 475, 217, 475, 184, 474);
        gp4.lineTo(171, 425);
        gp4.lineTo(186, 425);
        gp4.lineTo(186, 390);
        
        
        g2d.setPaint(color1);
        g2d.fill(gp4);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp4);
        
      
        GeneralPath gp5 = new GeneralPath();
        gp5.moveTo(171,425);
        gp5.curveTo(132, 424, 133, 441, 133, 449);
        gp5.curveTo(134, 475, 159, 478, 184, 474);
        gp5.lineTo(171, 425);
        
        
        g2d.setPaint(Color.WHITE);
        g2d.fill(gp5);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp5);
       
        
        
        //LeftLeg

        GeneralPath gp6 = new GeneralPath();
        gp6.moveTo(185, 368);
        gp6.lineTo(183,271);
        gp6.lineTo(215, 271);
        gp6.lineTo(218, 367);
        gp6.lineTo(185, 368);
       
        g2d.setPaint(bodyColor);
        g2d.fill(gp6);
        
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp6);
        
        
        //RightLeg
        GeneralPath gp7 = new GeneralPath();
        gp7.moveTo(253, 366);
        gp7.lineTo(247, 267);
        gp7.lineTo(215, 267);
        gp7.lineTo(218, 367);
        gp7.lineTo(253, 366);
       
        g2d.setPaint(bodyColor);
        g2d.fill(gp7);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp7);
        
        //head
        
        GeneralPath gp8 = new GeneralPath();
        gp8.moveTo(178, 278);
        gp8.curveTo(234, 280, 294, 265, 295, 264);
        gp8.curveTo(343, 245, 347, 212, 349, 192);
        gp8.curveTo(346, 137, 321, 136, 297, 131);
        gp8.curveTo(280, 86, 253, 84, 239, 79);
        gp8.curveTo(184, 72, 166, 92, 148, 97);
        gp8.curveTo(89, 119, 81, 152, 79, 153);
        gp8.curveTo(61, 194, 82, 231, 81, 234);
        gp8.curveTo(49, 255, 64, 271, 68, 276);
        gp8.curveTo(90, 303, 105, 292, 104, 292);
        gp8.closePath();
        
        g2d.setPaint(bodyColor);
        g2d.fill(gp8);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp8);
        
        
        //LeftHand
        
        GeneralPath gp10 = new GeneralPath();
        gp10.moveTo(132, 287);
        gp10.curveTo(161, 264, 167, 271, 171, 274);
        gp10.curveTo(183, 286, 175, 294, 171, 301);
        gp10.curveTo(146, 323, 142, 318, 137, 309);
       
        g2d.setPaint(bodyColor);
        g2d.fill(gp10);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp10);
        
        GeneralPath gp9 = new GeneralPath();
        gp9.moveTo(126, 260);
        gp9.curveTo(96, 280, 105, 295, 110, 302);
        gp9.curveTo(131, 319, 145, 303, 155, 294);
        
        g2d.setPaint(bodyColor);
        g2d.fill(gp9);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp9);
        
        //RightFin
        
        
        GeneralPath gp12 = new GeneralPath();
        gp12.moveTo(338, 277);
        gp12.curveTo(340, 294, 322, 289, 310, 286);
        gp12.curveTo(288, 282, 297, 267, 295, 265);
        
        g2d.setPaint(bodyColor);
        g2d.fill(gp12);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp12);
        
        GeneralPath gp11 = new GeneralPath();
        gp11.moveTo(339, 233);
        gp11.quadTo(355, 241, 359, 256);
        gp11.quadTo(354, 271, 338, 276);
        gp11.quadTo(322, 275, 317, 272);
      
        
        g2d.setPaint(bodyColor);
        g2d.fill(gp11);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp11);
        
        GeneralPath gp13 = new GeneralPath();
        gp13.moveTo(319, 253);
        gp13.quadTo(327, 255, 333, 256);
        
        
        g2d.setPaint(bodyColor);
        g2d.fill(gp13);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp13);
       
       //leftEyeBrow
       
       GeneralPath gp14 = new GeneralPath();
       gp14.moveTo(127, 108);
       gp14.curveTo(124, 121, 133, 117, 133, 115);
       gp14.quadTo(146, 107, 153, 108);
       gp14.curveTo(163, 101, 149, 98, 149, 98);
       gp14.quadTo(136, 101, 127, 107);

       g2d.setPaint(Color.BLACK);
       g2d.fill(gp14);
       g2d.setPaint(Color.BLACK);
       g2d.draw(gp14);

        //rightEyeBrow
        
       GeneralPath gp15 = new GeneralPath();
       gp15.moveTo(219, 79);
       gp15.curveTo(212, 86, 219, 90, 220, 89);
       gp15.quadTo(227, 86, 243, 88);
       gp15.quadTo(247, 85, 245, 82);
       gp15.quadTo(237, 79, 220, 79);
        
        
       g2d.setPaint(Color.BLACK);
       g2d.fill(gp15);
       g2d.setPaint(Color.BLACK);
       g2d.draw(gp15);
        

        //LeftHand
        
       Line2D.Double line  = new Line2D.Double(69,275,84,261);
       Line2D.Double line2  = new Line2D.Double(83,289,98,271);
       g2d.setPaint(Color.BLACK);
       g2d.draw(line);
       g2d.draw(line2);
        
        
        //Cheek 
        GeneralPath gp16 = new GeneralPath();
        gp16.moveTo(101, 148);
        gp16.quadTo(87, 151, 80, 180);
        gp16.quadTo(84, 218, 97, 220);
        gp16.quadTo(108, 217, 104, 205);
        gp16.quadTo(100, 195, 100, 180);
        gp16.quadTo(108, 154, 103, 148);
        
        g2d.setPaint(cheek);
        g2d.fill(gp16);
        g2d.setPaint(cheek1);
        BasicStroke bs1 = new BasicStroke(0.0f);
        g2d.setStroke(bs1);    
        g2d.draw(gp16);
       
        
        //EyesLeft
        
        g2d.setStroke(bs);
        GeneralPath gp17 = new GeneralPath();
        gp17.moveTo(159, 118);
        gp17.curveTo(126, 121, 122, 157, 124, 153);
        gp17.curveTo(123, 189, 166, 192, 160, 190);
        gp17.curveTo(197, 187, 196, 155, 195, 155);
        gp17.curveTo(196, 118, 155, 117, 160, 118);
        
        g2d.setPaint(Color.WHITE);
        g2d.fill(gp17);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp17);
        
        
        
        //EyesLeftpupil
        
        GeneralPath gp18 = new GeneralPath();
        gp18.moveTo(181, 139);
        gp18.curveTo(168, 140, 171, 153, 170, 154);
        gp18.curveTo(168, 173, 180, 172, 183, 172);
        gp18.curveTo(198, 173, 195, 164, 194, 157);
        gp18.curveTo(195, 141, 186, 139, 182, 139);
        
        
        g2d.setPaint(Color.BLACK);
        g2d.fill(gp18);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp18);
        
        Line2D.Double eyeBrowR1 = new Line2D.Double(124, 144.5, 119, 143);
        Line2D.Double eyeBrowR2 = new Line2D.Double(128, 136, 123, 132);
        g2d.setPaint(Color.BLACK);
        g2d.draw(eyeBrowR1);
        g2d.draw(eyeBrowR2);
        
        //RightEye
        
        GeneralPath gp19 = new GeneralPath();
        gp19.moveTo(240, 101);
        gp19.curveTo(206, 105, 208, 136, 208, 136);
        gp19.curveTo(207, 167, 249, 170, 242, 169);
        gp19.curveTo(280, 162, 275, 137, 275, 135);
        gp19.curveTo(273, 103, 244, 100, 241, 101);
        g2d.setPaint(Color.WHITE);
        g2d.fill(gp19);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp19);
        
       Line2D.Double eyeBrowL1 = new Line2D.Double(256, 103, 259, 99);
       Line2D.Double eyeBrowL2 = new Line2D.Double(265, 109, 268, 106);
       g2d.setPaint(Color.BLACK);
       g2d.draw(eyeBrowL1);
       g2d.draw(eyeBrowL2);
        
        
        //RightEyePupil
        GeneralPath gp20 = new GeneralPath();
        gp20.moveTo(263, 122);
        gp20.curveTo(251, 121, 253, 144, 253, 139);
        gp20.curveTo(252, 155, 267, 154, 264, 153);
        gp20.curveTo(276, 153, 273, 145, 274, 140);
        gp20.curveTo(276, 121, 268, 122, 264, 122);
        g2d.setPaint(Color.BLACK);
        g2d.fill(gp20);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp20);
        
        
        //mouth
        GeneralPath gp21 = new GeneralPath();
        gp21.moveTo(145, 227);
        gp21.curveTo(152, 259, 177, 256, 196, 259);
        gp21.curveTo(265, 258, 288, 220, 286, 218);
       // gp21.curveTo(152, 259, 177, 256, 196, 259);
        gp21.curveTo(303, 165, 237, 175, 258, 173);
        gp21.quadTo(222, 189, 200, 193);
        gp21.quadTo(165, 195, 152, 206);
        gp21.quadTo(144, 218, 144, 225);
        
        g2d.setPaint(mouth);
        g2d.fill(gp21);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp21);
        
        
        //tongue
        
        GeneralPath gp22 = new GeneralPath();
        gp22.moveTo(153, 243);
        gp22.curveTo(160, 208, 202, 227, 190, 222);
        gp22.curveTo(221, 229, 211, 259, 213, 256);
        
        g2d.setPaint(tongue);
        g2d.fill(gp22);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp22);

        
        
        //leftShoeHole
        
        GeneralPath gp23 = new GeneralPath();
        gp23.moveTo(208, 419);
        gp23.curveTo(197, 418, 202, 436, 201, 434);
        gp23.curveTo(200, 452, 210, 451, 209, 450);
        gp23.curveTo(218, 449, 214, 444, 215, 436);
        //gp23.curveTo(219, 452, 215, 432, 215, 435);
        gp23.curveTo(217, 418, 208, 419, 209, 419);
        
        
        
        g2d.setPaint(Color.WHITE);
        g2d.fill(gp23);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp23);
        
        //RightShoeHole
        GeneralPath gp24 = new GeneralPath();
        gp24.moveTo(235, 418);
        gp24.curveTo(224, 418, 229, 428, 228, 433);
        gp24.curveTo(226, 452 , 238, 451, 236, 450);
        gp24.curveTo(247, 450, 240, 440, 242, 435);
        gp24.quadTo(242, 419, 236, 418);
        
        
        g2d.setPaint(Color.WHITE);
        g2d.fill(gp24);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp24);
        
        
        //MissingColor
        
        
  
    }
     
    public static void main(String[] args) 
    {
        
       
        CartoonCharacter_PADILLA s = new CartoonCharacter_PADILLA();
        s.setUndecorated(false);
        s.setTitle("CartoonCharacter");
        s.setBackground(Color.WHITE); // s.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        s.setSize(450,600);
        s.setForeground(Color.BLACK);
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        s.setResizable(false);
       
        
        
    } 

}
