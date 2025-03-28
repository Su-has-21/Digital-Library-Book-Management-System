package ajackus.DigitalLibrary.controller;

import ajackus.DigitalLibrary.model.Book;
import ajackus.DigitalLibrary.service.BookService;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class BookController {
	@Autowired
	 BookService bookService;

	@GetMapping
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@GetMapping("/{bookId}")
	public Book getBookById(@PathVariable String bookId) {
		return bookService.getBookById(bookId);
	}

	@PostMapping
	public Book addBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}

	@PutMapping("/{bookId}")
	public Book updateBook(@PathVariable String bookId, @RequestBody Book book) {
		return bookService.updateBook(bookId, book);
	}

	@DeleteMapping("/{bookId}")
	public void deleteBook(@PathVariable String bookId) {
		bookService.deleteBook(bookId);
	}
}