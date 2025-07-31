package test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import main.model.npc.System;

public class SystemTest {
    System system;
    String name = "DND";
    double version = 5.0;
    double tolerance = 0.0001;

    @Before
    public void runBefore() {
        system = new System(name, version);
    }

    @Test
    public void testGetName() {
        assertEquals(name, system.getName());

        // system.setName(null);
        // assertNull(system.getName());

        // String emptyString = "";
        // system.setName(emptyString);
        // assertEquals(emptyString, system.getName());
    }

    @Test
    public void testGetVersion() {
        assertEquals(version, system.getVersion(), tolerance);
    }

    @Test
    public void testSetName() {
        String testName = "pathfinder";
        system.setName(testName);

        assertEquals(testName, system.getName());
    }

    @Test
    public void testSetVersion() {
        double testVer = 2.0;
        system.setVersion(testVer);

        assertEquals(testVer, system.getVersion(), tolerance);

    }
}
