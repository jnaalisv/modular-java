package application;

import library.Library;

// error: package library.internal is not visible
//import library.internal.NotVisibleOutSideLibraryModule;

public class Main {
    public static void main(String[] args) {

        // error: package library.internal is not visible
        //int answer = NotVisibleOutSideLibraryModule.ANSWER;

        final Library library = new Library();
        System.out.println(String.format("The Library has %d books", library.numberOfBooks()));
    }
}
