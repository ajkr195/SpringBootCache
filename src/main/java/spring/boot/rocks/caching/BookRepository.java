package spring.boot.rocks.caching;

public interface BookRepository {

	Book getByIsbn(String isbn);

}
