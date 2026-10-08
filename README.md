# Spotify Wrapped

Ett enkelt Java-program som skriver ut en Spotify Wrapped-inspirerad sammanställning i terminalen. Programmet demonstrerar hur låtar och artister kan hanteras med Java-samlingar som `ArrayList`, `HashMap` och `HashSet`.

> **Obs!** Projektet använder exempeldata som är definierad direkt i koden. Det hämtar inte lyssningshistorik från Spotify och är inte en officiell Spotify-produkt.

## Funktioner

- Visar en lista med låtar.
- Samlar låtar per artist.
- Visar unika artister.
- Räknar det totala antalet låtar och artister.

## Kom igång

### Förutsättningar

- Java Development Kit (JDK) 8 eller senare

Kontrollera att Java är installerat:

```bash
java -version
javac -version
```

### Kompilera och kör

Kör följande kommandon från projektets rotmapp:

```bash
mkdir -p out
javac -d out src/Main.java
java -cp out Main
```

Programmet skriver sammanställningen direkt i terminalen. Ordningen på artisterna kan variera eftersom programmet använder en `HashSet` och en `HashMap`.

## Projektstruktur

```text
.
├── src/
│   └── Main.java
└── README.md
```

## Teknik

- Java
- Java Collections Framework (`ArrayList`, `HashMap`, `HashSet`)
