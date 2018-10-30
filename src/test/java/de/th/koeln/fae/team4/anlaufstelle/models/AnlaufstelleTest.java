package de.th.koeln.fae.team4.anlaufstelle.models;

import de.th.koeln.fae.team4.anlaufstelle.anlaufstelle.models.Anlaufstelle;
import de.th.koeln.fae.team4.anlaufstelle.anlaufstelle.models.AnlaufstellePosition;
import de.th.koeln.fae.team4.anlaufstelle.anlaufstelle.models.MitarbeiterAnlaufstelle;
import de.th.koeln.fae.team4.anlaufstelle.anlaufstelle.repositories.AnlaufstelleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AnlaufstelleTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(AnlaufstelleTest.class);

    @Autowired
    private AnlaufstelleRepository anlaufstelleRepository;

    @Test
    public void createAnlaufstelleExpectCreated() {
        final Anlaufstelle anlaufstelle = new Anlaufstelle();
        anlaufstelle.setName("Campus Gummersbach, TH Köln");
        anlaufstelle.setPosition(new AnlaufstellePosition(51.023088, 7.561995));

        List<MitarbeiterAnlaufstelle> mitarbeiterListe = new ArrayList<>();
        mitarbeiterListe.add(new MitarbeiterAnlaufstelle("Max", "Mustermann"));
        mitarbeiterListe.add(new MitarbeiterAnlaufstelle("Hans", "Wurst"));

        anlaufstelle.setMitarbeiter(mitarbeiterListe);
        LOGGER.info("Created Anlaufstelle:");
        LOGGER.info(anlaufstelle.toString());

        final Anlaufstelle savedAnlaufstelle = this.anlaufstelleRepository.save(anlaufstelle);

        assertNotNull(savedAnlaufstelle);
        assertNotNull(savedAnlaufstelle.getId());

        assertEquals(anlaufstelle.getName(), savedAnlaufstelle.getName());
        assertEquals(anlaufstelle.getPosition(), savedAnlaufstelle.getPosition());
        assertEquals(anlaufstelle.getMitarbeiter(),savedAnlaufstelle.getMitarbeiter());

        LOGGER.info("Saved Anlaufstelle:");
        LOGGER.info(savedAnlaufstelle.toString());
    }
}
