package smartcon.dashboard2.service;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


public interface CrudService <T, ID extends Serializable>{
	
	List<T> findAll();
	
	List<T> findByOpeningDate (LocalDate begin, LocalDate end);
	
	T save(T entity);
	
	List<T> findAll(Sort sort);
	
	Page<T> findAll(Pageable pageable);
	
	T saveAndFlush(T entity);
	
	Iterable<T> save(Iterable<T> iterable);
	
	void flush();
	
	T findOne(ID id);
	
	boolean exists(ID id);
	
	long count();
	
	void delete(ID id);
	
	void delete(T entity);
	
	void delete(Iterable<? extends T> iterable);
	
	void deleteAll();
}
