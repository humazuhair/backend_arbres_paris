package com.example.demo4.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import com.example.demo4.entity.ArbreEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Path("arrondissement")
public class ArrondissementResource {

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
            var queryStr = "select a.arrondissement, count(a.arrondissement) " +
                    "from ArbreEntity a " +
                    "group by a.arrondissement " +
                    "order by a.arrondissement";
            var query = session.createQuery(queryStr);
            var resultList = query.getResultList();

            transaction.commit();
            String json = new ObjectMapper().writeValueAsString(resultList);
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