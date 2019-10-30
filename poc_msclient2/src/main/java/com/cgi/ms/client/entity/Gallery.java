/**
 * 
 */
package com.cgi.ms.client.entity;

import java.util.List;

/**
 * @author videsh.singh
 *
 */
public class Gallery {

	private Integer id;

	List<Object> image;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the image
	 */
	public List<Object> getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(List<Object> image) {
		this.image = image;
	}

}
