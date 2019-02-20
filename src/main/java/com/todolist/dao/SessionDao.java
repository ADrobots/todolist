package com.todolist.dao;

import com.todolist.task.Task;
import com.todolist.da.HibernateService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class SessionDao{

    static SessionFactory sessionFactory= HibernateService.getSessionFactory();


    public List<Task> getall(){
        Session session=sessionFactory.openSession();
        Transaction tn=session.beginTransaction();

        List<Task> list=(List<Task>) session.createCriteria(Task.class).list();

        tn.commit();
        session.close();

        return list;


    }

   public void save(Task t){
        Session session=sessionFactory.openSession();
       Transaction tn=session.beginTransaction();

       session.save(t);
       tn.commit();
       session.close();;

    }

    public void delete(String t){
        Session session=sessionFactory.openSession();
        Transaction tn=session.beginTransaction();

        Task obj=(Task) session.createCriteria(Task.class).add(Restrictions.eq("task",t)).list().get(0);
        session.delete(obj);
        tn.commit();
        session.close();

    }
}
