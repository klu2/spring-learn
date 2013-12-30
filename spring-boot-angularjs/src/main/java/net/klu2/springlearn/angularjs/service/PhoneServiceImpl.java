package net.klu2.springlearn.angularjs.service;

import net.klu2.springlearn.angularjs.domain.Phone;
import net.klu2.springlearn.angularjs.repositories.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component("phoneService")
@Transactional
public class PhoneServiceImpl implements PhoneService {

    private final PhoneRepository phoneRepository;

    @Autowired
    public PhoneServiceImpl(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @Override
    public List<Phone> findPhones() {
        return phoneRepository.findAll();
    }
}
