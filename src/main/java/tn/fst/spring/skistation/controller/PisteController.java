package tn.fst.spring.skistation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.fst.spring.skistation.entities.Color;
import tn.fst.spring.skistation.entities.Piste;
import tn.fst.spring.skistation.services.IPisteService;

//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/piste")
public class PisteController {


    private int length;
    private int slope;
    @Autowired
    IPisteService pisteservice;
    //id_piste	color	length	name_piste	slope
    //http://localhost:8082/piste/addOrUpdatePiste
    //{
    //    "idPiste": 1,
    //    "namePiste": "Red Run",
    //    "color": "RED",
    //    "length": 2000,
    //    "slope": 45
    //  }
    @GetMapping
    public String getRoot() {
        return "Welcome to the SkyStation API";
    }

    @PostMapping(value = "/addOrUpdatePiste")
    @ResponseBody
    Piste addOrUpdatePiste(@RequestBody Piste piste){

        pisteservice.addOrUpdatePiste(piste);

        return piste;
    }

    //Piste retrievePiste (Long numPiste) {}

    //List<Piste> retrieveAllPistes(){}

    // void removePiste (Piste piste){}



    //{
    //    "idPiste": 2,
    //    "namePiste": "Blue Run",
    //    "color": "BLUE",
    //    "length": 3000,
    //    "slope": 35
    //  },
    //  {
    //    "idPiste": 3,
    //    "namePiste": "Green Run",
    //    "color": "GREEN",
    //    "length": 1000,
    //    "slope": 15
    //  }
}
