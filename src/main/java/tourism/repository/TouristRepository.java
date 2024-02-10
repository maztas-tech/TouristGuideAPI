package tourism.repository;

import org.springframework.stereotype.Repository;
import tourism.model.TouristAttraction;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    //TODO: Change this list to Set
    private List<TouristAttraction> touristAttractionArrayList = new ArrayList<>(List.of(
            new TouristAttraction("København Zoo", "Søde dyr"),
            new TouristAttraction("Amalienborg", "Se det royale"),
            new TouristAttraction("Rundetårn", "Et rundt tårn")
    ));

    public List<TouristAttraction> getTouristAttractionArrayList(){
        return touristAttractionArrayList;
    }

    public TouristAttraction addAttraction(TouristAttraction touristAttraction){
            getTouristAttractionArrayList().add(touristAttraction);
        return touristAttraction;
    }

    public boolean deleteAttraction(String attractionName){
        TouristAttraction found = null;
        for (TouristAttraction touristAttraction: touristAttractionArrayList){
            if (touristAttraction.getName().equalsIgnoreCase(attractionName)){
                found = touristAttraction;
            }
            if (found != null){
                return touristAttractionArrayList.remove(found);
            }
        }
        return false;
    }

    public TouristAttraction changeAttraction(TouristAttraction touristAttraction, String updatedAttractionName, String updatedAttractionDescription){
        TouristAttraction changed = null;
        for (TouristAttraction touristAttractions: touristAttractionArrayList){
            if (touristAttractions.getName().equalsIgnoreCase(touristAttraction.getName())){
                changed = touristAttraction;
            }
            if (changed != null){
                touristAttraction.setName(updatedAttractionName);
                touristAttraction.setDescription(updatedAttractionDescription);

                return changed;
            }
        }
        return changed;
    }

    public TouristAttraction searchAttractions(String name){
        TouristAttraction found = null;
        for (TouristAttraction touristAttractions: getTouristAttractionArrayList()){
            if (touristAttractions.getName().equalsIgnoreCase(name)){
                found = touristAttractions;
            }
            if (found != null){
                return found;
            }
        }
        return found;
    }
}
