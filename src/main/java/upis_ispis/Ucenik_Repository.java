//@Author Milan Dabic


package upis_ispis;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface Ucenik_Repository extends CrudRepository<Ucenik, Integer> {

    @Query("select u from Ucenik u where u.jmbg= :jmbg")
    List<Ucenik>pronadjiJMBG(String jmbg);

    @Query("select u from Ucenik u where u.prezime= :prezime")
    List<Ucenik>pronadjiPrezime(String prezime);
}
