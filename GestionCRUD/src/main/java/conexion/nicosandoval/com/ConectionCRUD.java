package conexion.nicosandoval.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConectionCRUD
 */
@WebServlet("/ConectionCRUD")
public class ConectionCRUD extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConectionCRUD() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		String url = "jdbc:mysql://localhost:3306/gestionpedidoscrud?useSSL=false";
		String user = "root";
		String pass = "Password";
		String driver = "com.mysql.cj.jdbc.Driver";
		try {

			PrintWriter out = response.getWriter();

			out.print("intentando conectar con la BD " + url + " <br> ");

			Class.forName(driver);

			Connection conn = DriverManager.getConnection(url, user, pass);

			out.print(" coneccion con la base de datos exitosa");
			out.flush();
			out.close();

			conn.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR: " + e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
