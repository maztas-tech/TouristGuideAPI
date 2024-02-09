package tourism.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tourism.model.TouristAttraction;
import tourism.service.TouristService;

import java.util.List;

@Controller
@RequestMapping(path = "attractions")
public class TouristController {

    TouristService touristService;
    public TouristController(){
        this.touristService = new TouristService();
    }

    @GetMapping(path = "attractionoverview")
    public ResponseEntity<List<TouristService>> getTouristService(){
        List touristList = touristService.getTouristAttractionArrayListService();
        return new ResponseEntity<List<TouristService>>(touristList, HttpStatus.OK);
    }

    @GetMapping(path = "/delete/{name}")
    public ResponseEntity<Boolean> deleteTouristAttraction(@PathVariable("name") String name){
        return new ResponseEntity<>(touristService.deleteAttraction(name), HttpStatus.OK);
    }

    @PostMapping(path = "/add")
    public ResponseEntity<TouristAttraction> addTouristAttraction(@RequestBody TouristAttraction touristAttraction){
        TouristAttraction addTouristAttraction = touristService.addAttraction(touristAttraction);
        return new ResponseEntity<>(addTouristAttraction, HttpStatus.OK);
    }








}
