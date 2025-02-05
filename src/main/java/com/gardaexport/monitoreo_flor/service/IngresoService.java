/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gardaexport.monitoreo_flor.service;

import com.gardaexport.monitoreo_flor.entity.Ingreso;
import com.gardaexport.monitoreo_flor.repository.IngresoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngresoService {
    
    @Autowired
    private IngresoRepository ingresoRepository;
    
    public List<Ingreso> listarIngresos() {
        return ingresoRepository.findAll();
    }

    public Ingreso obtenerIngresoPorId(Integer id) {
        return ingresoRepository.findById(id).orElse(null);
    }

    public Ingreso guardarIngreso(Ingreso ingreso) {
        return ingresoRepository.save(ingreso);
    }

    public void eliminarIngreso(Integer id) {
        ingresoRepository.deleteById(id);
    }
}
