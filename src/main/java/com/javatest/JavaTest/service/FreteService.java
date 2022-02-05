package com.javatest.JavaTest.service;

import com.javatest.JavaTest.model.Frete;
import com.javatest.JavaTest.repository.FreteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreteService {
    @Autowired
    private FreteRepository freteRepository;

    public Frete saveFrete(Frete frete){
        return freteRepository.save(frete);
    }
    public List<Frete> saveFretes(List<Frete> fretes){
        return freteRepository.saveAll(fretes);
    }
    public List<Frete> getFretes(){
        return freteRepository.findAll();
    }
    public Frete getFreteById(Long id){
        return freteRepository.findById(id).orElse(null);
    }
    public Frete getFreteByName(String nomeDestinatario){
        return freteRepository.findByName(nomeDestinatario);
    }

    public String deleteFrete(Long id){
        freteRepository.deleteById(id);
        return "Frete deletado com id: "+id;
    }

    public Frete updateFrete(Frete frete){
        Frete existingFrete = freteRepository.findById(frete.getId()).orElse(null);
        existingFrete.setNomeDestinatario((frete.getNomeDestinatario()));
        return freteRepository.save(existingFrete);
    }
}
