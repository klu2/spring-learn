package net.klu2.springlearn.angularjs.repositories;

import net.klu2.springlearn.angularjs.domain.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, String> {

}
