import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

  Contact contact = new Contact("001", "Billy", "Frank", "123 ADAMS ST");

  @Test
  void getContactID() {
    assertEquals("001", contact.getContactID());
  }

  @Test
  void getFirstName() {
    assertEquals("Billy", contact.getFirstName());
  }

  @Test
  void getLastName() {
    assertEquals("Frank", contact.getLastName());
  }

  @Test
  void getAddress() {
    assertEquals("123 ADAMS ST", contact.getAddress());
  }

  @Test
  void testToString() {
    assertEquals(
      "Contact [contactID=001, firstName=Billy, lastName=Frank, address=123 ADAMS ST]",
      contact.toString()
    );
  }
}
