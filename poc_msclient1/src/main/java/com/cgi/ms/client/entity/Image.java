/**
 * 
 */
package com.cgi.ms.client.entity;

/**
 * @author videsh.singh
 *
 */
public class Image {

	private Integer id;

	private String title;

	private String url;

	public Image(Integer id, String title, String url) {
		super();
		this.id = id;
		this.title = title;
		this.url = url;
	}

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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

}
