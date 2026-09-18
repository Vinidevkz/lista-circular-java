package ListaCircularDupla.models;

import java.util.Objects;

public class Pagina {
	
	private String script = "/umscript.py";
	private String input = "{}";
	private String id = "";
	
	public Pagina(){}

	public Pagina(String script, String input, String id) {
		this.script = script;
		this.input = input;
		this.id = id;
	}

	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Pagina [script=" + script + ", input=" + input + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, input, script);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagina other = (Pagina) obj;
		return Objects.equals(id, other.id) && Objects.equals(input, other.input)
				&& Objects.equals(script, other.script);
	}
	
	
}
