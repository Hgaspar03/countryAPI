package mz.co.hgaspar.devchallange.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mz.co.hgaspar.devchallange.dao.ICountryRepository;
import mz.co.hgaspar.devchallange.model.Country;

/**
 * 
 * @author Helenio de Vasconcelos David Gaspar
 *
 */

@Service
public class CountryService {

    private Map<Long, mz.co.hgaspar.devchallange.model.Country> defaultCountries = new HashMap<Long, Country>();

    @Autowired
    private ICountryRepository repository;

    /**
     * O metodo criar alguns paises por padrao na base de dados
     */
    @PostConstruct
    private void onInit() {
       if (this.fetchCountrys().isEmpty()) {
           
       }
        defaultCountries.put(1L,
                new Country(1L, "Mozambique", "Maputo", "Africa", "Eastern Africa", new Double(801590.0)));
        defaultCountries.put(2L, new Country(2L, "Angola", "Luanda", "Africa", "Middle Africa", new Double(1246700.0)));
        defaultCountries.put(3L,
                new Country(3L, "Brazil", "Brasília", "Americas", "South America", new Double(8515767.0)));
        defaultCountries.put(4L,
                new Country(4L, "Belgium", "Brussels", "Europe", "Western Europe", new Double(30528.0)));
        defaultCountries.put(5L,
                new Country(5L, "Germany", "Berlin", "Europe", "Western Europe", new Double(357114.0)));

        defaultCountries.entrySet().stream().map(c -> c.getValue()).forEach(c -> createCountry(c));

    }

    public List<Country> fetchCountrys() {
        Iterable<Country> countrys = repository.findAll();

        return (List<Country>) countrys;
    }

    public Country createCountry(Country country) {

        country = repository.save(country);
        return country;
    }

    public Country updateCountry(Country country) {

         repository.deleteById(country.getId());

         return repository.save(country);

    }

    public Country fetchCountryById(Long id) {
        Optional<Country> country = repository.findById(id);

        return country.get();
    }

    public void removeCountryById(Long id) {
        repository.deleteById(id);

    }

}
