/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import web.Curso;

/**
 *
 * @author Jeovani Thomazini
 */
@Stateless
@Path("web.curso")
public class CursoFacadeREST extends AbstractFacade<Curso> {

    @PersistenceContext(unitName = "ProjetoVRServicePU")
    private EntityManager em;

    public CursoFacadeREST() {
        super(Curso.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Curso entity) {
        super.create(entity);
    }

    @PUT
    @Path("{codigo}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("codigo") Long id, Curso entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("/delete/{codigo}")
    public void remove(@PathParam("codigo") Long id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{codigo}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Curso find(@PathParam("codigo") Long id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Curso> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Curso> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}