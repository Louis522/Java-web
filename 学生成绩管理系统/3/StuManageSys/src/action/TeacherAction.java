package action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import models.Course;
import models.Course_teacher;
import models.Student;
import models.Student_course;
import models.Teacher;

import org.apache.struts2.ServletActionContext;

import service.TeacherService;

import com.opensymphony.xwork2.ActionContext;

public class TeacherAction {
	private HttpServletRequest request;
	private Teacher newteacher;
	private TeacherService teacherservice;

	
	
	public HttpServletRequest getRequest() {
		return request;
	}



	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}



	public Teacher getNewteacher() {
		return newteacher;
	}



	public void setNewteacher(Teacher newteacher) {
		this.newteacher = newteacher;
	}



	public TeacherService getTeacherservice() {
		return teacherservice;
	}



	public void setTeacherservice(TeacherService teacherservice) {
		this.teacherservice = teacherservice;
	}



	public String execute() throws Exception {       //��ʦ��ѡ�γ� 
		ActionContext.getContext().getSession().put("teacher", newteacher);
		teacherservice.updateTeachInfo(newteacher);
		return "success";
	}
	public String selectCourse(){
		request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		Teacher teacher=(Teacher)session.getAttribute("teacher");
		
			List<Course_teacher> course_selected=teacherservice.hasSelect(teacher);//�õ��Ѿ�ѡ����Ŀγ�
			System.out.println(course_selected.size());
			
		
		List<Course> all=teacherservice.getAll();   //�������пγ�
		ArrayList<Integer> selected=new ArrayList<Integer>();   //��¼�Ѿ�ѡ��Ŀγ�id
		ArrayList<Integer> allcourse=new ArrayList<Integer>();   //��¼���пγ̵�id
		for(int i=0;i<course_selected.size();i++){
			Integer a=course_selected.get(i).getCourse().getCId();
			selected.add(a);
		}
		for(int i=0;i<all.size();i++){
			Integer b=all.get(i).getCId();
			allcourse.add(b);
		}
		for (int j = 0; j < selected.size(); j++) {
			if (allcourse.contains(selected.get(j))) {
				allcourse.remove(selected.get(j));          //�Ѿ�ѡ����ÿγ̣������Ƴ�

			}

		}
		ArrayList<Integer> rest=allcourse;
		ArrayList<Course> restcourse=new ArrayList<Course>();    //��¼��ʦ����ѡ��Ŀγ�
	  for(Course c:all){
		  for(Integer i:rest){
			  if(c.getCId()==i){
				  restcourse.add(c);
			  }
		  }
	  }
	  for(int i=0;i<restcourse.size();i++){
		  Course a=restcourse.get(i);
		  System.out.println("cidΪ��"+a.getCId());
		  System.out.println("cnameΪ��"+a.getCName());
		  System.out.println("chourΪ��"+a.getCHour());
		  
	  }
	  request.setAttribute("canSelect", restcourse);
		
	
		
		return "success";
		
	
		
	}
	
	public String  sure(){              //��ʦȷ��ѡ��ĳ���γ�
		request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		Teacher a=(Teacher)session.getAttribute("teacher");
		int t_id=a.getTId();
		String c_id=request.getParameter("cid");
		System.out.println("t_id"+t_id);
		System.out.println("c_id"+c_id);
		Course_teacher ct=new Course_teacher();
		ct.setTeacher(a);
		Course cou=new Course();
		cou.setCId(Integer.parseInt(c_id));
		ct.setCourse(cou);
		
		teacherservice.sureSelect(ct);
	return "success";
	}
	
	
	public String selectResult(){                //ѡ�ν����ѯ
		request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		Teacher teacher=(Teacher)session.getAttribute("teacher");
		
			List<Course_teacher> course_selected=teacherservice.hasSelect(teacher);//�õ��Ѿ�ѡ����Ŀγ�

	  request.setAttribute("hasSelect", course_selected);
	  
		return "success";
	}
	
	
	public String cancel(){                 //ɾ��ѡ�ν��
		request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		Teacher a=(Teacher)session.getAttribute("teacher");
		String ct_id=request.getParameter("ctid");
		
		List<Student_course> list=teacherservice.showOneStu(Integer.parseInt(ct_id));
		if(list.size()==0){
			Course_teacher ct=new Course_teacher();
			ct.setCTId(Integer.parseInt(ct_id));
			
			teacherservice.cancelSelect(ct);
		return "success";
		}
		else return "fail";
		
	}
	
	
	public String showAll(){           //��ѯ�ڿ�
		request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		Teacher teacher=(Teacher)session.getAttribute("teacher");
		
			List<Course_teacher> course_selected=teacherservice.hasSelect(teacher);//�õ��Ѿ�ѡ����Ŀγ�

	  request.setAttribute("hasSelect", course_selected);
	  
		return "success";
	}
	
	public String showAStudent(){
		request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		Teacher teacher=(Teacher)session.getAttribute("teacher");
		String Ctid=request.getParameter("ctid");
		List<Student_course> list=teacherservice.showOneStu(Integer.parseInt(Ctid));
	    request.setAttribute("oneStu", list);
	    return "success";
	}
	
	
	public String showWindow(){
		request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		
		String stu_id=request.getParameter("stuid");
		String c_t_id=request.getParameter("ctid");
		String grade=request.getParameter("grade");
		Student a=teacherservice.searchStudent(stu_id);
		
		System.out.println("ctid------------->"+c_t_id);
		session.setAttribute("stuid", stu_id);
		session.setAttribute("ctid", c_t_id);
		session.setAttribute("stuName", a.getStuName());
		request.setAttribute("grade", grade);
		
		return "success";
	}
	public String changeGrade(){
		request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
//		Teacher a=(Teacher)session.getAttribute("teacher");
		String ctid=(String)session.getAttribute("ctid");
		String stuid=(String)session.getAttribute("stuid");
		String newgrade=(String)request.getParameter("newgrade");
		
		teacherservice.changeGrade(Integer.parseInt(ctid), stuid, Integer.parseInt(newgrade));
		return "success";
		
	}
	
}
