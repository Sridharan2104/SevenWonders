package com.sri.sevenwonders.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sri.sevenwonders.model.SevenWondersModel;
import com.sri.sevenwonders.repository.SevenWondersRepository;

@Service
public class SevenWondersService {

	@Autowired  
	SevenWondersRepository srep;
	
	//Posting The Information
	public SevenWondersModel saveInfo(SevenWondersModel dd)
	{
		return srep.save(dd);
	}
	
	//Getting The Information
	public List <SevenWondersModel> getInfo()
	{
		return srep.findAll();
	}
	
	//Update The Information
	public SevenWondersModel updateInfo(SevenWondersModel xx)
	{
		return srep.saveAndFlush(xx);
	}
	
	//Delete The Information
	public void deleteInfo(int no)
	{
		srep.deleteById(no);
	}
}
