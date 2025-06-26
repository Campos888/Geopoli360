package personalProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import personalProject.model.Country;
import personalProject.repository.CountryRepository;


@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
	
	public Country getCountryById(Long id) {
		return countryRepository.findById(id).get();
	}
	
	public Iterable<Country> getAllCountries(){
		return countryRepository.findAll();
	}
	
	public Country save(Country country) {
        return countryRepository.save(country); 
    }

		
	
	
}
