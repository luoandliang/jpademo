package com.luoyi;

import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class demo {
    @Test
    public void test1 () {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myJpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Customer customer = new Customer();
        customer.setCustName("luoliqiang");
        entityManager.persist(customer);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
