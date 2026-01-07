public void main(String[] args) {

    ArrayList<Character> tbg = new ArrayList<Character>();
    ArrayList<Character> tbgComp = new ArrayList<Character>();

    boolean win = false;

    int attempts = 0;

    String answer = "STRING";

    Scanner scanner = new Scanner(System.in);

    System.out.println(".: Termo (6 letras) :.\nSe a letra estiver no lugar correto, ela aparecerá na palavra.\nSe a letra estiver na palavra mas no lugar errado, aparecerá uma interrogação.\nE se a letra não estiver na palavra, aparecerá um asterísco.\n");
    do {

        for (int i = 0; i < answer.length(); i++) {
            tbg.add(answer.charAt(i));
        }

        for (int i = 0; i < answer.length(); i++) {
            tbgComp.add(answer.charAt(i));
        }

        String guess = scanner.nextLine();
        guess = guess.toUpperCase();

        for (int i = 0; i < answer.length(); i++) {
            if (answer.contains(guess.substring(i, i + 1))) {
                if (tbg.contains(guess.charAt(i))) {
                    if (guess.charAt(i) == (tbgComp.get(i))) {
                        System.out.print(guess.charAt(i));

                        char temp = guess.charAt(i);

                        for (int j = 0; j < tbg.size(); j++) {
                            if (tbg.get(j).equals(temp)) {
                                tbg.remove(j);
                            }
                        }

                    } else {
                        System.out.print("?");
                    }
                } else {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
            }
        }
        System.out.println("\n");

        attempts++;

        if(guess.equals(answer)) {
            win = true;
        }
    } while(!win);

    if(attempts == 1) {
        System.out.println("De primeira!");
    } else if(attempts > 1 && attempts <= 3) {
        System.out.println("Impressionante!");
    } else if (attempts > 3) {
        System.out.println("Bom trabalho!");
    }
    System.out.print("A resposta era: " + answer);
}