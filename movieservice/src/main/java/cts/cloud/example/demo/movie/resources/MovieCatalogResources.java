package cts.cloud.example.demo.movie.resources;

import cts.cloud.example.demo.movie.model.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resources;
import java.util.List;
import java.util.Collections;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResources {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

        return Collections.singletonList(
                new CatalogItem("Transformer", "test", 4)
        );
    }
}
