package com.example.movies.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.movies.Dao.movdao;
import com.example.movies.Entity.movent;

@Service
public class movser {
	@Autowired
	movdao MovDao;

	public String insertMovie(List<movent> m) {
		return MovDao.insertMovie(m);
	}

	public movent findMovie(@PathVariable int m1) {
		return MovDao.findMovie(m1);
	}

	public movent delete(int num) {
		return MovDao.delete(num);
	}

	public List<movent> getAll() {
		return MovDao.getAll();
	}}
	

