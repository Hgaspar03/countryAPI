package mz.co.hgaspar.devchallange.dao;

import org.springframework.data.repository.CrudRepository;

import mz.co.hgaspar.devchallange.model.Country;


/**
 * @author Helenio de Vasconcelos David Gaspar
 */

public interface ICountryRepository  extends CrudRepository<Country, Long>{
    
}