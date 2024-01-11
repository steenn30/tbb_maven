package com.tbb.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

@Service
public class ImageFromLinkService {

	
	public String getAllImagesOnPage(String url) {
		
		List<String> allImages = new ArrayList<String>();
		Document doc = null;
		try {
			doc = Jsoup.connect("http://jsoup.org").get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Elements elements = doc.select("img[src$=.png]");
		
		for(Element e:elements) {
			allImages.add(e.attr("src"));
		}
		
		return allImages.get(0);
		
	}
}
