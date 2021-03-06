
import java.applet.Applet;
import java.awt.*;

public class Bullseye extends Applet
{
    //Graphics page;
   //-----------------------------------------------------------------
   //  Paints a bullseye target.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

        drawCircle(100, 100, 500,page);

        //drawCircle(600, 600, 100,page);



      /**/
   }// end of paint

   void drawCircle(int x, int y, float radius,Graphics page) {

      page.drawOval(x,y,(int)radius,(int)radius);
      
      radius *=.75;
      
      x+=radius/5;
      y+=radius/5;
      
      if (radius>100)
      {
        //drawCircle(x,y,radius,page);
        if(x%2==0)
        {
            page.setColor(Color.green);
            drawCircle((int)(x+radius/2),y,radius,page);
            drawCircle((int)(x-radius/2),y,radius,page);
        }
        else
        {
            page.setColor(Color.red);
            drawCircle((int)(x+radius/2),y,radius,page);
            drawCircle((int)(x-radius/2),y,radius,page);
        }
        if(x%2==0)
        {
            page.setColor(Color.yellow);
            drawCircle((int)(y+radius/2),x,radius,page);
            drawCircle((int)(y-radius/2),x,radius,page);
        }
        else
        {
            page.setColor(Color.blue);
            drawCircle((int)(y+radius/2),x,radius,page);
            drawCircle((int)(y-radius/2),x,radius,page); 
        }
        if(x%2==0)
        {
            page.setColor(Color.orange);
            drawCircle((int)(y+radius/2),x,radius,page);
            drawCircle((int)(y-radius/2),x,radius,page);
        }
        else
        {
            page.setColor(Color.pink);
            drawCircle((int)(y+radius/2),x,radius,page);
            drawCircle((int)(y-radius/2),x,radius,page); 
        }
     }
    }//end of drawCircle
}//end of class
