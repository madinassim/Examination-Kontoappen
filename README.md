

1. Datasäkerhet: Jag använder private för kontots uppgifter i Acount.
Det betyder att andra klasser inte kan ändra uppgifterna direkt.
Istället använder jag metoder som deposite och withdraw för att
ändra saldot. Det gör koden säkrare och mer kontrollerad.


2. Skapande mönster: Jag använder metoden createAccount 
i AccounttRegister för att skapa nya konton. Då behöver Main inte skapa 
konton direkt, utan kan fokusera på menyn och användarens val.
Det gör koden enklare att förstå och organisera.


3. Flöde: När användaren väljer alternativ 3 i main.java får personen 
skriva kontots ägare och beloppet som ska sättas in. Main använder
findAccount i AccountRegister för att hitta kontot.
Om kontot finns anropas deposita i Account.java. då läggs pengarna till
saldot. Till ex blir 1000 kr till 1500 kr om man sätter in 500 kr.


4. Reflektion: När jag arbetade med min Kontoapp tyckte jag ibland att det 
var svårt att veta var jag skulle placera koden och vilka metoder jag 
skulle använda. När jag körde fast använde jag AI för att få förklaringar
steg för steg, till exempel för att förstå hur jag skulle använda metoderna
deposit och withdraw. Sedan försökte jag skriva och testa koden själv i 
IntelliJ. Genom att testa programmet och rätta mina misstag lärde jag mig
mer om hur Java fungerar.