package apiFever.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MovieConfig {

    @Bean
    public List<String> initialiseList(){
        List<String> movieList = new ArrayList<>();

        movieList.add("Up");
        movieList.add("Finding Nemo");
        movieList.add("Toy Story");
        movieList.add("The incredibles");
        movieList.add("Shrek");
        movieList.add("Monsters");
        movieList.add("Lilo & Stich");

        return movieList;

    }


}
