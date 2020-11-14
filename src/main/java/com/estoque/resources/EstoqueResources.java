package com.estoque.resources;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.estoque.models.Bebidas;
import com.estoque.repository.EstoqueRepository;



@RestController
@RequestMapping("/estoque")
public class EstoqueResources {
	
	@Autowired
	private EstoqueRepository er;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Bebidas> listaBebidas(){
		Iterable<Bebidas>listaBebidas = er.findAll();
		return listaBebidas;	
		}
	
	@PostMapping()
	public Bebidas cadastroBebidas(@RequestBody @Valid Bebidas bebidas) {
		return er.save(bebidas);		
	}
	
	@DeleteMapping()
	public Bebidas deletaEvento(@RequestBody Bebidas bebidas) {
		er.delete(bebidas);
		return bebidas;
		
	}

}
