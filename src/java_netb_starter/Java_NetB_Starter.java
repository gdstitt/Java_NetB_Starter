/*
 * Copyright Gregory Stitt
 * 
 */
package java_netb_starter;

import java.lang.annotation.Documented;

@Documented
@interface ClassPreamble {

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
        System.out.println("HelloWorld");
    }

}
