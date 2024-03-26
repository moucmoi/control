package fr.univ_orleans.iut45.menus;

import static org.junit.Assert.assertTrue;
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

}
