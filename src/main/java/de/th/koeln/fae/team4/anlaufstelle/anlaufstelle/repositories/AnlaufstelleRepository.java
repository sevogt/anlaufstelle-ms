package de.th.koeln.fae.team4.anlaufstelle.anlaufstelle.repositories;

import de.th.koeln.fae.team4.anlaufstelle.anlaufstelle.models.Anlaufstelle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnlaufstelleRepository extends CrudRepository<Anlaufstelle, Long> {

//    Iterable<Anlaufstelle> findAnlaufstelles();

}
