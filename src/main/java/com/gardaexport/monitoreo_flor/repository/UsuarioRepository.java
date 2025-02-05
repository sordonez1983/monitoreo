/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gardaexport.monitoreo_flor.repository;

import com.gardaexport.monitoreo_flor.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
//public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
//    Usuario findByUsuario(String usuario); // Buscar usuario por nombre
//}

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByUsuarioAndClave(String usuario, String clave);
}
