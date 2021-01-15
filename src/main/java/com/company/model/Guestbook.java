package main.java.com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Guestbook {
    private List<com.company.model.Entry> entries;

    public Guestbook() {
        this.entries = new ArrayList<>();
    }

    public List<com.company.model.Entry> getEntries() {
        return entries;
    }

    public void addEntry(com.company.model.Entry entry) {
        this.entries.add(entry);
    }
}
