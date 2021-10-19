package edu.nubip.sm.profile.web;

import edu.nubip.sm.profile.service.CrudService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public abstract class AbstractRestController<T, ID, S extends CrudService<T, ID>> {
    protected final S service;

    @GetMapping("/")
    public ResponseEntity<?> getAll() {
        List<T> all = service.findAll();
        if (all.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(all);
    }

    @GetMapping("/by/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") ID id) {
        Optional<T> opt = service.findById(id);
        if (opt.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(opt.get());
    }

    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody T obj) {
        Optional<T> opt = service.create(obj);
        if (opt.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(opt.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") ID id, @RequestBody T obj) {
        Optional<T> opt = service.update(id, obj);
        if (opt.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(opt.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") ID id) {
        service.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/")
    public ResponseEntity<?> delete(@RequestBody T obj) {
        service.delete(obj);
        return ResponseEntity.ok().build();
    }
}
