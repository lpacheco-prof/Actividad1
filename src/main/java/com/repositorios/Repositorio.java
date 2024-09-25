package com.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.entidades.*;

/**
 * @author Luis M. Pacheco
 */

@Repository
public interface Repositorio extends JpaRepository <Tarea,Long> {

}
