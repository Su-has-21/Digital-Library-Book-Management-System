package ajackus.DigitalLibrary.service;

import ajackus.DigitalLibrary.model.Book;
import ajackus.DigitalLibrary.repository.BookRepository;
import ajackus.DigitalLibrary.exception.BookNotFoundException;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {
	@Autowired
	  BookRepository bookRepository;

    public List<Book> getAllBooks() {
        System.out.print(bookRepository.findAll());
        return bookRepository.findAll();
    }

    public Book getBookById(String bookId) {
        return bookRepository.findByBookId(bookId)
                .orElseThrow(() -> new BookNotFoundException("Book not found"));
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Transactional
    public Book updateBook(String bookId, Book updatedBook) {
        if (updatedBook == null) {
            throw new IllegalArgumentException("Updated book details cannot be null");
        }

        Book existingBook = bookRepository.findByBookId(bookId)
            .orElseThrow(() -> new BookNotFoundException("Book with ID " + bookId + " not found"));

        existingBook.setTitle(Optional.ofNullable(updatedBook.getTitle()).orElse(existingBook.getTitle()));
        existingBook.setAuthor(Optional.ofNullable(updatedBook.getAuthor()).orElse(existingBook.getAuthor()));
        existingBook.setGenre(Optional.ofNullable(updatedBook.getGenre()).orElse(existingBook.getGenre()));
        existingBook.setStatus(Optional.ofNullable(updatedBook.getStatus()).orElse(existingBook.getStatus()));

        return bookRepository.save(existingBook);
    }

    @Transactional
    public void deleteBook(String bookId) {
        Book book = getBookById(bookId);
        bookRepository.delete(book);
    }
}