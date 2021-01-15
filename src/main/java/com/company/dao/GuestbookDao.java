package main.java.com.company.dao;

import com.company.model.Entry;
import main.java.com.company.model.Guestbook;

public interface GuestbookDao {
    Guestbook loadGuestbook();
    boolean addEntry (Entry entry);

}

