package baithi;

import java.io.InputStream;

import org.apache.jena.iri.impl.Main;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFactory;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.query.ResultSetRewindable;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;
public class truyvan {

//	public static void main(String[] args) {
//		FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
//		Model model=FileManager.get().loadModel("G://web_ngu_nghia/dulieu.rdf");
//		String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
//				+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
//				+ " SELECT * WHERE  {"
//			
//				+ "?FN vcard:ADR ?x." //truy vấn địa chỉ
//				+ " } ";
//		Query query=QueryFactory.create(queryString);
//		QueryExecution qexec= QueryExecutionFactory.create(query, model);
//		try {
//			ResultSet results=qexec.execSelect();
//			while (results.hasNext()) {
//				QuerySolution soln=results.nextSolution();
//				Literal name=soln.getLiteral("x");
//				System.out.println("ADR: "+name);
//			}
//		} finally {
//			qexec.close();
//		}
//	}
//	public static void main(String[] args) {
//		FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
//		Model model=FileManager.get().loadModel("G://web_ngu_nghia/dulieu.rdf");
//		String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
//				+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
//				+ " SELECT * WHERE  {"
//				+ "?FN vcard:NAME ?x." 
//				
//				+ " } ";
//		Query query=QueryFactory.create(queryString);
//		QueryExecution qexec= QueryExecutionFactory.create(query, model);
//		try {
//			ResultSet results=qexec.execSelect();
//			while (results.hasNext()) {
//				QuerySolution soln=results.nextSolution();
//				Literal name=soln.getLiteral("x");
//				
//				System.out.println("Họ và tên:"+name);
//				
//			}
//		} finally {
//			qexec.close();
//		}
//	}
//	public static void main(String[] args) {
//		FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
//		Model model=FileManager.get().loadModel("G://web_ngu_nghia/dulieu.rdf");
//		String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
//				+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
//				+ " SELECT * WHERE  {"
//				+ "?coutry vcard:NAME ?x." 
//				+ "?coutry vcard:ADR ?y." 
//				+ " } ";
//		Query query=QueryFactory.create(queryString);
//		QueryExecution qexec= QueryExecutionFactory.create(query, model);
//		try {
//			ResultSet results=qexec.execSelect();
//			while (results.hasNext()) {
//				QuerySolution soln=results.nextSolution();
//				Literal name=soln.getLiteral("x");
//				Literal name1=soln.getLiteral("y");
//				System.out.println("Họ và tên:"+name);
//				System.out.println("ADR: "+name1);
//			}
//		} finally {
//			qexec.close();
//		}
//	}
	
		
	
}
