package com.Springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.Entity.UniversityApp;
import com.Springboot.Service.UniversityAppService;

@RestController
public class UniversityAppController {
	@Autowired
	private UniversityAppService Service;
	
	@PostMapping("/addUniversityApp")
	public UniversityApp addUniversityApp(@RequestBody UniversityApp k)
	{
		return Service.saveUniversityApp(k);
	}
	@PostMapping("/addUniversityApps")
	public List<UniversityApp>addUniversityApps(@RequestBody List <UniversityApp> m)
	{
		return Service.saveUniversityApps(m);
	}
	@GetMapping("/UniversityApps")
	public List<UniversityApp> findAllUniversityApps()
	{
		return Service.getUniversityApps();
	}
	@GetMapping("/UniversityApp/{id}")
	public UniversityApp findAllUniversityAppById(@PathVariable int id)
	{
		return Service.getUniversityAppById(id);
	}
	@GetMapping("/UniversityApp/{name}")
	public UniversityApp findAllUniversityAppByName(@PathVariable String name)
	{
		return Service.getUniversityAppByName(name);
	}
	@PostMapping("/update")
	public UniversityApp updateUniversityApp(@RequestBody UniversityApp k)
	{
		return Service.updateUniversityApp(k);
	}
	@DeleteMapping("/update")
	public String deleteUniversityApp(@PathVariable int id)
	{
		return Service.deleteUniversityApp(id);
	}
}
