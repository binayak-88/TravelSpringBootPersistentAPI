/**
 * 
 */
package com.mytravel.apis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author HP
 *
 */
@Entity
public class BucketList {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "name", length = 60, nullable = false)
	private String name;
	@Column
	private String description;

	public BucketList() {
	}

	public BucketList(String name, String description) {
		this.name = name;
		this.description = description;
	}

	BucketList(long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "BucketList{" + "id=" + id + ", name='" + name + '\'' + ", description='" + description + '\'' + '}';
	}
}