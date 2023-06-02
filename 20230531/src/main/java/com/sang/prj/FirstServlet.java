package com.sang.prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FirstServlet() {
        super();
    }

//												요청							응답
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		get 방식  변수달고 감  -> 검색하는 것을 가져옴 com./ ~~~ 검색한것(아이디 비번 쳤을 때 이거 나오면 안되겠죠?)
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>행복한 JSP</h1>");
		out.print("<h1>이름 : 홍길동</h1>");
		out.print("<h1>직업 : 괴도</h1>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		post 방식 폼 객체를 그냥 넘겨 주는 방식
		doGet(request, response);
	}

}
