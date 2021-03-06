/**
 * Imran Siddique
 * UIN: 656951860
 * monday at 12 Am
 * Description: I made a collage with the middle some pictures having more width than other and there height will also not work if it is above 600. I tried the best I can but
 * thats all I was able to do.
 */

// import the library with the color information
import java.awt.Color;
import java.io.File;

// Note the name of the class in the following line MUST
// match the name of the file.  This is stored in a file
// named: Template.java 
public class Proj3isiddi5
{
  
  public static void main (String[] args) 
  {
    System.out.println("Begin Java Exection");
    System.out.println("");

    // Select two pictures
    String filename;
    filename = FileChooser.pickAFile();
    System.out.println (filename);
    int pos = filename.lastIndexOf(File.separatorChar);
    String s2 = filename.substring (0, pos);
    System.out.println (s2);
    FileChooser.setMediaPath(s2);
    
    System.out.println (FileChooser.getMediaDirectory());
    Picture pict1 = new Picture(FileChooser.getMediaDirectory() + 
                                File.separator + "bike.png");
    makeBlue ( pict1 );
    System.out.println (pict1);
    
    
    //filename = FileChooser.pickAFile();
    filename = FileChooser.getMediaDirectory() + File.separator + "tower.png";
    System.out.println (filename);
    Picture pict2 = new Picture(filename);
    makeWhite ( pict2 );
    
    System.out.println (pict2);
    
     //filename = FileChooser.pickAFile();
    filename = FileChooser.getMediaDirectory() + File.separator + "pastry.png";
    System.out.println (filename);
    Picture pict3 = new Picture(filename);
    makeRed ( pict3 );
    System.out.println (pict3);
    
    
    
    // call the method to modify the picture
    Picture anotherPicture;
    anotherPicture = createBlankCanvas (pict1, pict2, pict3);
    System.out.println (anotherPicture);
    
    // copy the pixels from pict1 into anotherPicture
    anotherPicture = copyPicture2 (pict1, anotherPicture, 0, 0);
    anotherPicture = copyPicture2 (pict2, anotherPicture, pict1.getWidth(), 0);
    anotherPicture = copyPicture2 (pict3, anotherPicture, pict1.getWidth() + pict2.getWidth(), 0);
    
    // display the picture
    anotherPicture.show();
    
    // Save the picture
    //String fname;
    //fname = FileChooser.pickAFile();
    //System.out.println ("File: " + filename);
    //pict1.write (fname);

    System.out.println("");
    System.out.println("End Java Exection");
  }   // end of the method main
  
  public static void makeBlue (Picture p) 
  {
    
    Pixel pix;
    int x;
    int y;
    
    int width;
    width = p.getWidth();
    System.out.println ( "The width of the picture is: " + width);
    
    int height;
    height = p.getHeight ();
    System.out.println ( "The height of the picture is: " + height);
    
    x = 0;
    while ( x < width )
    {
      y = 0;
      while ( y < height)
      {
        // access the pixel at a specified corredinate location
        pix = p.getPixel (x, y );
       
        int redAmount;
        int greenAmount;
        int blueAmount;
        
        // access the amount of red, green and blue at that pixel
        redAmount = pix.getRed();
        greenAmount = pix.getGreen();
        blueAmount = pix.getBlue();
        
        // manipulate the red, green and blue amounts
        redAmount = 0;
        greenAmount = 0;
        blueAmount = 255 - blueAmount;
        
        // store these new red, green and blue amounts back into the pixel
        pix.setRed(redAmount);
        pix.setGreen(greenAmount);
        pix.setBlue(blueAmount);
        
        y = y + 1;
      }
      x = x + 1;
    }
   }
    
   public static void makeRed (Picture p3) 
  {
    
    Pixel pix;
    int x;
    int y;
    
    int width;
    width = p3.getWidth();
    System.out.println ( "The width of the picture is: " + width);
    
    int height;
    height = p3.getHeight ();
    System.out.println ( "The height of the picture is: " + height);
    
    x = 0;
    while ( x < width )
    {
      y = 0;
      while ( y < height)
      {
        // access the pixel at a specified corredinate location
        pix = p3.getPixel (x, y );
       
        int redAmount;
        int greenAmount;
        int blueAmount;
        
        // access the amount of red, green and blue at that pixel
        redAmount = pix.getRed();
        greenAmount = pix.getGreen();
        blueAmount = pix.getBlue();
        
        // manipulate the red, green and blue amounts
        redAmount = 255- redAmount;
        greenAmount = 0;
        blueAmount = 0;
        
        // store these new red, green and blue amounts back into the pixel
        pix.setRed(redAmount);
        pix.setGreen(greenAmount);
        pix.setBlue(blueAmount);
        
        y = y + 1;
      }
      x = x + 1;
    }
   }
   
    public static void makeWhite (Picture p2) 
  {
    
    Pixel pix;
    int x;
    int y;
    
    int width;
    width = p2.getWidth();
    System.out.println ( "The width of the picture is: " + width);
    
    int height;
    height = p2.getHeight ();
    System.out.println ( "The height of the picture is: " + height);
    
    x = 0;
    while ( x < width )
    {
      y = 0;
      while ( y < height)
      {
        // access the pixel at a specified corredinate location
        pix = p2.getPixel (x, y );
       
        int redAmount;
        int greenAmount;
        int blueAmount;
        
        // access the amount of red, green and blue at that pixel
        redAmount = pix.getRed();
        greenAmount = pix.getGreen();
        blueAmount = pix.getBlue();
        
        // manipulate the red, green and blue amounts
        redAmount = 255 - redAmount;
        greenAmount = 255 - greenAmount;
        blueAmount = 255 - blueAmount;
        
        // store these new red, green and blue amounts back into the pixel
        pix.setRed(redAmount);
        pix.setGreen(greenAmount);
        pix.setBlue(blueAmount);
        
        y = y + 1;
      }
      x = x + 1;
    }
   }
  
