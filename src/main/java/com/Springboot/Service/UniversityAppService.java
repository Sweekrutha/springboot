package com.Springboot.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Springboot.Entity.UniversityApp;
import com.SpringbootRepository.UniversityAppRepository;

@Service
public class UniversityAppService {
private UniversityAppRepository repository;
public UniversityApp saveUniversityApp(UniversityApp ua)
{
	return repository.save(ua);
}
public List<UniversityApp>saveUniversityApps(List<UniversityApp> uas)
{
	return repository.saveAll(uas);
}
public List<UniversityApp>getUniversityApps()
{
	return repository.findAll();
}
public UniversityApp getUniversityAppById(int id)
{
	return repository.findById(id).orElse(null);
}
public UniversityApp getUniversityAppByName(String name)
{
	return repository.findByName(name);
}
public String deleteUniversityApp(int id)
{
	repository.deleteById(id);
	return "University is removed"+id;
}
public UniversityApp updateUniversityApp(UniversityApp k)
{
	UniversityApp es=repository.findById(k.getId()).orElse(null);
	es.setName(k.getName());
	es.setTotalClg(k.getTotalClg());
	return repository.save(es);
}
}
