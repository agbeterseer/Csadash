/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fetchr.csa.repositories;

import com.fetchr.csa.model.Agents;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author terseer
 */
public interface AgentRepository extends CrudRepository<Agents, String>{
    
}
