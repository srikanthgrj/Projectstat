package com.sri.bootexe.springbootexe.Service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.sri.bootexe.springbootexe.SpringbootDto;
import com.sri.bootexe.springbootexe.Entity.EnvironmentEntity;
import com.sri.bootexe.springbootexe.Entity.SpringbootEntity;
import com.sri.bootexe.springbootexe.repos.Envdao;
import com.sri.bootexe.springbootexe.repos.EnvdaoImpl;
import com.sri.bootexe.springbootexe.repos.SpringbootIMPL;



@Service
public class Springbootservice {
	@Autowired
	private SpringbootIMPL springbootimpl;
	@Autowired
	private Envdao envdao;
	@Autowired
	private ModelMapper modelMapper;
	 
	
	public boolean save(SpringbootDto dtoservice) {
		
		try {
			
			SpringbootEntity entitysercvice= new SpringbootEntity();
			EnvironmentEntity envservice = new EnvironmentEntity();
			//BeanUtils.copyProperties(dtoservice, entitysercvice);
			//BeanUtils.copyProperties(dtoservice, envservice);
			modelMapper.map(entitysercvice, SpringbootDto.class);
			modelMapper.map(envservice, SpringbootDto.class);
			springbootimpl.save(entitysercvice);
			envdao.save(envservice);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return false;
		
	}
	
	

}
