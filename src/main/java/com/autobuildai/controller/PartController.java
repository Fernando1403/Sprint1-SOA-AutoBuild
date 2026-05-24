package com.autobuildai.controller;

import com.autobuildai.model.Part;
import com.autobuildai.service.PartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parts")
public class PartController {

    private final PartService service;

    public PartController(PartService service) {
        this.service = service;
    }

    @GetMapping
    public List<Part> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Part create(@RequestBody Part part) {
        return service.save(part);
    }

    @GetMapping("/{id}")
    public Part getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
