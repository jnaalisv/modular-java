package library;

import library.internal.NotVisibleOutSideLibraryModule;

public class Library {

    public int numberOfBooks() {
        return NotVisibleOutSideLibraryModule.ANSWER;
    }
}
