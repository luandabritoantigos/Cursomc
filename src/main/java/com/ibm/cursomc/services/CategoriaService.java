package com.ibm.cursomc.services;

import com.ibm.cursomc.domain.Categoria;
import com.ibm.cursomc.repositories.CategoriaRepository;
import com.ibm.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id) {

        Optional<Categoria> obj = repo.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado ID: " + id + ", Tipo: " + Categoria.class.getName()));
    }

}
