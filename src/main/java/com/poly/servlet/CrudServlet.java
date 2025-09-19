package com.poly.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/crud/create","/crud/update", "/crud/delete", "/crud/edit/2024"})
public class CrudServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException{
		resp.setContentType("text/html;charset=UTF-8");
		String uri = req.getRequestURI();
		if(uri.contains("create")) {
			resp.getWriter().println("<h2>Bạn vừa gọi đến chức năng Create</h2>");
		}else if (uri.contains("update")) {
			resp.getWriter().println("<h2>Bạn vừa gọi đến chức năng Update</h2>");
		}else if(uri.contains("delete")) {
			resp.getWriter().println("<h2>Bạn vừa gọi đến chức năng Delete</h2>");
		}else if (uri.contains("edit/2024")) {
            resp.getWriter().println("<h2>Bạn vừa gọi chức năng EDIT với ID = 2024</h2>");
        }
		
	}

}
