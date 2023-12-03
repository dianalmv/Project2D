package Proyecto;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.io.*;
import java.net.URL;
import javax.imageio.*;
import java.awt.image.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
/**
 * Diana Laura Madrid Villegas
 * 19130080
 */
public class Proyecto extends JFrame {
                Proyecto(){
		setTitle("Titulo del Proyecto");
    		ProyectoPanel P = new ProyectoPanel();
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		getContentPane().add(P);
    		pack();
    		setVisible(true);
   	}
  	public static void main(String args[]) {
  		new Proyecto();
  }
}
  //*****************************************
class ProyectoPanel extends JPanel implements MouseMotionListener{
  	private Image imagen;

    public ProyectoPanel() {
        setPreferredSize(new Dimension(600, 680));
        addMouseMotionListener(this);

    }

 public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        imagen = new ImageIcon(getClass().getResource("/clown.jpg")).getImage();

        g.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
        
        g2d.setColor(new Color(247,179,218));
        Shape rect = new Rectangle2D.Double(0, 0, 600, 700); 
        g2d.fill(rect); 
        
        //detalle blusa
        g2d.setColor(new Color(116,42,67));
        GeneralPath blusadet = new GeneralPath();
        blusadet.moveTo(211, 400);
        blusadet.lineTo(240, 415);
        blusadet.lineTo(363, 418);
        blusadet.curveTo(380, 415, 395, 410, 397, 405);
        blusadet.lineTo(390, 340);
        blusadet.closePath();
        g2d.fill(blusadet);
        
        //piernas
        
        g2d.setColor(new Color(0,0,0));
        GeneralPath piernas = new GeneralPath();
        piernas.moveTo(360, 680);
        piernas.curveTo(370, 670, 370, 644, 363, 636); // primeros puntos de referencia ancho
        piernas.curveTo(435, 546, 410, 465, 362, 425); // segundos puntos de referencia alto
        piernas.lineTo(365, 404);
        piernas.curveTo(355, 407, 320, 395, 313, 390);
        piernas.lineTo(243, 392);
        piernas.lineTo(246, 425);
        piernas.curveTo(190, 474, 190, 557, 246, 634);
        piernas.curveTo(238, 646, 243, 673, 247, 680);
        piernas.closePath();
        g2d.fill(piernas);
        
        //botas
        g2d.setColor(new Color(87,109,194));
        GeneralPath botas = new GeneralPath();
        botas.moveTo(360, 680);
        botas.curveTo(370, 670, 370, 644, 366, 660);
        botas.curveTo(318, 610, 336, 605, 303, 652);
        botas.curveTo(284, 610, 284, 605, 243, 662);
        botas.curveTo(241, 666, 245, 674, 248, 680);
        botas.closePath();
        g2d.fill(botas);
        
        //lineas pierna
        g2d.setColor(new Color(116,42,67));
         float grosor = 3.0f; // Puedes ajustar este valor según tus necesidades
        BasicStroke stroke = new BasicStroke(grosor);
        g2d.setStroke(stroke);
        Line2D line = new Line2D.Double(304, 680, 303, 538); // (x1, y1, x2, y2)
        g2d.draw(line);
        
        QuadCurve2D quadCurve = new QuadCurve2D.Double(303, 537, 292, 522, 275, 523);
        g2d.draw(quadCurve);
        
        QuadCurve2D quadCurve2 = new QuadCurve2D.Double(275, 523, 265, 523, 260, 516);
        g2d.draw(quadCurve2);
        
        QuadCurve2D quadCurve3 = new QuadCurve2D.Double(303, 537, 317, 524, 330, 523);
        g2d.draw(quadCurve3);
        
