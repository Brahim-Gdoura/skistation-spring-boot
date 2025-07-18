package tn.fst.spring.skistation.services;

import tn.fst.spring.skistation.entities.Piste;

import java.util.List;

public interface IPisteService {

    List<Piste> retrieveAllPistes();
    Piste addOrUpdatePiste(Piste piste);
    void removePiste (Piste piste);
    Piste retrievePiste (Long numPiste);
}
