/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_netb_starter;

//import java_netb_starter.ClassPreamble;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.annotation.Annotation;

/**
 *
 * @author Greg
 */
public class ClassPreambleTest {

    public ClassPreambleTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of author method, of class ClassPreamble.
     */
    @Test
    public void testAuthor() {
        System.out.println("author");
        ClassPreamble instance = new ClassPreambleImpl();
        String expResult = "";
        String result = instance.author();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } 

    /**
     * Test of date method, of class ClassPreamble.
     */
    @Test
    public void testDate() {
        System.out.println("date");
        ClassPreamble instance = new ClassPreambleImpl();
        String expResult = "";
        String result = instance.date();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of version method, of class ClassPreamble.
     */
    @Test
    public void testVersion() {
        System.out.println("version");
        ClassPreamble instance = new ClassPreambleImpl();
        int expResult = 0;
        int result = instance.version();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lastModifiedBy method, of class ClassPreamble.
     */
    @Test
    public void testLastModifiedBy() {
        System.out.println("lastModifiedBy");
        ClassPreamble instance = new ClassPreambleImpl();
        String expResult = "";
        String result = instance.lastModifiedBy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lastModified method, of class ClassPreamble.
     */
    @Test
    public void testLastModified() {
        System.out.println("lastModified");
        ClassPreamble instance = new ClassPreambleImpl();
        String expResult = "";
        String result = instance.lastModified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reviewers method, of class ClassPreamble.
     */
    @Test
    public void testReviewers() {
        System.out.println("reviewers");
        ClassPreamble instance = new ClassPreambleImpl();
        String[] expResult = null;
        String[] result = instance.reviewers();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ClassPreambleImpl implements ClassPreamble {

        @Override
        public Class<? extends Annotation> annotationType() {
            //TODO - currently DUMMY value
            Annotation[] annotations = this.getClass().getDeclaredAnnotations();
            if (annotations.length > 0) {
                return annotations[0].annotationType();
            } else {
                return null;
            }
        }

        public String author() {
            return "";
        }

        public String date() {
            return "";
        }

        public int version() {
            return 0;
        }

        public String lastModifiedBy() {
            return "";
        }

        public String lastModified() {
            return "";
        }

        public String[] reviewers() {
            return null;
        }
    }

}
