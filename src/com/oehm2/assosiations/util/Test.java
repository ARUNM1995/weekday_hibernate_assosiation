package com.oehm2.assosiations.util;

import java.util.ArrayList;
import java.util.List;

import com.oehm2.assosiations.dao.CommonDao;
import com.oehm2.assosiations.dto.Answers;
import com.oehm2.assosiations.dto.Book;
import com.oehm2.assosiations.dto.Captain;
import com.oehm2.assosiations.dto.Country;
import com.oehm2.assosiations.dto.Library;
import com.oehm2.assosiations.dto.Questions;
import com.oehm2.assosiations.dto.State;
import com.oehm2.assosiations.dto.Team;

public class Test {

	public static void main(String[] args) {

		/*
		Captain captain = new Captain();
		captain.setName("virat kohli");
		captain.setAge(new Long(30));
		
		Team team = new Team();
		team.setName("India");
		team.setSize(new Long(11));
		team.setCaptain(captain);
		
		CommonDao dao = new CommonDao();
		dao.saveTeam(team);
		
		List<Book> list = new ArrayList<Book>();
		
		 Book book = new Book();
		 book.setBookName("Two States");
		 book.setAuthorName("chetan baghat");
		 book.setCost(new Double(250.0));
		 
		 Book book1 = new Book();
		 book1.setBookName("harry potter");
		 book1.setAuthorName("jk ronick");
		 book1.setCost(new Double(450.50));
		 
		 list.add(book);
		 list.add(book1);
		 
		 Library library = new Library();
		 library.setName("central library");
		 library.setTotalBooks(new Long(10000));
		 library.setContact(new Long(4321022));
		 library.setBooks(list);
		 
		 CommonDao dao = new CommonDao();
		 dao.saveLibraryDetails(library);
		 
		 */
		

		/*
		
		Country country = new Country();
		country.setName("India");
		country.setPopulation(new Long(10000000));
		country.setTotalArea("1000000sqfeet");
		
		
		State state = new State();
		state.setName("Ap");
		state.setPopulation(new Long(900000));
		state.setLanguage("telugu");
		state.setCountry(country);

	
		
		CommonDao dao = new CommonDao();
		dao.saveSateAndCountryDetails(state);
		
		*/
		
		Answers answers = new Answers();
		answers.setaName("it is a virus");
		answers.setType("ans");
		
		Answers answers1 = new Answers();
		answers1.setaName("it is rhoa virus");
		answers1.setType("ans");
		
		List<Answers> list = new ArrayList<Answers>();
		list.add(answers);
		list.add(answers1);
		
		Questions questions = new Questions();
		questions.setqName("is coroana a virus ");
		questions.setAnswers(list);
		
		
		CommonDao commonDao = new CommonDao();
		commonDao.saveQuestionAndAnswers(questions);
		
		
		
		
		
		
		
		
		
	}

}
