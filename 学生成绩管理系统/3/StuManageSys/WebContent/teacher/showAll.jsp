<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
     <br /><br /><br /><br />
    <table border="1" width="50%" align="center">
    	<tr bgcolor="lightgreen">
    		<td align="center">�ڿκ�</td>
    		<td align="center">��ʦ���</td>
    		<td align="center">��ʦ��</td>
    		<td align="center">�γ̱��</td>
    		<td align="center">�γ���</td>
    		<td colspan="2" align="center">����</td>
    	</tr>
    	<s:iterator value="%{#request.hasSelect}" var="course_teacher">
    	<tr>
    		<td align="center"><s:property value="#course_teacher.CTId" /></td>
    		<td align="center"><s:property value="#course_teacher.getTeacher().TId" /></td>
    		<td align="center"><s:property value="#course_teacher.getTeacher().TName" /></td>
    		<td align="center">&nbsp;<s:property value="#course_teacher.getCourse().CId" /></td>
    		<td align="center">&nbsp;<s:property value="#course_teacher.getCourse().CName" /></td>
    		<td align="center"><a href="showAStudent.action?ctid=<s:property value='#course_teacher.CTId' />" >��ʾ�ÿγ̵�ѧ����Ϣ</a></td>
    		
    	</tr>
    	</s:iterator>
    </table>
  </body>
</html>
