package Lesson_4.Pr_2;

import java.util.List;

public interface BookRepository {
    Book findById(String id);
    List<Book> findAll();
}

