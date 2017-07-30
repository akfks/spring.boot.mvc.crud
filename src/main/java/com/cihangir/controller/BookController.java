package com.cihangir.controller;

import com.cihangir.model.Book;
import com.cihangir.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	

	@RequestMapping(value = "/showFormForAdd", method = RequestMethod.GET)
	public String showFormForAddBook(Model theModel) {

		// create model attribute to bind form data
		Book theBook=new Book();

		theModel.addAttribute("newBook", theBook);

		return "book-define";
	}

	@RequestMapping(value = "/showFormForEdit", method = RequestMethod.GET)
	public String showFormForEditBook(@RequestParam("bookId") Long theId, Model theModel) {

		// create model attribute to bind form data
		Book theBook=bookService.findOne(theId);

		//add theBook to the model
		theModel.addAttribute("newBook", theBook);

		return "book-define";

	}

	@RequestMapping(value = "/deleteBook", method = RequestMethod.GET)
	public String deleteBook(@RequestParam("bookId") Long theId) {

		//delete the book
		bookService.deleteBook(theId);

		return "redirect:bookList";
	}

	@RequestMapping(value = "/saveBook", method = RequestMethod.POST)
	public String saveBook(@ModelAttribute("newBook") Book theBook) {

		bookService.save(theBook);

		return "redirect:bookList";
	}

	@RequestMapping("/bookList")
	public String getBookList(Model model) {

		// get books from the service
		List<Book> bookList=bookService.findAll();

		// add the books to the model
		model.addAttribute("books", bookList);

		return "book-list";
	}


}
