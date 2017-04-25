package qacore.seleniumassured;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

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
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param expected
	 *            <code>expected</code> title
	 */
	public static void assertTitleEquals(WebDriver driver, String expected) {
		assertEquals(expected, driver.getTitle());
	}

	/**
	 * Asserts that web page title equals ignoring case to <code>expected</code> title.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param expected
	 *            <code>expected</code> title
	 */
	public static void assertTitleEqualsIgnoreCase(WebDriver driver, String expected) {
		assertEquals(expected.toLowerCase(), driver.getTitle().toLowerCase());
	}

	/**
	 * Asserts that web page title not equals to <code>unexpected</code> title.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param unexpected
	 *            <code>unexpected</code> title
	 */
	public static void assertTitleNotEquals(WebDriver driver, String unexpected) {
		assertNotEquals(unexpected, driver.getTitle());
	}

	/**
	 * Asserts that web page title not equals ignoring case to <code>unexpected</code> title.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param unexpected
	 *            <code>unexpected</code> title
	 */
	public static void assertTitleNotEqualsIgnoreCase(WebDriver driver, String unexpected) {
		assertNotEquals(unexpected.toLowerCase(), driver.getTitle().toLowerCase());
	}

	/**
	 * Tests if the substring of <em>title</em> beginning at the specified index starts with the specified <code>prefix</code>.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param prefix
	 *            the <em>title</em> prefix
	 * 
	 * @param toffset
	 *            where to begin looking in this string
	 */
	public static void assertTitleStartsWith(WebDriver driver, String prefix, int toffset) {
		String title = driver.getTitle();

		assertTrue("The title <" + title + "> doesn't start with <" + prefix + "> at index " + toffset, title.startsWith(prefix, toffset));
	}

	/**
	 * Tests if the substring of <em>title</em> beginning at the specified index starts with the specified <code>prefix</code>.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param prefix
	 *            the <em>title</em> prefix
	 */
	public static void assertTitleStartsWith(WebDriver driver, String prefix) {
		assertTitleStartsWith(driver, prefix, 0);
	}

	/**
	 * Tests if the substring of <em>title</em> does not beginning at the specified index starts with the specified <code>prefix</code>.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param prefix
	 *            the <em>title</em> prefix
	 * 
	 * @param toffset
	 *            where to begin looking in this string
	 */
	public static void assertTitleDoesNotStartWith(WebDriver driver, String prefix, int toffset) {
		String title = driver.getTitle();

		assertFalse("The title <" + title + "> starts with <" + prefix + "> at index " + toffset, title.startsWith(prefix, toffset));
	}

	/**
	 * Tests if the substring of <em>title</em> does not beginning at the specified index starts with the specified <code>prefix</code>.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param prefix
	 *            the <em>title</em> prefix
	 */
	public static void assertTitleDoesNotStartWith(WebDriver driver, String prefix) {
		assertTitleDoesNotStartWith(driver, prefix, 0);
	}

	/**
	 * Private constructor (static class)
	 */
	private WebDriverAssert() {

	}

}
