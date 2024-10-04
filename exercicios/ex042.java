package exercicios;

import java.util.Scanner;

public class ex042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int CandidateNumber;
        char option;
        char option2;
        int totalVotes = 0;
        int totalVotesForCandidate1 = 0;
        int totalVotesForCandidate2 = 0;
        int totalVotesForCandidate3 = 0;
        int totalVotesForCandidate4 = 0;
        int totalVotesForCandidate5 = 0;
        int totalVotesForCandidate6 = 0;
        int totalVotesForCandidate7 = 0;
        int totalVotesForCandidate8 = 0;
        int totalVotesForCandidate9 = 0;

        System.out.println("\033[1;31m=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\033[1;33mCANDIDATOS PARA PREFEITO - RJ/2024");
        System.out.println("\033[1;35m= = = = = = = = = = = = = = = = = = =");
        System.out.println("\033[1;37m55 - Eduardo Paes ( PSD )");
        System.out.println("22 - Alexandre Ramagem ( PL )");
        System.out.println("30 - Carol Sponza ( Novo )");
        System.out.println("16 - Cyro Garcia ( PSTU )");
        System.out.println("29 - Henrique Simonard ( PCO )");
        System.out.println("80 - Juliete Pantoja ( UP )");
        System.out.println("11 - Marcelo Queiroz ( PP )");
        System.out.println("44 - Rodrigo Amorim ( União Brasil )");
        System.out.println("50 - Tarcísio Motta ( Psol )");
        System.out.println("\033[1;34m=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.print("\033[1;32mDeseja iniciar o sistema de votação? [s - sim / n - não] ");
        option = input.next().charAt(0);

        if (option == 's') {
            System.out.print("\033[1;31mDigite o número do candidato: ");
            CandidateNumber = input.nextInt();
            System.out.println("Deseja continuar o sistema? [s - sim / n - não] ");
            option2 = input.next().charAt(0);
            while (option2 == 's') {
                System.out.print("\033[1;31mDigite o número do candidato: ");
                CandidateNumber = input.nextInt();
                System.out.println("Deseja continuar o sistema? [s - sim / n - não] ");
                option2 = input.next().charAt(0);
                if (CandidateNumber == 55) {
                    totalVotesForCandidate1++;
                    totalVotes++;
                } else if (CandidateNumber == 22) {
                    totalVotesForCandidate2++;
                    totalVotes++;
                } else if (CandidateNumber == 30) {
                    totalVotesForCandidate3++;
                    totalVotes++;
                } else if (CandidateNumber == 16) {
                    totalVotesForCandidate4++;
                    totalVotes++;
                } else if (CandidateNumber == 29) {
                    totalVotesForCandidate5++;
                    totalVotes++;
                } else if (CandidateNumber == 80) {
                    totalVotesForCandidate6++;
                    totalVotes++;
                } else if (CandidateNumber == 11) {
                    totalVotesForCandidate7++;
                    totalVotes++;
                } else if (CandidateNumber == 44) {
                    totalVotesForCandidate8++;
                    totalVotes++;
                } else if (CandidateNumber == 50) {
                    totalVotesForCandidate9++;
                    totalVotes++;
                } else {
                    System.err.println("Número inválido!");
                }
                if (option2 == 'n') {
                    System.out.println("Finalizando...");
                    break;
                }
            }
        }else {
            System.out.println("\033[1;35mVolte sempre!");
        }
            System.out.println("\033[1;35mTotal de votos do Candidato 1: " + totalVotesForCandidate1);
            System.out.println("Total de votos do Candidato 2: " + totalVotesForCandidate2);
            System.out.println("Total de votos do Candidato 3: " + totalVotesForCandidate3);
            System.out.println("Total de votos do Candidato 4: " + totalVotesForCandidate4);
            System.out.println("Total de votos do Candidato 5: " + totalVotesForCandidate5);
            System.out.println("Total de votos do Candidato 6: " + totalVotesForCandidate6);
            System.out.println("Total de votos do Candidato 7: " + totalVotesForCandidate7);
            System.out.println("Total de votos do Candidato 8: " + totalVotesForCandidate8);
            System.out.println("Total de votos do Candidato 9: " + totalVotesForCandidate9);
            System.out.println("-----------------------------");
            System.out.println("Total de votos: " + totalVotes);
        }
    }
