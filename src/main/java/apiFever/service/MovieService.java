package apiFever.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class MovieService {


    @Autowired
    List<String> movieList;

    public List<String> findAllMovies() {
        return movieList;
    }

}
