package mz.co.hgaspar.devchallange.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * 
 * @author Helenio de Vasconcelos David Gaspar
 *
 */

@Entity
public class Country {
	
	public Country() {
	}
	
	public Country(Long id, String name, String capital, String region, String subRegion, Double area) {
		super();
		this.id = id;
		this.name = name;
		this.capital = capital;
		this.region = region;
		this.subRegion = subRegion;
		this.area = area;
	}
	
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String capital;
	
	private String region;
	
	private String subRegion;
	
	private Double area;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSubRegion() {
		return subRegion;
	}

	public void setSubRegion(String subRegion) {
		this.subRegion = subRegion;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((subRegion == null) ? 0 : subRegion.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Country : id=" + id + ", name=" + name + ", capital=" + capital + ", region=" + region + ", subRegion="
				+ subRegion + ", area=" + area ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (subRegion == null) {
			if (other.subRegion != null)
				return false;
		} else if (!subRegion.equals(other.subRegion))
			return false;
		return true;
	}


	
	
	

}
