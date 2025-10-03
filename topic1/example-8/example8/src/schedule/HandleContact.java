package schedule;

import java.util.HashMap;

public class HandleContact {
    private HashMap<String, Contact> listContact;
    public HandleContact() {
        listContact = new HashMap<>();
    }
    public void add(Contact contact) {
        listContact.put( contact.getEmail(), contact);
    }
    public Contact search(String email) {
        if (listContact.containsKey(email)) {
            return listContact.get(email);
        }
        return null;
    }
    public Boolean remove(String email) {
        if (listContact.containsKey(email)) {
            listContact.remove(email);
            return true;
        }
        return false;
    }
    public void show() {
        for (Contact contact : this.listContact.values()) {
            contact.print();
        }
    }
}
