/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pablo Arriola 
 */
public class WordTypeCounterTest {
    
    public WordTypeCounterTest() {
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
     * Test of main method, of class WordTypeCounter.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("Prueba de add y get.");
      //              return new SplaySet();
        //            return new HashTable();
          //          return new TreeMap1();
        WordSet words =  new RedBlackSet();
        Word palabra1 = new Word("francisco", "b");
        Word palabra2 = new Word("annett", "f");
         
        words.add(palabra1);
        words.add(palabra2);
        
        Word palabraobtenida = words.get(palabra1);
        
        Word palabraesperada = palabra1;
        
        System.out.println("Palabra esperada: " + palabraesperada.getWord());
        System.out.println("Palabra obtenida: " + palabraobtenida.getWord());
        assertEquals(palabraesperada, palabraobtenida);
    }
    
}