        QuadCurve2D quadCurve4 = new QuadCurve2D.Double(330, 523, 340, 523, 350, 516);
        g2d.draw(quadCurve4);
        
        
        //detalle capa
        g2d.setColor(new Color(116,42,67));
        GeneralPath capadet = new GeneralPath();
        capadet.moveTo(396, 396);
        capadet.quadTo(403, 400, 404, 391);
        capadet.lineTo(411, 394);
        capadet.lineTo(414, 388);
        capadet.lineTo(412, 388);
        capadet.quadTo(417, 383, 413, 382);
        capadet.lineTo(417, 381);
        capadet.curveTo(420, 393, 429, 387, 425, 378);
        capadet.lineTo(464, 333);
        capadet.lineTo(466, 324);
        capadet.curveTo(473, 336, 483, 324, 480, 321);
        capadet.quadTo(493, 318, 487, 313);
        capadet.lineTo(454, 280);
        capadet.quadTo(482, 280, 460, 260);
        capadet.lineTo(124, 266);
        capadet.lineTo(124, 276);
        capadet.quadTo(124, 286, 132, 281);
        capadet.lineTo(136, 281);
        capadet.lineTo(132, 288);
        capadet.lineTo(108, 300);
        capadet.lineTo(106, 310);
        capadet.lineTo(106, 315);
        capadet.quadTo(111, 321, 116, 320);
        capadet.quadTo(108, 337, 126, 332);
        capadet.quadTo(130, 342, 136, 333);
        capadet.lineTo(196, 370);
        capadet.lineTo(201, 374);
        capadet.curveTo(193, 383, 205, 392, 204, 378);
        capadet.lineTo(208, 379);
        capadet.curveTo(202, 385, 211, 391, 215, 386);
        capadet.closePath();
        g2d.fill(capadet); 

        //blusa
        g2d.setColor(new Color(87,109,194));
        GeneralPath blusa = new GeneralPath();
        blusa.moveTo(313, 390);
        blusa.curveTo(326, 395, 308, 407, 398, 405);
        blusa.lineTo(393, 371);
        blusa.curveTo(437, 381, 467, 386, 483, 386);
        blusa.lineTo(510, 379);
        blusa.lineTo(513, 376);
        blusa.lineTo(509, 365);
        blusa.lineTo(437, 313);
        blusa.lineTo(427, 298);
        blusa.lineTo(420, 292);
        blusa.lineTo(182, 273);
        blusa.lineTo(157, 315);
        blusa.curveTo(129, 340, 124, 359, 132, 394);
        blusa.lineTo(136, 400);
        blusa.curveTo(162, 390, 177, 390, 227, 345);
        blusa.lineTo(227, 358);
        blusa.lineTo(210, 398);
        blusa.closePath();
        g2d.fill(blusa);
        
        //capa hombro
        g2d.setColor(new Color(230,178,164)); //color crema
        GeneralPath capah = new GeneralPath();
        capah.moveTo(485, 313);
        capah.quadTo(491, 309, 487, 306);
        capah.curveTo(494, 306, 494, 301, 484, 298);
        capah.lineTo(486, 295);
        capah.lineTo(458, 281);
        capah.lineTo(454, 282);
        capah.quadTo(452, 293, 446, 285);
        capah.quadTo(444, 283, 446, 290);
        capah.lineTo(433, 296);
        capah.quadTo(430, 296, 434, 300);
        capah.lineTo(431, 306);
        capah.curveTo(430, 310, 443, 318, 446, 307);
        capah.curveTo(447, 317, 462, 317, 462, 307);
        capah.curveTo(461, 311, 471, 319, 474, 308);
        capah.closePath();
        g2d.fill(capah);
        
        
         //cara
        g2d.setColor(Color.WHITE);
        GeneralPath cara = new GeneralPath();
        cara.moveTo(328, 252);
        cara.lineTo(343, 234);
        cara.lineTo(341, 135);
        cara.lineTo(267, 134);
        cara.lineTo(267, 234);
        cara.lineTo(281, 248);
        cara.lineTo(281, 258);
        cara.lineTo(329, 258);
        cara.closePath();
        g2d.fill(cara);
        
        //linea ropa
        g2d.setColor(new Color(3,32,66));
        Line2D liner = new Line2D.Double(384, 368, 393, 371); // (x1, y1, x2, y2)
        g2d.draw(liner);
        
