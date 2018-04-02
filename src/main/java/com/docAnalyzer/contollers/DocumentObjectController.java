package com.docAnalyzer.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.docAnalyzer.repository.DocumentObjectRepository;
import com.docAnalyzer.services.DocumentHistory;
import com.docAnalyzer.services.DocumentObject;
@Controller
@RequestMapping(value={"/documentObject"})
public class DocumentObjectController
{
	private DocumentObjectRepository documentObjectRepository;
	
	@Autowired
	public DocumentObjectController(DocumentObjectRepository documentObjedtRepository)
	{
		this.documentObjectRepository = documentObjectRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String getDocumentObjects(Model model)
	{
		List<DocumentObject> documentObjectList = (List<DocumentObject>) documentObjectRepository .findAll();
		model.addAttribute("documentObjectList", documentObjectList);
		return "documentObjects";
	}
}
