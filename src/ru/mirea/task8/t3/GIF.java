package ru.mirea.task8.t3;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class AnimationCanvas extends Canvas{
    JFrame mF;
    JLabel imPL;

    public AnimationCanvas() throws IOException, InterruptedException {

        String p1 = "C:\\Users\\DENIS\\Pictures\\fot gif\\";
        File folder = new File(p1);
        String[] imgs= folder.list();

        this.imPL =new JLabel();
        this.mF = new JFrame();


        BufferedImage firstImg = ImageIO.read(new File((p1+imgs[0])));



        mF.setSize(firstImg.getWidth(),firstImg.getHeight());
        mF.add(imPL);
        mF.setVisible(true);

        BufferedImage curImg;

        while(this.isVisible())
        {
            for(String imn:imgs)
            {
                curImg = ImageIO.read(new File(p1+imn));
                ImageIcon ic = new ImageIcon(curImg);

                imPL.setIcon(ic);

                Thread.sleep(30);

            }
        }

    }


}


class Main{
    public static void main(String[] args) throws IOException, InterruptedException {
        //launch();
        AnimationCanvas ac = new AnimationCanvas();
    }
}
