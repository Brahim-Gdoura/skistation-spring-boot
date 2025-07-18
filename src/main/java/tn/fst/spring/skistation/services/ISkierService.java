package tn.fst.spring.skistation.services;

import tn.fst.spring.skistation.entities.Skier;

import java.util.List;

public interface ISkierService {
    List<Skier> retrieveAllSkiers();
    Skier addOrUpdateSkier(Skier skier);
    void removeSkier(Long numSkier);
    Skier retrieveSkier(Long numSkier);
}
