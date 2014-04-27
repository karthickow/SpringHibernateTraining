package com.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.hibernate.entity.manytomanymapping.Delegate;
import com.hibernate.entity.manytomanymapping.Event;

public class HibernateMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		//configuration.addAnnotatedClass(Employee.class);
		
		//configuration.addAnnotatedClass(Customer.class);
		
		/*configuration.addAnnotatedClass(School.class);
		configuration.addAnnotatedClass(SchoolDetail.class);*/
		
		//configuration.addAnnotatedClass(Accounts.class);
		
		/*configuration.addAnnotatedClass(Project.class);
		configuration.addAnnotatedClass(Module.class);
		configuration.addAnnotatedClass(Task.class);*/
		
		/*configuration.addAnnotatedClass(Person.class);
		configuration.addAnnotatedClass(PersonDetail.class);*/
		
		/*configuration.addAnnotatedClass(College.class);
		configuration.addAnnotatedClass(Student.class);*/
		
		configuration.addAnnotatedClass(Delegate.class);
		configuration.addAnnotatedClass(Event.class);
		
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
		
		/*SchoolDetail detail = new SchoolDetail();
		detail.setPublicSchool(false);
		detail.setSchoolAddress("4-353, 2nd Floor, 4th Street, MGR Nagar, Kottivakkam, Chennai-41");
		detail.setStudentCount(100);
		
		School school = new School();
		school.setSchoolName("DR VGN Mat Hr Sec School");
		school.setSchoolDetail(detail);*/
		
		/*CompoundKey key = new CompoundKey(1, 10001);
		Accounts savings = new Accounts();
		savings.setCompoundKey(key);
		savings.setAccountBalance(8000);
		
		CompoundKey key1 = new CompoundKey(1, 20001);
		Accounts checking = new Accounts();
		checking.setCompoundKey(key1);
		checking.setAccountBalance(2500);*/
		
		/*Project project = new Project();
		project.setProjectName("Hibernate Lessions");
		
		Module module = new Module();
		module.setProjectName("Spring Lessions");
		module.setModuleName("AOP");
		
		Task task = new Task();
		task.setProjectName("Java Lessions");
		task.setModuleName("Collections");
		task.setTaskName("ArrayList");*/
		
		/*PersonDetail personDetail = new PersonDetail();
		personDetail.setIncome(6786.90);
		personDetail.setJob("Accountant");
		personDetail.setZipCode("20145");
		
		Person person = new Person();
		person.setPersonName("Karthick Krishnan");
		person.setPersonDetail(personDetail);*/
		
		/*College college1 = new College();
		college1.setCollegeName("Maharaja College");
		
		Student student1 = new Student();
		student1.setStudentName("Karthick Krishnan");
		student1.setCollege(college1);
		
		Student student2 = new Student();
		student2.setStudentName("John Smith");
		student2.setCollege(college1);*/
		
		Delegate delegate1 = new Delegate();
		delegate1.setDelegateName("Karthick Krishnan");
		Delegate delegate2 = new Delegate();
		delegate2.setDelegateName("John Smith");
		Delegate delegate3 = new Delegate();
		delegate3.setDelegateName("John Doe");
		Delegate delegate4 = new Delegate();
		delegate4.setDelegateName("Johnson Smith");
		
		Event java = new Event();
		java.setEventName("Java");
		Event cplus = new Event();
		cplus.setEventName("C++");
		Event math = new Event();
		math.setEventName("Maths");
		
		java.getDelegates().add(delegate1);
		java.getDelegates().add(delegate2);
		java.getDelegates().add(delegate3);
		
		cplus.getDelegates().add(delegate2);
		cplus.getDelegates().add(delegate3);
		math.getDelegates().add(delegate4);
		
		SessionFactory factory = configuration.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		//session.save(employee);
		
		//session.save(customer);
		
		//session.save(school);
		
		/*session.save(savings);
		session.save(checking);*/
		
		/*session.save(project);
		session.save(module);
		session.save(task);*/
		
		//session.save(person);
		
		/*session.save(college1);
		session.save(student1);
		session.save(student2);*/
		
		session.save(delegate1);
		session.save(delegate2);
		session.save(delegate3);
		session.save(delegate4);
		session.save(java);
		session.save(cplus);
		session.save(math);
		
		session.getTransaction().commit();
		session.close();
	}
}
