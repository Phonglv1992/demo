package com.phonglv.demo.data.repository.query.customer;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.data.annotation.Persistent;
import org.springframework.stereotype.Component;

import com.phonglv.demo.domain.Customer;

@Component
public class CustomerQueryRepositoryImpl implements CustomerQueryRepository {

	@SuppressWarnings("unused")
	private String[] fields = new String[] { "id", "name", "phoneNumber", "facebook", "address", "code", "createdDate",
			"createdBy", "updatedBy", "updatedDate", "isDeleted", "locationId", "locationName", "source", "note",
			"lastTakecared", "needMoreTakecare", "status" };

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings({ "unused", "unchecked" })
	@Override
	public Customer getById(Long id) {
		StoredProcedureQuery st=this.em.createStoredProcedureQuery("prc_customer_getbyid");
		st.registerStoredProcedureParameter(1, Long.class, ParameterMode.IN);
		st.registerStoredProcedureParameter(2, void.class, ParameterMode.REF_CURSOR);
		st.setParameter(1, id);
		st.execute();
		List<Object[]> results=st.getResultList();
		List<Customer> customers;
		if(results.size()>0) {
			
		}
		return null;
	}
	
	private Customer createCustomerFromArray(String[] fields, Object[] obj) {
		return null;
	}
	
	private List<Customer> createCustomerListFromResultList(String[] fields,List<Object[]> results){
		if(results.size()>0) {
			List<Customer> customer=new ArrayList<Customer>();
			for(Object[] obj:results) {

			}
		}
		return null;
	}

	@Override
	public String Test() {
		
		return "Test controller";
	}

	@Override
	public Customer getBestCustomer() {
		Customer cus=new Customer();
		cus.setId(10L);
		cus.setName("test");
		return cus;
	}

}