  public static Picture createBlankCanvas (Picture p1, Picture p2, Picture p3)
  {
    // get the height and width of my two pictures
    int width1 = p1.getWidth();
    int height1 = p1.getHeight();
    int width2 = p2.getWidth();
    int height2 = p2.getHeight();
    int width3 = p3.getWidth();
    int height3 = p3.getHeight();
    
    // calcuate the width needed for the final picture
    int width4 = width1 + width2 + width3 ;
    int height4;
    if ( height1 > height2 )
      height4 = height1;
    if  ( height2 > height3 )
      height4 = height2;
    else
      height4 = height3;
    
    // create and return the new picture of the proper size
    Picture blankCanvas = new Picture (width4, height4);
    return blankCanvas;
  }
 
  public static Picture copyPicture (Picture pictA, Picture pictC)
  {
    // get the width and height of the picture
    int width = pictA.getWidth();
    int height = pictA.getHeight();
   
    // set up a nested loop (one loop inside another) to access each pixel
    int xLoopCounter;
    int yLoopCounter;
    
    // the outer loop varies the X position (which column the pixel is in)
    for ( xLoopCounter = 0 ; xLoopCounter < width ; xLoopCounter++ )
    {
      // the inner loop varies the Y position (which row the pixel is in)
      for ( yLoopCounter = 0 ; yLoopCounter < height ; yLoopCounter++ )
      {
        // access a pixel and its colors from the first picture
        Pixel pA = pictA.getPixel (xLoopCounter, yLoopCounter); 
        int red = pA.getRed();
        int green = pA.getGreen();
        int blue = pA.getBlue();
        
        // calculate the new position for the pixel information
        int newXPos, newYPos;
        newXPos =  xLoopCounter;
        newYPos =  yLoopCounter;
        
        // save the modified color values
        Pixel pC = pictC.getPixel (newXPos, newYPos);
        pC.setRed(red);
        pC.setGreen(green);
        pC.setBlue(blue);
      }
    }
    
    // add the code to return the newly created picture
    return pictC;
  }  // end of the method to modify the picture
  
  
  public static Picture copyPicture2 (Picture pictA, Picture pictC, int offsetX, int offsetY)
  {
    // get the width and height of the picture
    int width = pictA.getWidth();
    int height = pictA.getHeight();
   
    // set up a nested loop (one loop inside another) to access each pixel
    int xLoopCounter;
    int yLoopCounter;
    
    // the outer loop varies the X position (which column the pixel is in)
    for ( xLoopCounter = 0 ; xLoopCounter < width ; xLoopCounter++ )
    {
      // the inner loop varies the Y position (which row the pixel is in)
      for ( yLoopCounter = 0 ; yLoopCounter < height ; yLoopCounter++ )
      {
        // access a pixel and its colors from the first picture
        Pixel pA = pictA.getPixel (xLoopCounter, yLoopCounter); 
        int red = pA.getRed();
        int green = pA.getGreen();
        int blue = pA.getBlue();
        
        // calculate the new position for the pixel information
        int newXPos, newYPos;
        newXPos =  xLoopCounter + offsetX;
        newYPos =  yLoopCounter + offsetY; 
        
        // save the modified color values
        Pixel pC = pictC.getPixel (newXPos, newYPos);
        pC.setRed(red);
        pC.setGreen(green);
        pC.setBlue(blue);
      }
    }
    
    // add the code to return the newly created picture
    return pictC;
  }  // end of the method to modify the picture
  
  
  
  public static Picture modifyPicture (Picture pictA, 
                                       int startX,    int startY,
                                       int endX,      int endY)
  {
    // get the width and height of the picture
    int width = pictA.getWidth();
    int height = pictA.getHeight();
    
    // determine the width and height of the cropped portion
    int cWidth = endX - startX;
    int cHeight = endY - startY;
  
    // create a new Picture to store the grayScale image
    Picture pictC = new Picture (cWidth, cHeight);
    
    // set up a nested loop (one loop inside another) to access each pixel
    int xLoopCounter;
    int yLoopCounter;
    
    // the outer loop varies the X position (which column the pixel is in)
    for ( xLoopCounter = startX ; xLoopCounter < endX ; xLoopCounter++ )
    {
      // the inner loop varies the Y position (which row the pixel is in)
      for ( yLoopCounter = startY ; yLoopCounter < endY ; yLoopCounter++ )
      {
        // access a pixel and its colors from the first picture
        Pixel pA = pictA.getPixel (xLoopCounter, yLoopCounter); 
        int red = pA.getRed();
        int green = pA.getGreen();
        int blue = pA.getBlue();
        
        // calculate the new position for the pixel information
        int newXPos, newYPos;
        newXPos =  xLoopCounter - startX;
        newYPos =  yLoopCounter - startY;
        
        // save the modified color values
        Pixel pC = pictC.getPixel (newXPos, newYPos);
        pC.setRed(red);

      }
    }
    
    // add the code to return the newly created picture
    return pictC;
  }  // end of the method to modify the picture
  
} // end of Lect914b class
