package com.docAnalyzer.contollers;


import java.io.File;
import java.io.IOException;

import javax.servlet.http.Part;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;





import org.springframework.web.bind.annotation.RequestPart;

import com.docAnalyzer.services.SearchQueryObject;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping(value={"/","/homepage","/document"})
public class HomeController 
{

	
	/**
	//alternatively, we can use this and get rid off the @Autowired annotation
	@Autowired
	public HomeController(DocumentHistoryRepository documentHistoryRepository,
			DocumentObjectRepository documentObjectRepository)
	{
		this.documentHistoryRepository = documentHistoryRepository;
		this.documentObjectRepository = documentObjectRepository;
	}
	*/
	
	@RequestMapping(method=GET)
	public String home()
	{
		return "home";
	}
	
	@RequestMapping(value="/search",method=GET)
	public String showSearchForm(Model model)
	{
		model.addAttribute("searchQueryObject", new SearchQueryObject());
		return "searchForm";
	}
	
	//see page 158 of spring in action
	@RequestMapping(value="/search",method=POST)
	public String processSearch(@RequestPart("profilePicture") Part profilePicture, String searchQuery, Errors errors)//Or use SearchQueryObject which will be sent to SOLR
	{
		
		try {
			profilePicture.write("/data/spittr/" +
					profilePicture.getSubmittedFileName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//index object search query is performed here
		//Do something like 
		//Indexer.search(SearchQueryObject);
		//return "/redirect:/object"; //do something like "/redirect:/object.getUserName()"
		//profilePicture.transferTo(new File("/data/spittr/" + profilePicture.getOriginalFilename()));
				
		return "documentObjects";
	}
	
	
}
