package ajackus.DigitalLibrary.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String bookId;

    @Column(nullable = false)
    private String title;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public AvailabilityStatus getStatus() {
		return status;
	}

	public void setStatus(AvailabilityStatus status) {
		this.status = status;
	}

	@Column(nullable = false)
    private String author;

    private String genre;
    
    

    @Enumerated(EnumType.STRING)
    @Column(nullable = false) // Ensures the column cannot be null
    private AvailabilityStatus status;
}
