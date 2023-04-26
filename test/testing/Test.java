/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

import com.atomev8.swing.blurhash.BlurHash;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author CP-20MAB
 */
public class Test {
    public static void main(String[] args){
        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\cp-20mab\\Java\\chatAppV3\\src\\com\\atomev8\\icon\\testing\\testImage2.jpg"));
            String blurhashStr = BlurHash.encode(image); //LGF5]+Yk^6#M@-5c,1J5@[or[Q6.
            System.out.println(blurhashStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
