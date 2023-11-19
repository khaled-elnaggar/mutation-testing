package example;

import org.example.Palindrome;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeUnitTest {
  @Test
  public void whenPalindrome_thenAccept() {
    Palindrome palindromeTester = new Palindrome();
    assertTrue(palindromeTester.isPalindrome("noon"));
  }

  @Test
  public void whenNotPalindrome_thanReject() {
    Palindrome palindromeTester = new Palindrome();
    assertFalse(palindromeTester.isPalindrome("box"));
  }

  @Test
  public void whenNotPalindrome_thanReject2() {
    Palindrome palindromeTester = new Palindrome();
    assertFalse(palindromeTester.isPalindrome("neon"));
  }
}
