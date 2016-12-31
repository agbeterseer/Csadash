package com.fetchr.csa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

 
@Entity
public class Agents  
{
 
        @Id
	private String id;
	private String queueName;
	private String agentId;
	private String agentName;
	
	public Agents(){
	}

	public String getQueueName() {
		return queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	@Override
	public String toString() {
		return "Agents [queueName=" + queueName + ", agentId=" + agentId + ", agentName=" + agentName + "]";
	}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
	
	
}
