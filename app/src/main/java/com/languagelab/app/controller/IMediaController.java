package com.languagelab.app.controller;

import com.languagelab.app.model.IMediaModel;
import com.languagelab.app.service.IMediaService;
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
@RequestMapping("/languagelab/i-media")
public class IMediaController {

    @Autowired
    private IMediaService service;

    private static Logger logger = LoggerFactory.getLogger(HistoryMenuController.class);

    @GetMapping(value = "/", produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<IMediaModel>> get(@RequestParam(required = true) String keyWord) {
        List<IMediaModel> result = service.findByKeyWord(keyWord);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping(value = "/history", produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<IMediaModel>> getByHistoryId(@RequestParam(required = true) String id) {
        List<IMediaModel> result = service.findByHistoryId(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    @ResponseBody
    public ResponseEntity<IMediaModel> post(@RequestBody IMediaModel model) {
        logger.debug("We will add new title: " + model.getTitle());
        return new ResponseEntity<>(this.service.save(model), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public ResponseEntity<IMediaModel> delete(@PathVariable String id) {
        return new ResponseEntity<>(this.service.delete(id), HttpStatus.OK);
    }

}
