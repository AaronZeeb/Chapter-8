
import javax.swing.JApplet;
import java.awt.*;

public class recursiveTriangle extends JApplet
{
    private final int APPLET_WIDTH = 800;
    private final int APPLET_HEIGHT = 800;

    /*
    //x is across and y is down
    point 1 - Right  A x[0],y[0] (720,600)
    point 2 - Left   B x[1],y[1]
    point 3 - Top    C x[2],y[2]
    point 4 draws back to point 1 to complete triangle

    */
    private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};


    //-----------------------------------------------------------------
    //  Sets up the basic applet environment.
    //-----------------------------------------------------------------
    public void init()
    {
       setBackground (Color.white);
       setSize (APPLET_WIDTH, APPLET_HEIGHT);
    }

    //-----------------------------------------------------------------
    //  Draws a Triangle using polygons.
    //-----------------------------------------------------------------
    public void paint (Graphics page)
    {

         page.setColor (Color.red);
         page.drawPolyline (xPos, yPos, xPos.length);

         Triangle(xPos,yPos,page);

    }//end of paint

    public void Triangle(int[] xPos, int[] yPos, Graphics page)
    {
        //Find the distance between 2 points ex. - x,y & x1,y1
        double distance=(Math.sqrt(Math.pow(xPos[1]-xPos[2],2))+(Math.pow(yPos[1]-yPos[2],2)));
        if (distance >10)
        {
            //find the mid points of each line segment
            
            //make the x and y array (3 points + first point to finish triangle)
            //{ABMidx, BCMidx, CAMidx, ABMidx};
        
            int ABMidx=(xPos[0]+xPos[1])/2;
            int BCMidx=(xPos[1]+xPos[2])/2;
            int CAMidx=(xPos[2]+xPos[3])/2;
            
            int ABMidy=(yPos[0]+yPos[1])/2;
            int BCMidy=(yPos[1]+yPos[2])/2;
            int CAMidy=(yPos[2]+yPos[3])/2;
                       
            //int[] xMid={ABMidx, BCMidx, CAMidx, ABMidx}; 
            //int[] yMid={ABMidy, BCMidy, CAMidy, ABMidy};            
            
            //draw the Triangle        

            //create 3 x,y Array using the midpoints you calculated
            //example
            //int[] ATrix = {xPos[0],Segment1Midx,Segment2Midx, xPos[0]};
            
            int[] xMid={xPos[0], BCMidx, CAMidx, xPos[0]}; 
            int[] yMid={yPos[0], BCMidy, CAMidy, yPos[0]};
            
            int[] xMid2={ABMidx, xPos[1], CAMidx, ABMidx}; 
            int[] yMid2={ABMidy, yPos[1], CAMidy, ABMidy};
            
            int[] xMid3={ABMidx, BCMidx, xPos[2], ABMidx}; 
            int[] yMid3={ABMidy, BCMidy, yPos[2], ABMidy};
            
            
            page.setColor (Color.black);
            page.drawPolyline (xMid, yMid, xMid.length);
            page.drawPolyline (xMid2, yMid2, xMid2.length);
            page.drawPolyline (xMid3, yMid3, xMid3.length);

            //Three recursive calls for each section of triangle
            Triangle(xMid,yMid,page);  
            Triangle(xMid2,yMid2,page);
            Triangle(xMid3,yMid3,page);
        }

    }//end of Triangle
}
