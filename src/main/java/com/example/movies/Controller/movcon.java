package com.example.movies.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movies.Entity.movent;
import com.example.movies.Service.movser;

@RestController
@RequestMapping(value = "/movies")
@CrossOrigin(origins ="*")
public class movcon {
	@Autowired
	movser movSer;
	
	@PostMapping(value = "/insert")
	public String insertMovie(@RequestBody List<movent> m) {
		return movSer.insertMovie(m);
	}
	@GetMapping(value="/get/{m1}") 
		public movent findMovie(@PathVariable int m1) {
			return movSer.findMovie(m1);
		}
	@DeleteMapping(value="/del/{num}")
	public movent delete(@PathVariable int num) {
		return movSer.delete(num);
	}
	@GetMapping(value="/all")
	public List<movent>getAll(){
		return movSer.getAll();
	}
	}


