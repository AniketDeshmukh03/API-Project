package com.example.FullAPI.Implement;

import java.util.List;

import com.example.FullAPI.Respositry.LibraryRepository;
import com.example.FullAPI.Service.Library_Service;
import com.example.FullAPI.library.Books;

import org.springframework.stereotype.Service;

@Service
public  class Lib_Impl implements Library_Service {

	private LibraryRepository libRepos;


	public Lib_Impl(LibraryRepository libRepos) {

		this.libRepos = libRepos;
	}

	public List<Books> getAllBooks(){
		return libRepos.findAll();
	}

	public	Books insertBook(Books obj) {
		return libRepos.save(obj);  
	}




	@Override
	public Books getBookById(int id) {

		return libRepos.findById(id).get() ;  //get method for optional choices
	}



	@Override
	public Books updateRecord(Books book) {

		return libRepos.save(book);
	}

	@Override
	public void deleteBookById(int id) {
		libRepos.deleteById(id);

	}




	@Override
	public void LogOutPg(int id) {

		((Library_Service) libRepos).LogOutPg(id);

	}

	@Override
	public void ToHomepage(int id) {

		((Library_Service) libRepos).ToHomepage(id);

	}

	@Override
	public void addMenu(int id) {
		((Library_Service) libRepos).addMenu(id);


	}

	@Override
	public void addLoginPg(int id) {
		((Library_Service) libRepos).addLoginPg(id);


	}







}
