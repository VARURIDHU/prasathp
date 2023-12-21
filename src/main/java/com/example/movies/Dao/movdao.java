package com.example.movies.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.movies.Entity.movent;
import com.example.movies.Repository.movrepo;

@Repository
public class movdao {
	@Autowired
	movrepo movRepo;
	
	public String insertMovie(List <movent> m) {
		movRepo.saveAll(m);
		return "success";
	}

		
	
public movent findMovie(@PathVariable int m1) {
	return movRepo.findById(m1).get();
}
/*
public Movie update(Movie m1) {
	movRepo.save(m1);
	return m1;
}
public String deletMovie(int e2) {
	movRepo.deletById(e2);
	return "Delet Successfully";
}*/



public movent delete(int num) {
	movent temp=movRepo.findById(num).get();
	movRepo.deleteById(num);
	return temp;
}



public List<movent> getAll() {
	List<movent>p=movRepo.findAll();
	return p;
}
}
