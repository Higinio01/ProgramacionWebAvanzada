package com.example.crudsimplespringboot.repositorio;

import com.example.crudsimplespringboot.entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    //Estudiante findByNombre(String nombre);

    //@Query("select u from Estudiante u where u.matricula = ?1")
    //Estudiante consultaEstudiante(String matricula);
}