        g2d.setColor(new Color(3,32,66));
        Line2D liner2 = new Line2D.Double(387, 343, 450, 350); // (x1, y1, x2, y2)
        g2d.draw(liner2);
        
        g2d.setColor(new Color(3,32,66));
        Line2D liner3 = new Line2D.Double(206, 284, 167, 351); // (x1, y1, x2, y2)
        g2d.draw(liner3);
        
        //pintura
        g2d.setColor(new Color(71,91,128));
        Ellipse2D circulo = new Ellipse2D.Double(284, 223, 3, 3);
        g2d.draw(circulo);
        
        g2d.setColor(new Color(71,91,128));
        Ellipse2D circulo2 = new Ellipse2D.Double(324, 223, 3, 3);
        g2d.draw(circulo2);
        
        //pestañas
        g2d.setColor(new Color(3,32,66));
        GeneralPath pes1 = new GeneralPath();
        pes1.moveTo(271, 197);
        pes1.quadTo(280, 204, 294, 195);
        pes1.lineTo(293, 190);
        pes1.quadTo(272, 182, 269, 190);
        pes1.closePath();
        g2d.fill(pes1);
        //ojo 1
        g2d.setColor(new Color(230,178,164)); //color crema
        GeneralPath ojo1 = new GeneralPath();
        ojo1.moveTo(271, 195);
        ojo1.quadTo(280, 202, 292, 195);
        ojo1.lineTo(293, 192);
        ojo1.quadTo(272, 182, 269, 192);
        ojo1.closePath();
        g2d.fill(ojo1);
        
        //pestaña2
        g2d.setColor(new Color(3,32,66));
        GeneralPath pes2 = new GeneralPath();
        pes2.moveTo(333, 184);

        pes2.curveTo(310, 193, 310, 199, 331, 199);
        pes2.closePath();
        g2d.fill(pes2);
        //ojo2
        g2d.setColor(new Color(230,178,164)); //color crema
        GeneralPath ojo2 = new GeneralPath();
        ojo2.moveTo(333, 186);

        ojo2.curveTo(310, 193, 310, 199, 333, 197);
        ojo2.closePath();
        g2d.fill(ojo2);
        
        
        //pupila 1
        g2d.setColor(new Color(71,91,128));
        GeneralPath pup1 = new GeneralPath();
        pup1.moveTo(275, 186);
        pup1.curveTo(274, 198, 286, 198, 286, 189);
        pup1.closePath();
        g2d.fill(pup1);
        
        //pupila 2
        GeneralPath pup2 = new GeneralPath();
        pup2.moveTo(322, 190);
        pup2.curveTo(322, 194, 331, 197, 333, 194);
        pup2.lineTo(333, 186);

        pup2.closePath();
        g2d.fill(pup2);
        
        //detallecara
        //boca
        g2d.setColor(new Color(116,42,67));
         float gr= 1.0f; // Puedes ajustar este valor según tus necesidades
        BasicStroke stroke2 = new BasicStroke(gr);
        g2d.setStroke(stroke2);
        QuadCurve2D boca = new QuadCurve2D.Double(322, 226, 304, 232, 288, 225);
        g2d.draw(boca);
        
        //ceja1 
        g2d.setColor(new Color(3,32,66));
        GeneralPath ce1 = new GeneralPath();
        ce1.moveTo(296, 184);
        ce1.quadTo(286, 182, 283, 180);
        ce1.quadTo(279, 178, 268, 183);
        ce1.quadTo(279, 179, 285, 184);
        
        ce1.closePath();
        g2d.fill(ce1);
        
        //lagrima
        GeneralPath lag = new GeneralPath();
        lag.moveTo(276, 212);
        lag.lineTo(275, 221);
        lag.quadTo(279, 226, 279, 219);
        
        lag.closePath();
        g2d.fill(lag);
        
        //detallecuello
        g2d.setColor(new Color(16,2,67)); //vino
        GeneralPath dcue = new GeneralPath();
        dcue.moveTo(280, 241);
        dcue.quadTo(291, 252, 301, 256);
        dcue.lineTo(322, 254);
        dcue.lineTo(330, 246);
        dcue.lineTo(332, 238);
        
