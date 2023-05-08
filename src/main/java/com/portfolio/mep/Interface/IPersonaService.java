package com.portfolio.mep.Interface;

import com.portfolio.mep.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Para traer una lista de Personas 
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
    
    
}
