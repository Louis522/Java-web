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
    		<td align="center">��ʦ���</td>
    		<td align="center">��ʦ��</td>
    		<td align="center">��ϵ�绰</td>
    		<td colspan="2" align="center">����</td>
    	</tr>
    	<s:iterator value="%{#request.teacherList}" var="teacher">
    	<tr>
    		<td align="center"><s:property value="#teacher.TId" /></td>
    		<td align="center"><s:property value="#teacher.TName" /></td>
    		<td align="center"><s:property value="#teacher.TPhone" /></td>
    		<td align="center"><a href="AdmindeleteTeacher.action?tid=<s:property value='#teacher.TId' />"onclick="return confirm('����:ɾ���ý�ʦ��ͬʱɾ���ý�ʦ��ѡ����Ϣ������ѡ�ý�ʦ��ѡ�γ̵�ѧ��ѡ�μ�¼!���Ҫɾ����?')" >ɾ��</a></td>
    		<td align="center"><a href="AdminUpdateTeacher.action?tid=<s:property value='#teacher.TId' />" >�༭</a></td>
    	</tr>
    	</s:iterator>
    </table>
  </body>
</html>
