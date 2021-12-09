package com.example.demo.service.api;
import com.example.demo.commons.GenericServiceAPI;
import com.example.demo.model.Persona;
//En la interfaz se crean metodos del CRUD de los datos 
//Se replican los metodos en el repository y en el impl
//Se envia la entidad con la que se esta trabajando (Persona) y el tipo de dato atributo id 
public interface PersonaServiceAPI extends GenericServiceAPI<Persona,Long> {
}
