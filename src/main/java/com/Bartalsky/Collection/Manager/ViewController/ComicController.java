package com.Bartalsky.Collection.Manager.ViewController;

import com.Bartalsky.Collection.Manager.MainController.ViewController;
import com.Bartalsky.Collection.Manager.QueryService.ComicQuery;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class ComicController {

    private final ViewController viewController;
    private final ComicQuery comicQuery;
    @Autowired
    public ComicController(ViewController viewController, ComicQuery comicQuery) {
        this.viewController = viewController;
        this.comicQuery = comicQuery;
    }

    @GetMapping("api/comic/load")
    public String load(@Value("${comic.table.name}") String comicTable, Model model) {
        Result<Record> comics = comicQuery.loadComics(comicTable);

        model.addAttribute("comics", comics);

        return "comic";
    }

    @GetMapping("api/comic")
    public String home() {
        return "comic";
    }

//    @PostMapping("/api/comic/save")
//    public String save(@RequestBody ComicRequest comicRequest, @Value("${comic.table.name}") String comicTable) {
//
//    }
}
