package uvsq;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

  /*  @Test 
    public void methodeMetierTest() {
    	
    	UneClasseMetier u = new UneClasseMetier();
    	u.uneMethodeMetier();
    	
    }

    
    @Test
    public void testInter() {
    	
    	Inter u = new UneClasseMetier();
    	u.uneMethodeMetier();
    	
    }
    */
    @Test 
    public void slf4jTest() {
    	
    	UneClasseMetier u = new UneClasseMetier();
    	u.uneMethodeMetierSlf4j();
    	
    }

}
