package com.a1works.commons;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Ahmed Magdy Ezzeldin <a.magdy@a1works.com> on 15/11/15.
 */
public class MayBeTest {

    @Test
    public void testMayBeWithNull(){
        MayBe<String> mayBe = new MayBe<>();
        assertTrue("MayBe object is expected to be empty when it is not", mayBe.isEmpty());
        assertFalse("MayBe.iterator() should return an iterator with 0 elements", mayBe.iterator().hasNext());
        assertNull("MayBe object should return null on calling get()", mayBe.get());
    }

    @Test
    public void testMayBeWithObject(){
        String str = "Some text";
        MayBe<String> mayBe = new MayBe<>(str);
        assertFalse("MayBe.0isEmpty() is expected to return false.", mayBe.isEmpty());
        assertTrue("MayBe.iterator() should return an iterator with 1 element", mayBe.iterator().hasNext());
        assertEquals("MayBe.get() should NOT return the provided string", str, mayBe.get());
    }
}
