package com.thoughtworks.exception;

import org.junit.Test;

import static com.thoughtworks.exception.ExceptionExample.*;

public class ExceptionTest {

    @Test
    public void checked_exception_must_be_caught() {
        //try to remove the`try catch` block
        try {
            withCheckedException();
        } catch (CheckedException e) {
//            e.printStackTrace();
        }
    }

    @Test
    public void unchecked_exception_can_be_ignored() {
        withUncheckedException();
    }

    @Test
    public void exception_on_signature_may_lie() {
        //try to remove the`try catch` block
        try {
            withExceptionOnSignature();
        } catch (Exception e) {
            System.out.println("");
            e.printStackTrace();
        }
    }
}
