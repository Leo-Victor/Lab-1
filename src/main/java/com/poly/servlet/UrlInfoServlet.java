package com.poly.servlet;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/url-info")
public class UrlInfoServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws IOException{
		resp.setContentType("text/html;charset=UTF-8");
		
		resp.getWriter().printf("""
				<h2>Thông tin URL</h2>
				<ul>
					<li><b>URL:</b> %s</li>
					<li><b>URI:</b> %s</li>
					<li><b>QueryString:</b> %s</li>
					<li><b>ServletPath:</b> %s</li>
					<li><b>ContextPath:</b> %s</li>
					<li><b>PathInfo:</b> %s</li>
					<li><b>Method:</b> %s</li>
				</ul>
				
				""",req.getRequestURL(),req.getRequestURI(), req.getQueryString(),
				req.getServletPath(), req.getContextPath(), req.getPathInfo(),
				req.getMethod()
				);
	}
}
