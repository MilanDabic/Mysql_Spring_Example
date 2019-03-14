//@Author Milan Dabic


package upis_ispis;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Korisnik_Repository  extends CrudRepository<Korisnik, Integer>{

    @Query("select k from Korisnik k where k.username= :username")
    List<Korisnik>pronadjiUsername(String username);

}
