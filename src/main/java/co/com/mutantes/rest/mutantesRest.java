package co.com.mutantes.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.JoinColumn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import co.com.mutantes.dao.mutantesDAO;
import co.com.mutantes.model.mutantes;

@RestController
@RequestMapping("mutantes")
public class mutantesRest {
	
	@Autowired
	private mutantesDAO mutantesDao;
	
	@PostMapping("/mutant")
	public void mutant(@RequestBody mutantes mutantes) {
		
		System.out.println(mutantes.isIs_mutant());
		
		int N = mutantes.getDna().length;
		if(N<4) {
			new ResponseStatusException(HttpStatus.valueOf("EL DNA DEBE SER MAYOR A 3 LETRAS"));
   		 	System.exit(0);
		}
		for (int y = 0; y < N; y++) {
		      for (int i = 0; i < N; i++) {
				if(!(mutantes.getDna()[y].substring(i, (i + 1)).equals("A") || mutantes.getDna()[y].substring(i, (i + 1)).equals("T")
		    			|| mutantes.getDna()[y].substring(i, (i + 1)).equals("C") || mutantes.getDna()[y].substring(i, (i + 1)).equals("G"))){
		    		 new ResponseStatusException(HttpStatus.valueOf("LETRAS DE DNA NO VALIDAS"));
		    		 System.exit(0);
		    	}
		    }
		}
		
		mutantesDao.save(mutantes);
		//mutantesDao.saveProjects(mutantes.getDna(), mutantes.getIsMutant(), mutantes.getIdMutantes());
		if(mutantes.isIs_mutant() != true) {
			 throw new ResponseStatusException(HttpStatus.FORBIDDEN);
		}else {
			 throw new ResponseStatusException(HttpStatus.OK);
		} 
	}
	
	@GetMapping("/list")
	public List<mutantes> list(){
		return mutantesDao.findAll();
	}
	
	@GetMapping("/stats")
	public HashMap<String, Integer> sayHello() {
	    HashMap<String, Integer> map = new HashMap<>();
	    map.put("count_mutant_dna", (int) mutantesDao.stamutan());
	    map.put("count_human_dna", (int) mutantesDao.stahuman());
	    map.put("ratio", (int) ((mutantesDao.stamutan() /mutantesDao.stahuman())));
	    return map;
	}

}
