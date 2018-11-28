package projet;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WelcomeTest {
	  @Test
	  public void evaluatesExpression() {
	    Welcome text = new Welcome();
	    String sum = text.afficher();
	    assertEquals("Welcome to IC", sum);
	  }
	}