package com.languagelab.app.controller;

import com.languagelab.app.model.HistoryMenuModel;
import com.languagelab.app.service.HistoryMenuService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/languagelab/history-menu")
public class HistoryMenuController {

    @Autowired
    private HistoryMenuService service;

    private static Logger logger = LoggerFactory.getLogger(HistoryMenuController.class);

    @GetMapping(value = "/", produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<HistoryMenuModel>> get(@RequestParam(required = false) String title) {
        if (title != null) {
            List<HistoryMenuModel> result = service.findByTitle(title);
            return new ResponseEntity<>(result, HttpStatus.OK);
        }
        else {
            List<HistoryMenuModel> result = service.findAllHistories();
            return new ResponseEntity<>(result, HttpStatus.OK);
        }
    }

    @GetMapping(value = "/language", produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<HistoryMenuModel>> getByLanguage(@RequestParam(required = true) String src,
                                                                @RequestParam(required = true) String tar) {
        List<HistoryMenuModel> result = service.findByLanguage(src, tar);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    @ResponseBody
    public ResponseEntity<HistoryMenuModel> post(@RequestBody HistoryMenuModel model) {
        logger.debug("We will add new title: " + model.getTitle());
        return new ResponseEntity<>(this.service.save(model), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public ResponseEntity<HistoryMenuModel> delete(@PathVariable String id) {
        return new ResponseEntity<>(this.service.delete(id), HttpStatus.OK);
    }

}
