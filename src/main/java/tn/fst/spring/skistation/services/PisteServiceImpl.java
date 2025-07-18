package tn.fst.spring.skistation.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.fst.spring.skistation.repositories.PisteRepository;
import tn.fst.spring.skistation.entities.Piste;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PisteServiceImpl implements IPisteService {

    @Autowired
    private PisteRepository pisteRepository;

    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste addOrUpdatePiste(Piste piste) {
        log.info("piste"+ piste.toString());
        log.debug("DS1..............");
        log.debug("DS2");
        return pisteRepository.save(piste);
    }

    @Override
    public void removePiste(Piste piste) {
        pisteRepository.delete(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        Optional<Piste> pisteOptional = pisteRepository.findById(numPiste);
        return pisteOptional.orElse(null);
    }
}
