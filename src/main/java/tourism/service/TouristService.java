package tourism.service;

import org.springframework.stereotype.Service;
import tourism.model.TouristAttraction;
import tourism.repository.TouristRepository;

import java.util.List;

@Service
public class TouristService {

    TouristRepository touristRepository = new TouristRepository();

    public List<TouristAttraction> getTouristAttractionArrayListService(){
        return touristRepository.getTouristAttractionArrayList();
    }

    public boolean deleteAttraction(String attractionName){
        return touristRepository.deleteAttraction(attractionName);
    }

    public TouristAttraction addAttraction(TouristAttraction touristAttraction){
        return touristRepository.addAttraction(touristAttraction);
    }


}
