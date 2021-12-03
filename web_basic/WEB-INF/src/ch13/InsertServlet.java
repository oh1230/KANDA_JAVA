package ch13;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		String error = "";

		try {
			request.setCharacterEncoding("UTF-8");

			AccountInfo accountinfo = new AccountInfo();

			accountinfo.setId(request.getParameter("id"));
			accountinfo.setName(request.getParameter("name"));
			accountinfo.setEmail(request.getParameter("email"));
			accountinfo.setAuthority(request.getParameter("authority"));

			AccountDao4 objDao4 = new AccountDao4();

			int count = objDao4.insert(accountinfo);

			request.setAttribute("count", count);

		} catch (IllegalStateException e) {
			error = "DB接続エラーの為、一覧表示はできませんでした。"+e;
		} catch (Exception e) {
			error = "予期せぬエラーが発生しました。<br>" + e;
		} finally {
			request.setAttribute("error", error);
			request.getRequestDispatcher("/view/ch13/insertReceipt.jsp").forward(request, response);
		}
	}
}
