package fr.univ_orleans.iut45.menus;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;


public class AppTest 
{
    @Test
    public void testPrixPlats()
    {
        Plat carottes_rapees = new Plat("Carottes Rapées", false, new ArrayList<String>(), 0.5);
        ArrayList<String> allergenes_pb = new ArrayList<String>();
        allergenes_pb.add("gluten");
        allergenes_pb.add("fruits à coque");
        Plat paris_brest = new Plat ("Paris-Brest", false, allergenes_pb, 2.5);
        assertTrue(carottes_rapees.prixDeRevient() < paris_brest.prixDeRevient());
    }

    @Test
    public void testListeEntrees()
    {
        Plat carottes_rapees = new Plat("Carottes Rapées", false, new ArrayList<String>(), 0.5);
        ArrayList<Plat> les_entrees = new ArrayList<Plat>();
        les_entrees.add(carottes_rapees);
        Menu ce_midi = new Menu(les_entrees, new ArrayList<Plat>(), new ArrayList<Plat>());
        assertEquals(1, ce_midi.getEntrees().size());
    }

}
