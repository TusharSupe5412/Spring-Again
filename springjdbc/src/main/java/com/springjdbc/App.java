package com.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.springjdbc.DaoImpl.StudentDaoImpl;
import com.springjdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
       StudentDaoImpl studentDao = context.getBean("studentDao", StudentDaoImpl.class);
        
       		//       Insert start
//        Student student = new Student();
//        
//        student.setId(1);
//        student.setName("Tushar Supe");
//        student.setCity("kalyan");
//        
//        int r = studentDao.insert(student);
//        
//        System.out.println("No of row inserted" + r);
       
       		//     Insert End
       
       		//     Update Start
       
//       Student student = new Student();
//       
//       student.setId(10);
//       student.setName("Aruna");
//       student.setCity("Kalyan");
//       
//       int r = studentDao.update(student);
//       
//       System.out.println("NO of rows updated : " + r);
       
          //       Update end
       
       	 //        Select Single object
//       
//       Student student = studentDao.getStudent(101);
//       System.out.println(student);
       
       List<Student> studentList = studentDao.getStudentList();
       
       for (Student student : studentList) {
		
    	   System.out.println(student);
	}
      
    }
}
