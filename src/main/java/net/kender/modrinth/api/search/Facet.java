package net.kender.modrinth.api.search;

public class Facet {
	private String res;
	public Facet(Facets f,OFacet s,String value) {
		String ops="";
		if(s.name().equals("DIFFERENT")) {
			ops = "!=";
		}else if(s.name().equals("GREATER_EQUAL")) {
			ops = ">=";
		}else if(s.name().equals("MAJOR")) {
			ops = ">";
		}else if(s.name().equals("LESS_EQUAL")) {
			ops = "<=";
		}else if(s.name().equals("MINOR")) {
			ops = "<";
		}else if(s.name().equals("EQUAL")) {
			ops = ":";
		}
		res = "[%22" + f.name() + ops + value + "%22]";
	}
	@Override
	public String toString() {
		return res;
	}

}
