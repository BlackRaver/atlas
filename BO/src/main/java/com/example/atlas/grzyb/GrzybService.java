package com.example.atlas.grzyb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GrzybService {

    @Autowired
    private GrzybRepository grzybRepository;

    public List getAllGrzyby() {
        return grzybRepository.findAll();
    }

    public Optional <Grzyb> getGrzybById(int id) {
        return grzybRepository.findById((long) id);
    }

    public void addGrzyb(Grzyb grzyb) {
        grzybRepository.save(grzyb);
    }

    public void putGrzyb(long id, Grzyb grzyb) {
        Grzyb updateGrzyb = grzybRepository.findById((long)id).get();
        updateGrzyb.setNazwa(grzyb.getNazwa());
        updateGrzyb.setRodzaj(grzyb.getRodzaj());
        updateGrzyb.setCzy_pod_ochrona(grzyb.getCzy_pod_ochrona());
        updateGrzyb.setCzy_trujacy(grzyb.getCzy_trujacy());
        updateGrzyb.setWystepowanie(grzyb.getWystepowanie());
        updateGrzyb.setUwagi(grzyb.getUwagi());
        grzybRepository.save(updateGrzyb);
    }

    public List<Grzyb> getMachingGrzyby(String word) {
        List <Grzyb> matchGrzyby= new ArrayList<>();
        List <Grzyb> allGrzyby=grzybRepository.findAll();
        for (Grzyb grzyb :
                allGrzyby) {
            if(grzyb.getNazwa().contains(word)) {matchGrzyby.add(grzyb);}
            else if(grzyb.getRodzaj().contains(word)) {matchGrzyby.add(grzyb);}
        }
        return matchGrzyby;
    }
}