        dcue.curveTo(297, 252, 317, 252, 280, 239);
        dcue.closePath();
        g2d.fill(dcue);
        
        
        //cabello
        g2d.setColor(new Color(3,32,66));
        GeneralPath cabello = new GeneralPath();
        cabello.moveTo(389, 212);
        cabello.quadTo(399, 215, 402, 211);
        cabello.quadTo(389, 207, 386, 203);
        cabello.quadTo(401, 195, 388, 184);
        cabello.lineTo(380, 171);
        cabello.quadTo(371, 169, 367, 158);
        cabello.quadTo(353, 114, 293, 125);
        cabello.quadTo(267, 126, 260, 140);
        cabello.lineTo(245, 160);
        cabello.quadTo(221, 170, 222, 189);
        cabello.quadTo(211, 192, 205, 208);
        cabello.quadTo(225, 192, 216, 203);
        cabello.quadTo(213, 206, 216, 210);
        cabello.quadTo(217, 219, 207, 219);
        cabello.quadTo(209, 223, 212, 222);
        cabello.quadTo(210, 226, 211, 226);
        cabello.lineTo(245, 243);
        cabello.quadTo(247, 251, 251, 251);
        cabello.quadTo(250, 240, 251, 246);
        cabello.quadTo(254, 253, 270, 252);
        cabello.quadTo(270, 246, 269, 240);
        cabello.quadTo(271, 248, 281, 249);
        cabello.lineTo(281, 237);
        cabello.quadTo(268, 229, 269, 214);
        cabello.lineTo(269, 189);
        cabello.quadTo(269, 171, 274, 165);
        cabello.lineTo(289, 152);
        cabello.quadTo(282, 166, 299, 176);
        cabello.quadTo(294, 170, 294, 164);
        cabello.quadTo(301, 175, 309, 178);
        cabello.quadTo(310, 182, 308, 189);
        cabello.quadTo(318, 178, 311, 171);
        cabello.quadTo(322, 186, 332, 181);
        cabello.quadTo(335, 189, 330, 205);
        cabello.quadTo(335, 202, 336, 200);
        cabello.quadTo(333, 208, 329, 212);
        cabello.quadTo(323, 221, 330, 236);
        cabello.lineTo(330, 253);
        cabello.lineTo(335, 255);
        cabello.lineTo(331, 256);
        cabello.quadTo(346, 254, 346, 247);
        cabello.quadTo(344, 255, 339, 256);
        cabello.quadTo(349, 259, 349, 251);
        cabello.quadTo(355, 252, 356, 248);
        cabello.quadTo(370, 245, 368, 234);
        cabello.quadTo(371, 251, 373, 242);
        cabello.quadTo(381, 242, 379, 229);
        cabello.quadTo(382, 230, 381, 237);
        cabello.quadTo(387, 228, 383, 223);
        cabello.lineTo(398, 223);
        cabello.closePath();
        g2d.fill(cabello);
        
        
        //capa pecho
        g2d.setColor(new Color(230,178,164)); //color crema
        GeneralPath capa = new GeneralPath();
        capa.moveTo(404, 306);
        capa.lineTo(405, 302);
        capa.quadTo(418, 310, 412, 295);
        capa.lineTo(420, 292);
        capa.quadTo(429, 293, 428, 282);
        capa.curveTo(433, 284, 447, 278, 443, 268);
        capa.lineTo(454, 269);
        capa.quadTo(458, 257, 463, 267);
        capa.quadTo(469, 275, 466, 264);
        capa.curveTo(480, 264, 475, 248, 460, 252);
        capa.curveTo(450, 243, 374, 250, 367, 265);
        capa.curveTo(338, 271, 325, 272, 328, 252);
        capa.curveTo(323, 257, 286, 257, 281, 252);
        capa.lineTo(281, 256);
        capa.curveTo(268, 269, 190, 260, 177, 251);
        capa.curveTo(110, 238, 117, 260, 122, 264);
        capa.curveTo(119, 266, 120, 276, 124, 277);
        capa.lineTo(127, 276);
        capa.quadTo(134, 276, 130, 271);
        capa.lineTo(150, 280);
        capa.lineTo(148, 284);
        capa.quadTo(156, 286, 154, 291);
        capa.quadTo(155, 296, 158, 293);
        capa.quadTo(160, 295, 161, 299);
        capa.quadTo(158, 302, 165, 303);
        capa.lineTo(185, 275);
        capa.lineTo(206, 289);
        capa.lineTo(194, 309);
        capa.quadTo(200, 320, 204, 312);
        capa.quadTo(210, 309, 209, 311);
        capa.quadTo(211, 316, 217, 310);
        capa.lineTo(230, 310);
        capa.quadTo(227, 323, 239, 320);
        capa.quadTo(245, 325, 249, 321);
        capa.quadTo(247, 331, 256, 333);
        capa.quadTo(265, 347, 270, 331);
        capa.quadTo(274, 338, 279, 331);
        capa.lineTo(287, 336);
        capa.quadTo(296, 343, 296, 334);
        capa.lineTo(300, 336);
        capa.lineTo(321, 331);
        capa.quadTo(328, 331, 327, 325);
        capa.quadTo(345, 326, 337, 315);
        capa.quadTo(350, 314, 348, 307);
        capa.lineTo(352, 309);
        capa.quadTo(354, 312, 357, 309);
        capa.quadTo(360, 311, 363, 307);
        capa.quadTo(371, 312, 376, 309);
        capa.quadTo(391, 313, 389, 306); 
        
        
        capa.closePath();
        g2d.fill(capa);
        
