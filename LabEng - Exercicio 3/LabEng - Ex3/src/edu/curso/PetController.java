package edu.curso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/pet")
public class PetController extends HttpServlet {

	public List<Pet> getListapets(){
		List<Pet> petsEncontrados = (List<Pet>) getServletContext().getAttribute("LISTA");
		if (petsEncontrados == null) {
			petsEncontrados = new ArrayList<>();
			getServletContext().setAttribute("LISTA", petsEncontrados);
		}
		return petsEncontrados;
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Pet Controller executado");
		
		String valorId = req.getParameter("id");
		if (valorId == null) { 
			valorId = "";
		}
		
		List<Pet> petsEncontrados = getListapets();
		
		Gson gson = new Gson();
		String petsJSon = gson.toJson(petsEncontrados);
		
		// res.setContentType("text/html"); // Mime Type
		res.setContentType("application/json"); // Mime Type
		res.addHeader("Access-Control-Allow-Origin", "*");
		res.addHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,PATCH,OPTIONS");
		res.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
		PrintWriter out = res.getWriter();
		// out.println("<h3>Servlet PetController foi acionado</h3>");	
		out.println(petsJSon);
		
	}
	
	public void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		response.setContentType("text/plain"); // Mime Type
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,PATCH,OPTIONS");
		response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
	}
		
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		BufferedReader br = request.getReader();
		System.out.println("POST Adicionado");
		
		List<Pet> petsEncontrados = getListapets();
		
		StringBuffer sb = new StringBuffer();
		while (br.ready()) {
			sb.append(br.readLine());
		}
		
		Gson gson = new Gson();
		Pet m = gson.fromJson(sb.toString(), Pet.class);
		petsEncontrados.add(m);
		
		response.setContentType("text/plain"); // Mime Type
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,PATCH,OPTIONS");
		response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
		PrintWriter out = response.getWriter();
		out.println("Ok");
	}
}