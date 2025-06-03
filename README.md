##  Come funziona l'app

L'app **Roll The Dice** simula il lancio di un dado. Quando l’utente preme un bottone, viene generato un numero casuale da 1 a 6.  
L'app mostra l’immagine del dado corrispondente e, dopo 5 secondi, reindirizza automaticamente a una schermata che indica se l'utente ha **vinto** (numero pari) o **perso** (numero dispari).

---

##  Funzioni delle Activity

### `MainActivity`
- Mostra un bottone per lanciare il dado (`button_roll`).
- Quando cliccato:
  - Mostra un `Toast`: "LANCIO DEL DADO".
  - Genera un numero casuale da 1 a 6.
  - Invia il numero e un messaggio descrittivo a `SecondActivity`.

### `SecondActivity`
- Riceve il numero estratto.
- Mostra il numero e l’immagine del dado corrispondente.
- Dopo 5 secondi:
  - Se **pari**, apre `ThirdActivity`.
  - Se **dispari**, apre `FourthActivity`.

### `ThirdActivity`
- Mostra un messaggio di **vittoria** (per numeri pari).
- Mostra anche un `Toast`: "Hai vinto!".

### `FourthActivity`
- Mostra un messaggio di **sconfitta** (per numeri dispari).
- Mostra anche un `Toast`: "Riprova!".

---

## Funzionalità future implementabili

-  **Pulsante “Riprova”** in `ThirdActivity` e `FourthActivity` per tornare a `MainActivity`.
-  **Animazione del dado** durante il lancio per un'esperienza più dinamica.
-  **Contatore di vittorie/sconfitte** salvato tra i lanci.
-  **Effetti sonori** per il lancio, vittoria e sconfitta..

---
