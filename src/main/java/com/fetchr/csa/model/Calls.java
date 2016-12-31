package com.fetchr.csa.model;

import java.util.List;

 

public class Calls
{
       
	private String id;
	private String queueName;
	private int reference_number;
	private String order_type;	
	private String call_before;			//On the DB table, this should be created as a TIMESTAMP COLUMN
	private String call_after;			//On the DB table, this should be created as a TIMESTAMP COLUMN
	private String date_created;
        private String clientName;                      //On the DB table, this should be created as a TIMESTAMP COLUMN
	private String status;
        private CustomerData customerData;
        private List previous_addresses;
        private String location_confirmed;
        private String app_problem;
        private String webapp_problem;
        private String sms_problem;
        private String blind_delibery;
        private String comments;
        
        
	
	public Calls(int reference_number)
	{
		this.reference_number = reference_number;
	}
	

	public Calls() {
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQueueName() {
		return queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

	public int getReference_number() {
		return reference_number;
	}

	public void setReference_number(int reference_number) {
		this.reference_number = reference_number;
	}

	public String getOrder_type() {
		return order_type;
	}

	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}

	public String getCall_before() {
		return call_before;
	}

	public void setCall_before(String call_before) {
		this.call_before = call_before;
	}

	public String getCall_after() {
		return call_after;
	}

	public void setCall_after(String call_after) {
		this.call_after = call_after;
	}

	public String getDate_created() {
		return date_created;
	}

	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Orders [id=" + id + ", queueName=" + queueName + ", reference_number=" + reference_number
				+ ", order_type=" + order_type + ", call_before=" + call_before + ", call_after=" + call_after
				+ ", date_created=" + date_created + ", status=" + status + "]";
	}
	
	
}
