package com.example.demo4.resource;

import com.example.demo4.entity.ArbreEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Path("count-genre/{genre}")
public class CountGenreResource {
    @PathParam("genre")
    private String genre;

    @GET
    @Produces("application/json")
    public Response hello() {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(ArbreEntity.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();

        try {
            transaction.begin();
            var queryStr = "select count(a.genre) " +
                    "from ArbreEntity a " +
                    "where a.genre like '" + genre +
                    "' group by a.genre";
            var query = session.createQuery(queryStr);
            var result = query.getResultList().get(0);

            transaction.commit();
            String json = new ObjectMapper().writeValueAsString(result);
            return Response.ok(json).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.ok("{\"error\":\"something went wrong\"}").build();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            session.close();
            sessionFactory.close();
        }
    }
}