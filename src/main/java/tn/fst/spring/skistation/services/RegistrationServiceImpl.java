package tn.fst.spring.skistation.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.fst.spring.skistation.repositories.RegistrationRepository;
import tn.fst.spring.skistation.entities.Registration;

import java.util.List;

@Service
@Slf4j
public class RegistrationServiceImpl implements IRegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Override
    public List<Registration> retrieveAllRegistrations() {
        return registrationRepository.findAll();
    }

    @Override
    public Registration addOrUpdateRegistration(Registration registration) {
        log.info("Adding/Updating registration: " + registration.toString());
        return registrationRepository.save(registration);
    }

    @Override
    public void removeRegistration(Long numRegistration) {
        registrationRepository.deleteById(numRegistration);
    }

    @Override
    public Registration retrieveRegistration(Long numRegistration) {
        return registrationRepository.findById(numRegistration).orElse(null);
    }
}
