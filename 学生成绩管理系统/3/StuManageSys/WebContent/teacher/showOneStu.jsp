<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
  </head>
  
  <body>
     <br /><br /><br /><br />
    <table border="1" width="80%" align="center">
    	<tr bgcolor="lightgreen">
    		<td align="center">�ڿκ�</td>
    		<td align="center">�ο���ʦ</td>
    		<td align="center">�γ̱��</td>
    		<td align="center">�γ���</td>
    		<td align="center">ѧ��</td>
    		<td align="center">ѧ����</td>
    		<td align="center">�ɼ�(-1����δ����)</td>
    		<td colspan="2" align="center">����</td>
    	</tr>
    	<s:iterator value="%{#request.oneStu}" var="all">
    	<tr>
    		<td align="center"><s:property value="#all.id.course_teacher.CTId" /></td>
    		<td align="center"><s:property value="#all.id.course_teacher.teacher.TName" /></td>
    		<td align="center"><s:property value="#all.id.course_teacher.course.CId" /></td>
    		<td align="center"><s:property value="#all.id.course_teacher.course.CName" /></td>
    		<td align="center">&nbsp;<s:property value="#all.id.student.stuId" /></td>
    		<td align="center">&nbsp;<s:property value="#all.id.student.stuName" /></td>
    		<td align="center">&nbsp;<s:property value="#all.grade" /></td>
    		<td align="center"><a href="showWindow.action?stuid=<s:property value='#all.id.student.stuId' />&ctid=<s:property value='#all.id.course_teacher.CTId' />&grade=<s:property value='#all.grade' />" >����ѧ���ɼ�</a></td>
    		
    	</tr>
    	</s:iterator>
    </table>
  </body>
</html>
