package hibernate;

import Models.Don;
import Models.Famiglia;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author atellez
 */
public class appFamilias {
    private static SessionFactory sessionFactory = null;
    public static void main(String[] args) {

        Session session = null;
        
        try{
                sessionFactory = MafiaFactory.getSessionFactory();
                session = sessionFactory.openSession();
 
                System.out.println("Insertando registro");
                Transaction tx = session.beginTransaction();

                Don don = new Don(7,"Luzia", "DeVille", "Cruella", "Paris");
                Famiglia famiglia = new Famiglia("Mataperros", "Marsella", 11);
                famiglia.setDon(don);

                session.save(famiglia);
                tx.commit();
                System.out.println("Finalizado...");
            }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            }
        finally{
            session.close();
        }

    }
}
