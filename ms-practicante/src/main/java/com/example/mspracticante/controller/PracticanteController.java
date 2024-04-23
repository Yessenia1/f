package com.example.mspracticante.controller;

import com.example.mspracticante.entity.Practicante;
import com.example.mspracticante.service.PracticanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/practicante")
public class PracticanteController {
    @Autowired
    private PracticanteService practicanteService;

    @GetMapping()
    public ResponseEntity<List<Practicante>> list() {
        return ResponseEntity.ok().body(practicanteService.listar());
    }

    @PostMapping()
    public ResponseEntity<Practicante> save(@RequestBody Practicante practicante) {
        return ResponseEntity.ok(practicanteService.guardar(practicante));
    }

    @PutMapping()
    public ResponseEntity<Practicante> update(@RequestBody Practicante practicante) {
        return ResponseEntity.ok(practicanteService.actualizar(practicante));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Practicante> listById(@PathVariable (required = true)Integer id) {
        return ResponseEntity.ok().body(practicanteService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable (required = true)Integer id) {
        practicanteService.eliminarPorId(id);
        return "Elimiancion correcta";
    }
}
