package prog5;

public class MyTable {
	private Entry[] entries = new Entry[26];

	public void add(char c, String s) {
		int index = c - 'a';
		entries[index] = new Entry(c, s);
	}

	public String get(char c) {
		int index = c - 'a';
		if (entries[index] == null) {
			return null;
		}
		return entries[index].getValue();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Entry entry : entries) {
			if (entry != null) {
				sb.append(entry.toString());
				sb.append('\n');
			}
		}
		return sb.toString();
	}

	private class Entry {
		private char key;
		private String value;

		public Entry(char key, String value) {
			this.key = key;
			this.value = value;
		}

		public char getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}

		public String toString() {
			return key + "->" + value;
		}
	}

	public static void main(String[] args) {
		MyTable table = new MyTable();
		table.add('c',"hola");
		table.add('a',"año");
		table.add('j',"jalowin");
		table.add('a',"anastacio");
		System.out.println(table);
	}
}