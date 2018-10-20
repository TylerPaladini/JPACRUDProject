package com.skilldistillery.megafauna.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Megafauna {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)	
		private int id;
		
		private String name;
		
		@Column(name="latin_scientific")
		private String latinScientific;
		
		private String description;
		private Integer weight;
		private String size;
		private String diet;
		private String habitat;
		private String region;
		
		public Megafauna() {
			
		}
		
		
		public Megafauna(String name, String latinScientific, String description, int weight, String size, String diet,
				String habitat, String region) {
			super();
			this.name = name;
			this.latinScientific = latinScientific;
			this.description = description;
			this.weight = weight;
			this.size = size;
			this.diet = diet;
			this.habitat = habitat;
			this.region = region;
			
			
			
			
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLatinScientific() {
			return latinScientific;
		}
		public void setLatinScientific(String latinScientific) {
			this.latinScientific = latinScientific;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public String getDiet() {
			return diet;
		}
		public void setDiet(String diet) {
			this.diet = diet;
		}
		public String getHabitat() {
			return habitat;
		}
		public void setHabitat(String habitat) {
			this.habitat = habitat;
		}
		public String getRegion() {
			return region;
		}
		public void setRegion(String region) {
			this.region = region;
		}
		public int getId() {
			return id;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((description == null) ? 0 : description.hashCode());
			result = prime * result + ((diet == null) ? 0 : diet.hashCode());
			result = prime * result + ((habitat == null) ? 0 : habitat.hashCode());
			result = prime * result + id;
			result = prime * result + ((latinScientific == null) ? 0 : latinScientific.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((region == null) ? 0 : region.hashCode());
			result = prime * result + ((size == null) ? 0 : size.hashCode());
			result = prime * result + weight;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Megafauna other = (Megafauna) obj;
			if (description == null) {
				if (other.description != null)
					return false;
			} else if (!description.equals(other.description))
				return false;
			if (diet == null) {
				if (other.diet != null)
					return false;
			} else if (!diet.equals(other.diet))
				return false;
			if (habitat == null) {
				if (other.habitat != null)
					return false;
			} else if (!habitat.equals(other.habitat))
				return false;
			if (id != other.id)
				return false;
			if (latinScientific == null) {
				if (other.latinScientific != null)
					return false;
			} else if (!latinScientific.equals(other.latinScientific))
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
			if (size == null) {
				if (other.size != null)
					return false;
			} else if (!size.equals(other.size))
				return false;
			if (weight != other.weight)
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Megafauna [id=" + id + ", name=" + name + ", latinScientific=" + latinScientific + ", description="
					+ description + ", weight=" + weight + ", size=" + size + ", diet=" + diet + ", habitat=" + habitat
					+ ", region=" + region + "]";
		}
	
	
	
}
