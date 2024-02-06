package tourism.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tourism.model.TouristAttraction;
import tourism.service.TouristService;

import java.util.List;

@Controller
@RequestMapping(path = "attraction")
public class TouristController {

    TouristService touristService;
    public TouristController(){
        this.touristService = new TouristService();
    }

    @GetMapping(path = "attractions")
    public ResponseEntity<List<TouristService>> getTouristService(){
        List touristList = touristService.getTouristAttractionArrayListService();

        return new ResponseEntity<List<TouristService>>(touristList, HttpStatus.OK);
    }





}
