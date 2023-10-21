package com.bookmarksync.bookmarksync.exception;

public class BookmarkSyncException extends Exception {
    @Override
    public String getMessage() {
        return message.getMessage();
    }

    private final Message message;

    public BookmarkSyncException(Message message) {
        this.message = message;
    }

    public enum Message {
        EMPTY_INPUT("One or more values from the input are blank or empty");

        public final String message;

        private Message(String message) {
            this.message = message;
        }

        public String getMessage() {
            return this.message;
        }
    }
}
