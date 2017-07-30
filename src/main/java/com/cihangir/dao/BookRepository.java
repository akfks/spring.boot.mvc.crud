package com.cihangir.dao;

import com.cihangir.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cihangir on 7/30/17.
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
