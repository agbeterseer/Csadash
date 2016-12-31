/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fetchr.csa.service;

import com.fetchr.csa.model.Agents;
import com.fetchr.csa.repositories.AgentRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author terseer
 */
@Service
public class AgentsServiceImpl implements AgentsService {

    private AgentRepository agentRepository;
    
    @Override
    public Agents saveAgents(Agents agent) {
       return agentRepository.save(agent);
    
    }
    
    
}
