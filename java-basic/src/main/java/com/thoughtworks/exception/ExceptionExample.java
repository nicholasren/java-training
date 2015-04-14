package com.thoughtworks.exception;

public class ExceptionExample {

    public static void withCheckedException() throws CheckedException {
        throw new CheckedException("panic");
    }

    public static void withUncheckedException() {
        throw new UncheckedException("don't panic");
    }

    public static void withExceptionOnSignature() throws Exception {
    }
}
