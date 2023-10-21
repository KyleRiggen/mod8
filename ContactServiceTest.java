import static org.junit.Assert.*;

import org.junit.Test;

public class ContactServiceTest {

  @Test
  public void testMethodAddPass() {
    ContactService cs = new ContactService();

    Contact c1 = new Contact("001", "Jim", "Frank", "123 ADAMS ST");
    Contact c2 = new Contact("002", "Billy", "Frank", "456 ADAMS ST");
    Contact c3 = new Contact("003", "James", "Frank", "789 ADAMS ST");

    assertEquals(true, cs.add(c1));
    assertEquals(true, cs.add(c2));
    assertEquals(true, cs.add(c3));
  }

  @Test
  public void testMethodAddFail() {
    ContactService cs = new ContactService();

    Contact c1 = new Contact("001", "Jim", "Frank", "123 ADAMS ST");
    Contact c2 = new Contact("002", "Billy", "Frank", "456 ADAMS ST");
    Contact c3 = new Contact("003", "James", "Frank", "789 ADAMS ST");

    assertEquals(true, cs.add(c1));
    assertEquals(false, cs.add(c1));
    assertEquals(true, cs.add(c2));
    assertEquals(true, cs.add(c3));
  }

  /* test the delete method */
  @Test
  public void testMethodDeletePass() {
    ContactService cs = new ContactService();

    Contact c1 = new Contact("001", "Jim", "Frank", "123 ADAMS ST");
    Contact c2 = new Contact("002", "Billy", "Frank", "456 ADAMS ST");
    Contact c3 = new Contact("003", "James", "Frank", "789 ADAMS ST");

    assertEquals(true, cs.add(c1));
    assertEquals(true, cs.add(c2));
    assertEquals(true, cs.add(c3));

    assertEquals(true, cs.remove("003"));
    assertEquals(true, cs.remove("002"));
  }

  /* test the delete method */
  @Test
  public void testMethodDeleteFail() {
    ContactService cs = new ContactService();

    Contact c1 = new Contact("001", "Jim", "Frank", "123 ADAMS ST");
    Contact c2 = new Contact("002", "Billy", "Frank", "456 ADAMS ST");
    Contact c3 = new Contact("003", "James", "Frank", "789 ADAMS ST");

    assertEquals(true, cs.add(c1));
    assertEquals(true, cs.add(c3));
    assertEquals(true, cs.add(c2));

    assertEquals(false, cs.remove("004"));
    assertEquals(true, cs.remove("002"));
  }

  /* test the update method */
  @Test
  public void testUpdatePass() {
    ContactService cs = new ContactService();

    Contact c1 = new Contact("001", "Jim", "Frank", "123 ADAMS ST");
    Contact c2 = new Contact("002", "Billy", "Frank", "456 ADAMS ST");
    Contact c3 = new Contact("003", "James", "Frank", "789 ADAMS ST");

    assertEquals(true, cs.add(c1));
    assertEquals(true, cs.add(c3));
    assertEquals(true, cs.add(c2));

    assertEquals(true, cs.update("003", "Sean", "Paul", ""));
    assertEquals(true, cs.update("002", "Jimmy", "Frank", "124 ADAMS ST"));
  }

  /* test the update method */
  @Test
  public void testUpdateFail() {
    ContactService cs = new ContactService();

    Contact c1 = new Contact("001", "Jim", "Frank", "123 ADAMS ST");
    Contact c2 = new Contact("002", "Billy", "Frank", "456 ADAMS ST");
    Contact c3 = new Contact("003", "James", "Frank", "789 ADAMS ST");

    assertEquals(true, cs.add(c1));
    assertEquals(true, cs.add(c3));
    assertEquals(true, cs.add(c2));

    assertEquals(false, cs.update("004", "Sean", "Paul", ""));
    assertEquals(true, cs.update("002", "Jimmy", "Frank", "124 ADAMS ST"));
  }
}
