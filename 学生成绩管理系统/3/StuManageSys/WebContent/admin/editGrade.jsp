<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="/struts-tags" prefix="s" %>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>


  </head>
  
  <body>
   <center>
   <br/><br/><br/><br/><br/>
     <form action="adminChangeGrade.action" method="post">
					<table border="1px" width="300px">
						
						<tr>
							<td>
								������
							</td>
							<td>
								<input type="text" value="${sessionScope.stuName}"
									name="newteacher.TName" readonly="readonly"/>
							</td>
						</tr>
						
						<tr>
							<td>
								�ɼ���
							</td>
							<td>
								<input type="text" value="${requestScope.grade}"
									name="newgrade" />
							</td>
						</tr>
						
						<tr>
							<td colspan="2" align="center">
								<input type="submit" value="����" />
								<input type="button" value="ȡ��" onclick="window.history.go(-1)"/>
							</td>
						</tr>
					</table>
				</form>
     </center>
  </body>
</html>
