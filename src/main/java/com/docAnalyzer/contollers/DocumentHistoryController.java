package com.docAnalyzer.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.docAnalyzer.repository.DocumentHistoryRepository;
import com.docAnalyzer.services.DocumentHistory;


@Controller
@RequestMapping(value={"/documentHistory"})
public class DocumentHistoryController {

private DocumentHistoryRepository documentHistoryRepository;
	
	@Autowired
	public DocumentHistoryController(DocumentHistoryRepository documentHistoryRepository)
	{
		this.documentHistoryRepository = documentHistoryRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String getDocumentHistories(Model model)
	{
		List<DocumentHistory> documentHistoryList = (List<DocumentHistory>) documentHistoryRepository.findAll();
		model.addAttribute("documentHistoryList", documentHistoryList);
		return "documentHistories";
	}
	
	@RequestMapping(value="/{documentHistoryID}", method=RequestMethod.GET)
	public String getDocumentHistory(@PathVariable String documentHistoryID, Model model)
	{
		
		DocumentHistory documentHistory = documentHistoryRepository.findByHistoryID(documentHistoryID);
		model.addAttribute("documentHistory", documentHistory);
		return "documentHistories";
	}
}
