/* Suche nach Entry fuer Key */

public Entry findEntry(String key) {
	int h = hashCode(key);
	while (data[h] != null && !key.equals(data[h].key))
		h = (h + 1) % data.length;
	return data[h];
}

/* Ist Key vorhanden? */

public boolean contains(String key) {
	return findEntry(key) =! null;
}

/* Value für Key zurückgeben */

public Object get(String key) {
	return findEntry(key) != null ? findEntry(key).value : null;
}

/* Ausgabe der gesamten HashMap */

public void printAll() {
	for (Entry p : data)
		p != null ? System.out.println(p.value) : ;
}

/* Neuen Wert eintragen */

public void put(String key, Ojbect value) {
	int h = Math.abs(key.hashCode()) % data.length;
	while (data[h] != null && !key.equals(data[h].key))
		h = (h + 1) % data.length;
	if (data[h) == null) {
		if(!(mapEntries < data.length - 1))
			throw new OutOfMemoryError();
		data[h] = new Entry(key, value);
		mapEntries++;
	}
	else
		data[h].value = value;
}
