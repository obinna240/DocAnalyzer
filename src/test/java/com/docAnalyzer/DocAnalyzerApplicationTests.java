package com.docAnalyzer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import com.docAnalyzer.contollers.HomeController;
import com.docAnalyzer.repository.DocumentHistoryRepository;
import com.docAnalyzer.repository.DocumentHistoryRepositoryImpl;
import com.docAnalyzer.repository.DocumentObjectRepository;
import com.docAnalyzer.services.DocumentHistory;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DocAnalyzerApplicationTests {
	@MockBean
	DocumentObjectRepository documentObject;
	
	@Test
	public void contextLoads() {
	}
	
	/**
	 * Get rid of this test
	 * @throws Exception
	 */
	@Test
	public void testHomePage1() throws Exception 
	{
		HomeController controller = new HomeController();
		assertEquals("home", controller.home());
	}
	
	@Test
	public void testHomePage() throws Exception {
	HomeController controller = new HomeController();
	MockMvc mockMvc = standaloneSetup(controller).build();
	
	mockMvc.perform(get("/"))
	.andExpect(view().name("home"));
	}
	
	@Test
	public void shouldShowRecentDocumentHistory() throws Exception
	{
		
		String historyID = "77cf5092d2339d255a5852d7bdab7f0d29303e65";
		DocumentHistory dh = findDocHistory(historyID);
		DocumentHistoryRepository mockDocumentHistoryRepository =  Mockito.mock(DocumentHistoryRepository.class);
		when(mockDocumentHistoryRepository.findByHistoryID(historyID)).thenReturn(dh);	
	}
	
	private DocumentHistory findDocHistory(String id)
	{
		DocumentHistoryRepository dImp = (DocumentHistoryRepository) new DocumentHistoryRepositoryImpl();
		return dImp.findByHistoryID(id);
	}
}
