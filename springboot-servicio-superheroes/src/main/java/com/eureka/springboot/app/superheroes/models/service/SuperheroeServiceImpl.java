package com.eureka.springboot.app.superheroes.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eureka.springboot.app.superheroes.models.dao.SuperheroeDao;
import com.eureka.springboot.app.superheroes.models.entity.Superheroe;

@Service
public class SuperheroeServiceImpl implements ISuperheroeService {
	
	@Autowired
	private SuperheroeDao superheroeDao;

	@Override
	@Transactional(readOnly = true)
	public List<Superheroe> getAllSuperheroes() {
		return (List<Superheroe>) superheroeDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Superheroe getSuperheroeById(Long id) {
		return superheroeDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Superheroe createSuperheroe(Superheroe superheroe) {
		return superheroeDao.save(superheroe);
	}

	@Override
	@Transactional
	public void deleteSuperheroeById(Long id) {
		superheroeDao.deleteById(id);
	}

}
