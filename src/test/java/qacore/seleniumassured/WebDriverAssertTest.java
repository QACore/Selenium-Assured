package qacore.seleniumassured;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * 
 * 
 * @author Leonardo Carmona da Silva
 *         <ul>
 *         <li><a href="https://br.linkedin.com/in/l3ocarmona">https://br.linkedin.com/in/l3ocarmona</a></li>
 *         <li><a href="https://github.com/LeoCarmona">https://github.com/LeoCarmona</a></li>
 *         </ul>
 *
 */
public class WebDriverAssertTest {

	@Test
	public void finalClassTest() {
		assertEquals(true, Modifier.isFinal(WebDriverAssert.class.getModifiers()));
	}

	@Test
	public void privateConstructorsTest() throws NoSuchMethodException, SecurityException {
		for (Constructor<?> constructor : WebDriverAssert.class.getDeclaredConstructors())
			assertEquals(true, Modifier.isPrivate(constructor.getModifiers()));
	}

}
