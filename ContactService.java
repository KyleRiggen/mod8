import java.util.ArrayList;

public class ContactService {

  private ArrayList<Contact> contacts;

  public ContactService() {
    contacts = new ArrayList<>();
  }

  public boolean add(Contact contact) {
    boolean alreadyPresent = false;

    for (Contact c : contacts) {
      if (c.equals(contact)) {
        alreadyPresent = true;
      }
    }

    if (!alreadyPresent) {
      contacts.add(contact);
      System.out.println("Contact added");
      return true;
    } else {
      System.out.println("Contact already here");
      return false;
    }
  }

  public boolean remove(String contactID) {
    for (Contact c : contacts) {
      if (c.getContactID().equals(contactID)) {
        contacts.remove(c);
        System.out.println("Contact removed Successfully!");
        return true;
      }
    }
    System.out.println("Contact not present");
    return false;
  }

  public boolean update(
    String contactID,
    String firstName,
    String lastName,
    String numberAddress
  ) {
    for (Contact c : contacts) {
      if (c.getContactID().equals(contactID)) {
        if (!firstName.equals("")) c.setFirstName(firstName);
        if (!lastName.equals("")) c.setLastName(lastName);
        if (!numberAddress.equals("")) c.setNumberAddress(numberAddress);
        System.out.println("Contact updated");
        return true;
      }
    }
    System.out.println("Contact not found");
    return false;
  }
}
