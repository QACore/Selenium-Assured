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
	 * Tests if <em>title</em> is empty.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param trim
	 *            if <code>true</code>, all leading and trailing whitespace removed. Otherwise, false.
	 */
	public static void assertTitleIsEmpty(WebDriver driver, boolean trim) {
		String title = driver.getTitle();

		if (trim)
			title = title.trim();

		assertTrue("The title is empty", title.isEmpty());
	}

	/**
	 * Tests if <em>title</em> is empty.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 */
	public static void assertTitleIsEmpty(WebDriver driver) {
		assertTitleIsEmpty(driver, false);
	}

	/**
	 * Tests if <em>title</em> is not empty.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param trim
	 *            if <code>true</code>, all leading and trailing whitespace removed. Otherwise, false.
	 */
	public static void assertTitleIsNotEmpty(WebDriver driver, boolean trim) {
		String title = driver.getTitle();

		if (trim)
			title = title.trim();

		assertFalse("The title <" + title + "> is not empty", title.isEmpty());
	}

	/**
	 * Tests if <em>title</em> is not empty.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 */
	public static void assertTitleIsNotEmpty(WebDriver driver) {
		assertTitleIsNotEmpty(driver, false);
	}

	/**
	 * Tests if the substring of <em>title</em> beginning at the specified index starts with the specified <code>prefix</code>.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param prefix
	 *            the <em>title</em> <code>prefix</code>
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
	 *            the <em>title</em> <code>prefix</code>
	 */
	public static void assertTitleStartsWith(WebDriver driver, String prefix) {
		assertTitleStartsWith(driver, prefix, 0);
	}

	/**
	 * Tests if the substring of <em>title</em> beginning at the specified index starts with the specified <code>prefix</code> ignoring case.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param prefix
	 *            the <em>title</em> <code>prefix</code>
	 * 
	 * @param toffset
	 *            where to begin looking in this string
	 */
	public static void assertTitleStartsWithIgnoreCase(WebDriver driver, String prefix, int toffset) {
		String title = driver.getTitle().toLowerCase();
		prefix = prefix.toLowerCase();

		assertTrue("The title <" + title + "> doesn't start with <" + prefix + "> at index " + toffset, title.startsWith(prefix, toffset));
	}

	/**
	 * Tests if the substring of <em>title</em> beginning at the specified index starts with the specified <code>prefix</code> ignoring case.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param prefix
	 *            the <em>title</em> <code>prefix</code>
	 */
	public static void assertTitleStartsWithIgnoreCase(WebDriver driver, String prefix) {
		assertTitleStartsWithIgnoreCase(driver, prefix, 0);
	}

	/**
	 * Tests if the substring of <em>title</em> does not beginning at the specified index starts with the specified <code>prefix</code>.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param prefix
	 *            the <em>title</em> <code>prefix</code>
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
	 *            the <em>title</em> <code>prefix</code>
	 */
	public static void assertTitleDoesNotStartWith(WebDriver driver, String prefix) {
		assertTitleDoesNotStartWith(driver, prefix, 0);
	}

	/**
	 * Tests if the substring of <em>title</em> does not beginning at the specified index starts with the specified <code>prefix</code> ignoring case.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param prefix
	 *            the <em>title</em> <code>prefix</code>
	 * 
	 * @param toffset
	 *            where to begin looking in this string
	 */
	public static void assertTitleDoesNotStartWithIgnoreCase(WebDriver driver, String prefix, int toffset) {
		String title = driver.getTitle().toLowerCase();
		prefix = prefix.toLowerCase();

		assertFalse("The title <" + title + "> starts with <" + prefix + "> at index " + toffset, title.startsWith(prefix, toffset));
	}

	/**
	 * Tests if the substring of <em>title</em> does not beginning at the specified index starts with the specified <code>prefix</code> ignoring case.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param prefix
	 *            the <em>title</em> <code>prefix</code>
	 */
	public static void assertTitleDoesNotStartWithIgnoreCase(WebDriver driver, String prefix) {
		assertTitleDoesNotStartWith(driver, prefix, 0);
	}

	/**
	 * Tests if <em>title</em> ends with the specified <code>suffix</code>.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param suffix
	 *            the <em>title</em> <code>suffix</code>
	 */
	public static void assertTitleEndsWith(WebDriver driver, String suffix) {
		String title = driver.getTitle();

		assertTrue("The title <" + title + "> doesn't end with <" + suffix + ">", title.endsWith(suffix));
	}

	/**
	 * Tests if <em>title</em> ends with the specified <code>suffix</code> ignoring case.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param suffix
	 *            the <em>title</em> <code>suffix</code>
	 */
	public static void assertTitleEndsWithIgnoreCase(WebDriver driver, String suffix) {
		String title = driver.getTitle().toLowerCase();
		suffix = suffix.toLowerCase();

		assertTrue("The title <" + title + "> doesn't end with <" + suffix + ">", title.endsWith(suffix));
	}

	/**
	 * Tests if <em>title</em> does not end with the specified <code>suffix</code>.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param suffix
	 *            the <em>title</em> <code>suffix</code>
	 */
	public static void assertTitleDoesNotEndWith(WebDriver driver, String suffix) {
		String title = driver.getTitle();

		assertFalse("The title <" + title + "> ends with <" + suffix + ">", title.endsWith(suffix));
	}

	/**
	 * Tests if <em>title</em> does not end with the specified <code>suffix</code> ignoring case.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param suffix
	 *            the <em>title</em> <code>suffix</code>
	 */
	public static void assertTitleDoesNotEndWithIgnoreCase(WebDriver driver, String suffix) {
		String title = driver.getTitle().toLowerCase();
		suffix = suffix.toLowerCase();

		assertFalse("The title <" + title + "> ends with <" + suffix + ">", title.endsWith(suffix));
	}

	/**
	 * Tests if <em>title</em> contains the <code>sequence</code>.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param sequence
	 *            the <code>sequence</code> to search for
	 */
	public static void assertTitleContains(WebDriver driver, String sequence) {
		String title = driver.getTitle();

		assertTrue("The title <" + title + "> does not contain <" + sequence + ">", title.contains(sequence));
	}

	/**
	 * Tests if <em>title</em> contains the <code>sequence</code> ignoring case.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param sequence
	 *            the <code>sequence</code> to search for
	 */
	public static void assertTitleContainsIgnoreCase(WebDriver driver, String sequence) {
		String title = driver.getTitle().toLowerCase();
		sequence = sequence.toLowerCase();

		assertTrue("The title <" + title + "> does not contain <" + sequence + ">", title.contains(sequence));
	}

	/**
	 * Tests if <em>title</em> does not contain the <code>sequence</code>.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param sequence
	 *            the <code>sequence</code> to search for
	 */
	public static void assertTitleDoesNotContain(WebDriver driver, String sequence) {
		String title = driver.getTitle();

		assertFalse("The title <" + title + "> contains <" + sequence + ">", title.contains(sequence));
	}

	/**
	 * Tests if <em>title</em> does not contain the <code>sequence</code>.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param sequence
	 *            the <code>sequence</code> to search for
	 */
	public static void assertTitleDoesNotContainIgnoreCase(WebDriver driver, String sequence) {
		String title = driver.getTitle().toLowerCase();
		sequence = sequence.toLowerCase();

		assertFalse("The title <" + title + "> contains <" + sequence + ">", title.contains(sequence));
	}

	/**
	 * Tests if <em>title</em> matches the given <code>regex</code>.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param regex
	 *            the regular expression to which this string is to be matched
	 */
	public static void assertTitleMatches(WebDriver driver, String regex) {
		String title = driver.getTitle();

		assertTrue("The title <" + title + "> does not match <" + regex + ">", title.matches(regex));
	}

	/**
	 * Tests if <em>title</em> does not match the given <code>regex</code>.
	 * 
	 * @param driver
	 *            the <code>driver</code> where will be checked
	 * 
	 * @param regex
	 *            the regular expression to which this string is to be matched
	 */
	public static void assertTitleDoesNotMatch(WebDriver driver, String regex) {
		String title = driver.getTitle();

		assertFalse("The title <" + title + "> matches <" + regex + ">", title.matches(regex));
	}

	/**
	 * Private constructor (static class)
	 */
	private WebDriverAssert() {

	}

}
