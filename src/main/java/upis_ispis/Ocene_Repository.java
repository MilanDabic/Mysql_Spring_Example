//@Author Milan Dabic


package upis_ispis;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Ocene_Repository extends CrudRepository<Ocene, Integer> {

    @Query("select o from Ocene o where o.id_ucenika= :id_ucenika")
    List<Ocene> ocenePoUceniku(Integer id_ucenika);


    @Query("select o from Ocene o where o.id_predmeta= :id_predmeta")
    List<Ocene> ocenePoPredmetu(Integer id_predmeta);
}
