package com.hibernate.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.hibernate.entity.Customer;
import com.hibernate.entity.Employee;
import com.hibernate.entity.School;
import com.hibernate.entity.SchoolDetail;

public class HibernateMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		//configuration.addAnnotatedClass(Employee.class);
		//configuration.addAnnotatedClass(Customer.class);
		configuration.addAnnotatedClass(School.class);
		configuration.configure();
		
		new SchemaExport(configuration).create(true, true);
		
		/*Employee employee = new Employee();
		employee.setEmpid(1);
		employee.setEmpName("Karthick Krishnan");
		employee.setEmpEmailAddress("KK@gmail.com");
		employee.setEmpPassword("karthiPass");
		employee.setPermanent(true);
		employee.setEmpJoinDate(new Date());
		employee.setEmpLoginTime(new Date());*/
		
		/*Customer customer = new Customer();
		customer.setCustomerName("Karthik Krishnan");
		customer.setCustomerAddress("4-353, 2nd Floor, 4th Street, MGR Nagar, Kottivakkam, Chennai-41");
		customer.setCreditScore(70);
		customer.setRewardPoints(12000);*/
		
		SchoolDetail detail = new SchoolDetail();
		detail.setPublicSchool(false);
		detail.setSchoolAddress("4-353, 2nd Floor, 4th Street, MGR Nagar, Kottivakkam, Chennai-41");
		detail.setStudentCount(100);
		
		School school = new School();
		school.setSchoolName("DR VGN Mat Hr Sec School");
		school.setSchoolDetail(detail);
		
		SessionFactory factory = configuration.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
		Session session = factory.openSession();
		
		session.beginTransaction();
		//session.save(employee);
		//session.save(customer);
		session.save(school);
		
		session.getTransaction().commit();
		session.close();
	}
}
