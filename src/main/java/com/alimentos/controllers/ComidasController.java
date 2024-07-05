package com.alimentos.controllers;


import com.alimentos.DTO.ComidasDTO;
import com.alimentos.entity.Comidas;
import com.alimentos.service.ComidasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "alimentos/comidas")
public class ComidasController {
    @Autowired
    ComidasService comidasService;

    @GetMapping
    public List<Comidas> obtenerTodasComidas(){
        return comidasService.getComidas();
    }

    @GetMapping("/{idComida}")
    public Optional<Comidas> obtenerComida(@PathVariable("idComida") int idComida){
        return comidasService.getIdComida(idComida);
    }

    @PostMapping
    public void actualizarYGuardar(@RequestBody ComidasDTO comidasDTO){
        comidasService.saveUp(comidasDTO);
    }

    @DeleteMapping("/{comidaid}")
    public void eliminar(@PathVariable("comidaid") int comidaid ){
        comidasService.deleteIdComida(comidaid);
    }

}
