package com.oehm2.assosiations.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.oehm2.assosiations.dto.Country;
import com.oehm2.assosiations.dto.Library;
import com.oehm2.assosiations.dto.Questions;
import com.oehm2.assosiations.dto.State;
import com.oehm2.assosiations.dto.Team;

public class CommonDao {

	
	public void saveTeam(Team team) {
		//hib logic to save data into db
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(team);
		transaction.commit();
	}
	
	
	
	public void saveLibraryDetails(Library library) {
		//hib logic to save data into db
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(library);
		transaction.commit();
	}
	
	
	public void saveSateAndCountryDetails(State state) {
		//hib logic to save data into db
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
			session.save(state);
		transaction.commit();
	}
	
	
	public void saveQuestionAndAnswers(Questions questions) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(questions);
		transaction.commit();
	}
	
}
