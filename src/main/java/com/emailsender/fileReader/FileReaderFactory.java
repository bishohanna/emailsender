package com.emailsender.fileReader;

public final class FileReaderFactory {

    private static final UsersFileReader READER = new UsersReaderImpl();


    private FileReaderFactory() {
        //contruction not allowed
    }

    public static UsersFileReader get() {
        return READER;
    }
}
