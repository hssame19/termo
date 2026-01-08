public void main(String[] args) {

    boolean win = false;

    Scanner scanner = new Scanner(System.in);

    int attempts = 0;
    String answer = "STRING";
    String guess = "";

    System.out.println(".: Termo :. (6 letras)\n");

    do {
        ArrayList<Character> tbg = new ArrayList<Character>();

        for(int i = 0; i < answer.length(); i++) {
            tbg.add(answer.charAt(i));
        }

        try {
            guess = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("Digite uma palavra.\n");
        }

        guess = guess.toUpperCase();

        if(guess.length() != 6) {
            System.out.println("A palavra precisa ter 6 letras!\n");
            continue;
        }

        for(int i = 0; i < guess.length(); i++) {
            if(guess.charAt(i) == tbg.get(i)) {
                tbg.set(i, '/');
            }
        }

        for(int i = 0; i < guess.length(); i++) {
            if(answer.contains(guess.substring(i, i + 1))) {
                if(!tbg.contains(guess.charAt(i)) && guess.charAt(i) == answer.charAt(i)) {
                    System.out.print(guess.charAt(i));
                } else if(tbg.contains(guess.charAt(i)) && guess.charAt(i) != answer.charAt(i)) {
                    System.out.print("?");

                    for(int j = 0; j < tbg.size(); j++) {
                        if(tbg.get(j) == guess.charAt(i)) {
                            tbg.set(j, '/');
                            break;
                        }
                    }

                } else if(!tbg.contains(guess.charAt(i))) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
            }
        }

        attempts++;

        if(guess.equals(answer)) {
            win = true;
        }

        System.out.println("\n");

    } while(!win);

    if (attempts == 1) {
        System.out.println("De primeira!");
    } else if (attempts > 1 && attempts <= 3) {
        System.out.println("Impressionante!");
    } else if (attempts > 3) {
        System.out.println("Bom trabalho!");
    }

    System.out.print("A resposta era: " + answer);
}