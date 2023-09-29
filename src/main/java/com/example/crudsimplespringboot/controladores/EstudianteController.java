package com.example.crudsimplespringboot.controladores;

import com.example.crudsimplespringboot.entidades.Estudiante;
import com.example.crudsimplespringboot.repositorio.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @GetMapping("/")
    public String listarEstudiantes(Model model) {
        model.addAttribute("estudiantes", estudianteRepository.findAll());
        return "estudiante/listar";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        return "estudiante/formulario";
    }

    @PostMapping("/guardar")
    public String guardarEstudiante(@ModelAttribute Estudiante estudiante) {
        estudianteRepository.save(estudiante);
        return "redirect:/estudiantes/";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        Estudiante estudiante = estudianteRepository.findById(id).orElse(null);
        model.addAttribute("estudiante", estudiante);
        return "estudiante/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarEstudiante(@PathVariable Long id) {
        estudianteRepository.deleteById(id);
        return "redirect:/estudiantes/";
    }
}

