package com.example.atlas.grzyb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
/**
 * Warstwa kontroler zajmuje się komunikacją aplikacji przy użyciu endpointów (np. @GetMapping).
 * Następnie woła odpowiednie metody warstwy serwisowej na koniec czego kieruje odpowiedź.
 **/
@RestController
@RequestMapping("/grzyby")
public class GrzybController {

    @Autowired
    private GrzybService grzybService;//połączenie się z warstwą serwisową

    @GetMapping("/all")//wyświetl wszystkie rekordy
    public ResponseEntity <List<Grzyb>> getAllGrzyby(){
        List <Grzyb> list =grzybService.getAllGrzyby();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/id/{id}")//wyświetl rekord o konkretnym id
    public ResponseEntity <Grzyb> getGrzybById(@PathVariable int id){
        Optional <Grzyb> grzyb = grzybService.getGrzybById(id);
                if(grzyb.isPresent()){
        return new ResponseEntity<>(grzyb.get(),HttpStatus.OK);
                }
                else return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/add")//dodanie nowego rekordu
    public ResponseEntity <?> addGrzyb(@RequestBody Grzyb grzyb){
        if (grzyb != null) {
            grzybService.addGrzyb(grzyb);
            return new ResponseEntity<>(grzyb,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(grzyb,HttpStatus.CREATED);
       //return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/update/{id}")//zaktualizowanie rekordu o konkretnym id
    public ResponseEntity <Grzyb> updateGrzyb(@PathVariable int id, @RequestBody Grzyb grzyb){
        if (grzyb != null) {
            grzybService.putGrzyb(id,grzyb);
            return new ResponseEntity <>(HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
