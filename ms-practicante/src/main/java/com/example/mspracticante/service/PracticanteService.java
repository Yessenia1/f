package com.example.mspracticante.service;

import com.example.mspracticante.entity.Practicante;

import java.util.List;
import java.util.Optional;

public interface PracticanteService {
    public List<Practicante> listar();
    public Practicante guardar(Practicante practicante);
    public Practicante actualizar(Practicante practicante);
    public Optional<Practicante> listarPorId(Integer id);
    public void eliminarPorId(Integer id);
}
