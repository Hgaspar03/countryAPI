package mz.co.hgaspar.devchallange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mz.co.hgaspar.devchallange.model.Country;
import mz.co.hgaspar.devchallange.service.CountryService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * 
 * @author Helenio de Vasconcelos David Gaspar
 *
 */

@CrossOrigin("*")
@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired     
    private CountryService service;

    @PostMapping
	public Country postCountry(@RequestBody Country country) {
		
		return service.createCountry(country);
	}

	@PutMapping
	public Country putCountry(@RequestBody Country country) {
	
	
		return service.updateCountry(country);
	}
	@GetMapping("/{id}")
	public Country getCountryById(@PathVariable("id") Long id) {
		return service.fetchCountryById(id);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteCountryById(@PathVariable("id") Long id) {
		System.out.println("Controller delete mapping");
		 service.removeCountryById(id);
    }
    
    @GetMapping("/all")
	public List<Country> getCountrys() {
		return service.fetchCountrys();
	}
    
}