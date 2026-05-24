package com.autobuildai.service;

import com.autobuildai.model.Part;
import com.autobuildai.repository.PartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartService {

    private final PartRepository repository;

    public PartService(PartRepository repository) {
        this.repository = repository;
    }

    public List<Part> findAll() {
        return repository.findAll();
    }

    public Part save(Part part) {
        return repository.save(part);
    }

    public Part findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