        //capa hombro 2
        GeneralPath caph2 = new GeneralPath();
        caph2.moveTo(109, 297);
        caph2.quadTo(99, 298, 105, 305);
        caph2.quadTo(97, 310, 108, 314);
        caph2.lineTo(108, 311);
        caph2.quadTo(117, 309, 110, 304);
        caph2.curveTo(116, 309, 129, 311, 129, 302);
        caph2.quadTo(134, 312, 142, 307);
        caph2.quadTo(155, 310, 148, 298);
        caph2.quadTo(160, 290, 137, 289);
        caph2.lineTo(135, 288);
        caph2.closePath();
        g2d.fill(caph2);
        
       
        
        //péndulo
        
        //mano1
        g2d.setColor(new Color(71,91,128));
        GeneralPath mano1 = new GeneralPath();
        mano1.moveTo(222, 222);
        mano1.curveTo(216, 223, 196, 247, 199, 249);
        mano1.lineTo(191, 260);
        mano1.quadTo(193, 262, 176, 264);
        mano1.quadTo(180, 268, 171, 266);
        mano1.quadTo(169, 273, 176, 274);
        mano1.quadTo(183, 269, 182, 276);
        mano1.quadTo(178, 281, 184, 280);
        mano1.quadTo(187, 277, 187, 279);
        mano1.quadTo(184, 283, 192, 285);
        mano1.quadTo(204, 293, 206, 285);
        mano1.lineTo(211, 287);
        mano1.quadTo(215, 294, 219, 288);
        mano1.quadTo(227, 291, 226, 285);
        mano1.quadTo(217, 284, 223, 282);
        mano1.lineTo(218, 278); 
        mano1.quadTo(215, 270, 219, 262);
        mano1.quadTo(237, 258, 243, 245);
        mano1.quadTo(250, 239, 250, 238); 
        mano1.quadTo(259, 244, 267, 238);
        mano1.lineTo(264, 232); 
        mano1.lineTo(265, 226);
        mano1.lineTo(269, 228); 
        mano1.lineTo(279, 230); 
        mano1.lineTo(281, 228);
        mano1.lineTo(277, 224); 
        mano1.lineTo(273, 224); 
        mano1.lineTo(261, 215); 
        mano1.lineTo(245, 213); 
        mano1.quadTo(255, 205, 270, 207);
        mano1.quadTo(286, 206, 276, 201);
        mano1.quadTo(247, 198, 240, 207);
        mano1.closePath();
        
