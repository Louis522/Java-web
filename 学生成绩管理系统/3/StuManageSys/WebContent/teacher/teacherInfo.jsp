<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>��ʦ������Ϣ</title>
  </head>
  
  <body>
  <div style="padding-top: 100px;">
  <center>
     <form action="../updateTeacher.action" method="post">
					<table border="1px" width="300px">
						<tr>
							<td>
								ѧ���ţ�
							</td>
							<td>
								<input type="text" value="${sessionScope.teacher.getTId()}" name="newteacher.TId" readonly="readonly"/>
								
							</td>
						</tr>
						<tr>
							<td>
								������
							</td>
							<td>
								<input type="text" value="${sessionScope.username}"
									name="newteacher.TName" readonly="readonly"/>
							</td>
						</tr>
						<tr>
							<td>
								�ֻ���
							</td>
							<td>
								<input type="text" value="${sessionScope.teacher.getTPhone()}"
									name="newteacher.TPhone" />
							</td>
						</tr>
						
						<tr>
							<td colspan="2" align="center">
								<input type="submit" value="����" />
							</td>
						</tr>
					</table>
				</form>
     </center>
     </div>
  </body>
</html>
