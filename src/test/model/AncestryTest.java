package test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.model.Ancestry;

public class AncestryTest {
    Ancestry ancestry;
    String elf = "ELF";

    @Before
    public void runBefore() {
        ancestry = new Ancestry(elf);

    }

    @Test
    public void testConstructor() {
        assertEquals(elf, ancestry.getName());
    }

    @Test
    public void testGetName() {
        assertFalse(ancestry.getName().equals("DWARF"));
        assertTrue(ancestry.getName().equals("ELF"));
    }

    @Test
    public void testSetName() {
        String dwarf = "DWARF";

        ancestry.setName(dwarf);
        assertEquals(dwarf, ancestry.getName());
    }
}