        g2d.fill(mano1);
        //mano2

        GeneralPath mano2 = new GeneralPath();
        mano2.moveTo(319, 332);
        mano2.quadTo(312, 321, 299, 322);
        mano2.lineTo(281, 332); 
        mano2.quadTo(283, 341, 279, 345);
        mano2.lineTo(281, 346);
        mano2.quadTo(289, 347, 288, 335);
        mano2.quadTo(312, 330, 298, 342);
        mano2.quadTo(299, 349, 306, 349);
        mano2.lineTo(311, 353);
        mano2.lineTo(305, 353);
        mano2.quadTo(295, 345, 287, 344);
        mano2.lineTo(281, 347);
        mano2.quadTo(283, 355, 291, 353);
        mano2.quadTo(303, 366, 328, 368);
        mano2.quadTo(349, 370, 362, 366);
        mano2.quadTo(368, 368, 369, 381);
        mano2.quadTo(377, 379, 375, 385);
        mano2.quadTo(387, 387, 380, 380);
        mano2.lineTo(384, 375);
        mano2.quadTo(391, 379, 385, 368);
        mano2.quadTo(388, 365, 388, 367);
        mano2.quadTo(389, 369, 392, 364);
        mano2.quadTo(386, 358, 393, 351);
        mano2.quadTo(385, 346, 389, 342);
        mano2.quadTo(390, 336, 383, 334);
        mano2.quadTo(378, 328, 372, 333);
        mano2.quadTo(366, 331, 368, 342);
        mano2.quadTo(370, 346, 366, 348);
        
        mano2.closePath();
        g2d.fill(mano2);
        
        
        
        //cartas
        Shape car=new Rectangle2D.Double(276,33,52,75);
        g2d.fill(car);
        
        AffineTransform car1=new AffineTransform();
        car1.setToRotation(100,283,280);
        Shape carta=car1.createTransformedShape(car);
        g2d.fill(carta);

        car1.setToRotation(7,320,240); //102
        Shape carta4=car1.createTransformedShape(car);
        g2d.fill(carta4);
        
        car1.setToRotation(1,300,290);
        Shape carta3=car1.createTransformedShape(car);
        g2d.fill(carta3);
        
        car1.setToRotation(102,300,285); //102
        Shape carta2=car1.createTransformedShape(car);
        g2d.fill(carta2);
        
        car1.setToRotation(5,280,230); //102
        Shape carta5=car1.createTransformedShape(car);
        g2d.fill(carta5);
        
        car1.setToRotation(11,306,259); //102
        Shape carta6=car1.createTransformedShape(car);
        g2d.fill(carta6);
        
        
        //pendulo
        g2d.setColor(Color.white);
        Line2D pli = new Line2D.Double(285, 352, 285, 475); // (x1, y1, x2, y2)
        g2d.draw(pli);
        
        GeneralPath ojp = new GeneralPath();
        ojp.moveTo(262, 481);
        ojp.quadTo(283, 490, 307, 481);
        ojp.quadTo(285, 467, 262, 479);
        ojp.closePath();
        g2d.fill(ojp);
        
        
        
        g2d.setColor(new Color(87,109,194));
        Ellipse2D cir2 = new Ellipse2D.Double(278, 474, 12, 12);
        g2d.fill(cir2);
        
        g2d.setColor(new Color(71,91,128));
        Ellipse2D cir = new Ellipse2D.Double(281, 477, 6, 6);
        g2d.fill(cir);
    }

    public void mouseDragged(MouseEvent ev) {
    }

    public void mouseMoved(MouseEvent ev) {
        Graphics g = getGraphics();
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.white);
        g2.fill(new Rectangle2D.Double(10, 480, 100, 20));
        g2.setColor(Color.black);
        g2.drawString("X:" + ev.getX() + "    Y:" + ev.getY(), 10, 500);
    }
}

