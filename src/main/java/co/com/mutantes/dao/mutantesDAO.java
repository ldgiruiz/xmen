package co.com.mutantes.dao;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.com.mutantes.model.mutantes;

public interface mutantesDAO extends JpaRepository<mutantes,Integer> {

	
	public static  String human = "SELECT (select count(*) from  mutantes where is_mutant = 0 ) as colummut";
	@Query(value = human, nativeQuery = true)
	public long stahuman();
	
	public static  String mutan = "SELECT (select count(*) from  mutantes where is_mutant = 1) as colummut";
	@Query(value = mutan, nativeQuery = true)
	public long stamutan();
	
	public static  String ratio = "SELECT (select count(*) from  mutantes where is_mutant = 1) as colummut";
	@Query(value = mutan, nativeQuery = true)
	public long staration();

	
}
