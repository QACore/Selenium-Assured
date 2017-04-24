package qacore.seleniumassured;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.openqa.selenium.WebDriver;

/**
 * A set of assertion methods useful for writing {@link WebDriver} tests. Only failed assertions are recorded. These methods can be used directly: <code>WebDriverAssert.assertTitleEquals(...)</code>, however, they read better if they are referenced through static import:
 *
 * <pre>
 * import static qacore.seleniumassured.WebDriverAssert.*;
 *    ...
 *    assertTitleEquals(...);
 * </pre>
 * 
 * @author Leonardo Carmona da Silva
 *         <ul>
 *         <li><a href="https://br.linkedin.com/in/l3ocarmona">https://br.linkedin.com/in/l3ocarmona</a></li>
 *         <li><a href="https://github.com/LeoCarmona">https://github.com/LeoCarmona</a></li>
 *         </ul>
 *
 * @see AssertionError
 * 
 * @since 1.0.0
 *
 */
public final class WebDriverAssert {

	/**
	 * Asserts that web page title equals to <code>expected</code> title.
	 * 
	 * @param driver
	 *            the <code>driver</code>'s page title to check against <code>expected</code> title
	 * 
	 * @param expected
	 *            <code>expected</code> title
	 */
	public static void assertTitleEquals(WebDriver driver, String expected) {
		assertEquals(expected, driver.getTitle());
	}

	/**
	 * Asserts that web page title not equals to <code>unexpected</code> title.
	 * 
	 * @param driver
	 *            the <code>driver</code>'s page title to check against <code>unexpected</code>
	 * 
	 * @param unexpected
	 *            <code>unexpected</code> title
	 */
	public static void assertTitleNotEquals(WebDriver driver, String unexpected) {
		assertNotEquals(unexpected, driver.getTitle());
	}

	/**
	 * Private constructor (static class)
	 */
	private WebDriverAssert() {

	}

}
