/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gardaexport.monitoreo_flor.controller;

import com.gardaexport.monitoreo_flor.entity.Ingreso;
import com.gardaexport.monitoreo_flor.service.IngresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingresos")
public class IngresoController {
    
    @Autowired
    private IngresoService ingresoService;

    @GetMapping
    public List<Ingreso> listarIngresos() {
        return ingresoService.listarIngresos();
    }

    @GetMapping("/{id}")
    public Ingreso obtenerIngreso(@PathVariable Integer id) {
        return ingresoService.obtenerIngresoPorId(id);
    }

    @PostMapping
    public Ingreso guardarIngreso(@RequestBody Ingreso ingreso) {
        return ingresoService.guardarIngreso(ingreso);
    }

    @DeleteMapping("/{id}")
    public void eliminarIngreso(@PathVariable Integer id) {
        ingresoService.eliminarIngreso(id);
    }
}