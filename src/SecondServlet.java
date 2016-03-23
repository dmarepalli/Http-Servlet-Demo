

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		out.println("getParameter Demo");
		
		String uname = request.getParameter("uname");
		String ucontact = request.getParameter("ucontact");
		String ucourse = request.getParameter("ucourse");
		
		out.println("Student Name: "+uname);
		out.println("Student Contact: "+ucontact);
		out.println("Student Course: "+ucourse);
		
		out.println("GetParameter values");
		String[] values = request.getParameterValues("ucourse");
		for(String s:values){
			out.println("s");
		}
		
		out.println("GetParameterNames Demo");
		Enumeration names = request.getParameterNames();
		while(names.hasMoreElements()){
			out.println((String)names.nextElement());
		}
		
		
		out.println("getParameterMap Demo");
		Map<String,String[]> map = request.getParameterMap();
		
		Set s = map.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			Map.Entry m1 = (Map.Entry)i.next();
			out.println(m1.getKey());
			String[] s1 = request.getParameterValues(m1.getKey().toString());
			for(String s2:s1){
				out.println(s2);
			}
			
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
