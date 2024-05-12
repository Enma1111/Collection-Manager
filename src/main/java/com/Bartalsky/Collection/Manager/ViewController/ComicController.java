package com.Bartalsky.Collection.Manager.ViewController;

import com.Bartalsky.Collection.Manager.MainController.ViewController;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class ComicController {

    private final ViewController viewController;

    public ComicController(ViewController viewController) {
        this.viewController = viewController;
    }

    @GetMapping("/load")
    public String load(@Value("${comic.table.name}") String comicTable) throws JsonProcessingException {
        return viewController.load(comicTable);
    }

    @PostMapping("/save")
    public String save(@RequestBody ComicRequest comicRequest, @Value("${comic.table.name}") String comicTable) {

    }
}
