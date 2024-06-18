package com.nniett;

import org.junit.Test;

import static org.junit.Assert.*;

public class Class1Test {

    @Test
    public void this_works() {
        System.out.println("This worked!");
    }

    @Test
    public void this_should_not_work() {
        System.out.println("This did not work");
        assert false;
    }

}