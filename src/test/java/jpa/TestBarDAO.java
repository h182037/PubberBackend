package jpa;

import ejb.BarDAO;
import model.Bar;
import model.Prices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
public class TestBarDAO {

    @Autowired
    private BarDAO barDAO;

    @Test
//    @Transactional
    @Rollback(true)
    public void testGetBar() {
        Bar bar = barDAO.getBar(1);
        assertEquals(bar.getName(), "Kronbar");
    }

    @Test
//    @Transactional
    @Rollback(true)
    public void testAddBar() {
        Prices dayprices = new Prices(45, 55, 59, 20, "priser");
        Bar bar = new Bar("Kronbar", "Ved Høgskulen?", "kul og chill og sånn", false, "Bilete her", dayprices, (new Prices()), 18);
        barDAO.addBar(bar);

        List<Bar> bars = barDAO.getBars();
        assertEquals(bar.getName(), bars.get(0).getName());
    }
}
