/*
 * Copyright Gregory Stitt
 * 
 */
package java_netb_starter;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.awt.Dimension;
import javax.swing.JFrame;


@Documented
@interface ClassPreamble{

    String author() default "Greg Stitt";

    String date() default "N/A";

    int version() default 1;

    String lastModifiedBy() default "N/A";

    String lastModified() default "N/A";

    String[] reviewers() default "N/A";

}

/**
 * Starting point for a Java application with JUnit tests
 *
 * @author Greg
 */
@ClassPreamble()
public class Java_NetB_Starter {
    
    private Java_NetB_Starter() {
        super();
        System.out.println("Class: Java_NetB_Starter: Constructor()\n");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Appframe frame = new Appframe("HelloWorld App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(700, 400));
        frame.setVisible(true);
        
        
    }

}
