package baithi;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdfs.assembler.VocabRDFS;
import org.apache.jena.riot.system.Prefixes;
import org.apache.jena.sparql.vocabulary.FOAF;
import org.apache.jena.vocabulary.DC;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.SKOS;

import org.apache.jena.vocabulary.VCARD;

public class baithijena {
	static Model creaModel() {
		// some definitions
		String personURI = "http://www.w3.org/DoiDau/TruongVANB";
		String CAONHATIRI ="http://semanticweb-lear/CAONHAT";
		String DoiIRI = "http://ww.w3.org/doidau";
		String subjectIRI = "http://ww.w3.org/TruongDH";
		String CONlIRI = "http://ww.w3.org/DOIDAU";
		String givenName = "TruongVan";
		String familyName = "B";
		String birthday = "22/12/1900";
		String gender = "Nam";
		String fullName = givenName + " " + familyName;
		
		//Đời 1
		String personURIKd1 = "http://www.w3.org/doi1";
		String doi1nam = "http://www.w3/.org/TruongVanA";
		String givenName1 = "TruongVan";
		String familyName1 = "A";
		String birthday1  =" 12/12/1940";
		String gender1 = "Nam";
		String fullName1 = givenName1 + " " + familyName1;
		
		String doi1nu = "http://www.w3/.org/CheThiTuyetVan";
		String givenName2 = "CheThi";
		String familyName2 = "TuyetVan";
		String birthday2  =" 12/12/1945";
		String gender2 = "Nữ";
		String fullName2 = givenName2 + " " + familyName2;
		
		

	
		//đời 2
		String personURId2 = "http://www.w3.org/doi2";
		String doi2nu = "http://www.w3.org/HuynhTienAnh";
		String givenName3 = "HoangThi";
		String familyName3 = "ThuyNhi";
		String birthday3  =" 12/12/1963";
		String gender3 = "Nữ";
		String fullName3 = givenName3 + " " + familyName3;
		
		String doinam2 = "http://www.w3/.org/TruongVanTu";
		String givenName4 = "TruongVan";
		String familyName4 = "Tu";
		String birthday4  ="12/12/1960";
		String gender4 = "Nam";
		String fullName4 = givenName4 + " " + familyName4;
		
		// đời 3
		String personURId3 = "http://www.w3.org/doi3";
		String doi3nu = "http://www.w3.org/HoThiHai";
		String givenName5 = "HoThi";
		String familyName5 = "Hai";
		String birthday5  =" 12/12/1984";
		String gender5 = "Nữ";
		String fullName5 = givenName5 + " " + familyName5;
		
		String doi3nam = "http://www.w3/.org/TruongVanNam";
		String givenName6 = "TruongVan";
		String familyName6 = "Nam";
		String birthday6  ="12/12/1980";
		String gender6 = "Nam";
		String fullName6 = givenName6 + " " + familyName6;
		
		// create an empty Model
		Model model1 = ModelFactory.createDefaultModel();

		// create the resource
		// and add the properties cascading style
		Resource lmc = model1.createResource(CONlIRI);
			Property vithe=model1.createProperty(CAONHATIRI);
		Resource laDoiDau = model1.createResource(DoiIRI);
			Property subject=model1.createProperty(subjectIRI);
			model1.createResource(CONlIRI).
				addProperty(subject, model1.createResource(personURIKd1)
						.addProperty(VCARD.FN, model1.createResource(doi1nam)
							.addProperty(VCARD.NAME, (fullName1))
							.addProperty(RDF.predicate, (birthday1))
							.addProperty(VCARD.NOTE, (gender1))).
						addProperty(VCARD.FN, model1.createResource(doi1nu)
							.addProperty(VCARD.NAME, (fullName2))
							.addProperty(RDF.predicate, (birthday2))
							.addProperty(VCARD.NOTE, (gender2))).
						
				addProperty(subject, model1.createResource(personURId2).
						addProperty(VCARD.FN, model1.createResource(doi2nu)
						.addProperty(VCARD.NAME, (fullName3))
						.addProperty(RDF.predicate, (birthday3))
						.addProperty(VCARD.NOTE, (gender3))).
					addProperty(VCARD.FN, model1.createResource(doinam2)
						.addProperty(VCARD.NAME, (fullName4))
						.addProperty(RDF.predicate, (birthday4))
						.addProperty(VCARD.NOTE, (gender4)))).
				
				addProperty(subject, model1.createResource(personURId3).
						addProperty(VCARD.FN, model1.createResource(doi3nu)
						.addProperty(VCARD.NAME, (fullName5))
						.addProperty(RDF.predicate, (birthday5))
						.addProperty(VCARD.NOTE, (gender5)))).
					addProperty(VCARD.FN, model1.createResource(doi3nam)
						.addProperty(VCARD.NAME, (fullName6))
						.addProperty(RDF.predicate, (birthday6))
						.addProperty(VCARD.NOTE, (gender6))));
						
			lmc.addProperty(vithe,laDoiDau );
			lmc.addProperty(VCARD.ADR, (personURI));
			lmc.addProperty(VCARD.NAME, (fullName));
			lmc.addProperty( VCARD.NOTE,(gender));
			lmc.addProperty(DC.type, FOAF.Person);
			lmc.addProperty(FOAF.based_near,model1.createResource(personURIKd1));
			return model1;
	}
///////////////////////////////////////////

	static void createAndPrintModel() {
		Model model1 =creaModel();
		// In nội dung của model dưới dạng mặc định (XML-RDF)
		model1.write(System.out);
	}
	
	public static void main(String[] args) {
		createAndPrintModel();
	}

	
}
