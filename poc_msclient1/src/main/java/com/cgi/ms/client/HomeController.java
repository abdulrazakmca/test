/**
 * 
 */
package com.cgi.ms.client;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.ms.client.entity.Image;
/**
 * @author videsh.singh
 *
 */
@RestController
public class HomeController {
	@Autowired
	private Environment env;
	
	@GetMapping("/images")
	public List<Image> getImages() {
		List<Image> images = Arrays.asList(
			new Image(1, "Treehouse of Horror V", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
			new Image(2, "The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"),
			new Image(3, "The Last Traction Hero", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112"));
		return images;
	}
}
