import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("===================================================");
        System.out.println("      Bem-vindo ao Quiz de Conhecimentos Gerais    ");
        System.out.println("===================================================");

        String fac = "UNIFAN";
        String nome = "Allysson Henrique Roque Pereira";
        String prof = "Brenno Pimenta da Costa";

        System.out.println("===================================================");
        System.out.println("Nome: " + nome);
        System.out.println("Faculdade: " + fac);
        System.out.println("Professor: " + prof);
        System.out.println("===================================================");

        System.out.println("===================================================");
        System.out.println("     Você está prestes a responder 15 questões.    ");
        System.out.println("         Boa sorte e aproveite o desafio!          ");
        System.out.println("===================================================");

        int acertos = 0;
        int totalQuestoes = 15;
//
        questao q1 = new questao();
        q1.pergunta = "1)Qual é o maior planeta do sistema solar?";
        q1.opcaoA = "A)Terra";
        q1.opcaoB = "B)Júpiter";
        q1.opcaoC = "C)Saturno";
        q1.opcaoD = "D)Netuno";
        q1.opcaoE = "E)Sol";
        q1.correta = "B";
        q1.escrevaQuestao();
        String resposta = q1.leiaResposta();
        if (q1.isCorreta(resposta)) {
         ++acertos;}
//
        questao q2 = new questao();
        q2.pergunta = "2)Quem foi o primeiro presidente dos Estados Unidos?";
        q2.opcaoA = "A)Thomas Jeferson";
        q2.opcaoB = "B)George Washington";
        q2.opcaoC = "C)Abraham Lincoln";
        q2.opcaoD = "D)John Adams";
        q2.opcaoE = "E)James Madison";
        q2.correta = "B";
        q2.escrevaQuestao();
        resposta = q2.leiaResposta();
        if (q2.isCorreta(resposta)) {
         ++acertos;}
//
        questao q3 = new questao();
        q3.pergunta = "3)Qual é o elemento químico com o símbolo 'Cu'?";
        q3.opcaoA = "A)Prata";
        q3.opcaoB = "B)Ouro";
        q3.opcaoC = "C)Alumínio";
        q3.opcaoD = "D)Cobre";
        q3.opcaoE = "E)Platina";
        q3.correta = "D";
        q3.escrevaQuestao();
        resposta = q3.leiaResposta();
        if (q3.isCorreta(resposta)) {
         ++acertos;}
//
        questao q4 = new questao();
        q4.pergunta = "4)Qual país é conhecido como a Terra do Sol Nascente?";
        q4.opcaoA = "A)Brasil";
        q4.opcaoB = "B)Japão";
        q4.opcaoC = "C)China";
        q4.opcaoD = "D)Rússia";
        q4.opcaoE = "E)Portugal";
        q4.correta = "B";
        q4.escrevaQuestao();
        resposta = q4.leiaResposta();
        if (q4.isCorreta(resposta)) {
         ++acertos;}
//
        questao q5 = new questao();
        q5.pergunta = "5)Qual é a capital da Austrália?";
        q5.opcaoA = "A)Sydney";
        q5.opcaoB = "B)Melbourne";
        q5.opcaoC = "C)Canberra";
        q5.opcaoD = "D)Brisbane";
        q5.opcaoE = "E)Perth";
        q5.correta = "C";
        q5.escrevaQuestao();
        resposta = q5.leiaResposta();
        if (q5.isCorreta(resposta)) {
         ++acertos;}
//
        questao q6 = new questao();
        q6.pergunta = "6)Qual é o elemento químico representado pela sigla 'O'";
        q6.opcaoA = "A)Oxigênio";
        q6.opcaoB = "B)Ouro";
        q6.opcaoC = "C)Ozônio";
        q6.opcaoD = "D)Oricalco";
        q6.opcaoE = "E)Hidrogênio";
        q6.correta = "A";
        q6.escrevaQuestao();
        resposta = q6.leiaResposta();
        if (q6.isCorreta(resposta)) {
         ++acertos;}
//
        questao q7 = new questao();
        q7.pergunta = "7)Quem escreveu 'Dom Quixote'?";
        q7.opcaoA = "A)William Shakespeare";
        q7.opcaoB = "B)Machado de Assis";
        q7.opcaoC = "C)Miguel de Cervantes";
        q7.opcaoD = "D)Gabriel García Márquez";
        q7.opcaoE = "E)José Saramago";
        q7.correta = "C";
        q7.escrevaQuestao();
        resposta = q7.leiaResposta();
        if (q7.isCorreta(resposta)) {
         ++acertos;}
//
        questao q8 = new questao();
        q8.pergunta = "8)Qual planeta é conhecido como o 'Planeta Vermelho'?";
        q8.opcaoA = "A)Júpiter";
        q8.opcaoB = "B)Marte";
        q8.opcaoC = "C)Vênus";
        q8.opcaoD = "D)Mercúrio";
        q8.opcaoE = "E)Saturno";
        q8.correta = "B";
        q8.escrevaQuestao();
        resposta = q8.leiaResposta();
        if (q8.isCorreta(resposta)) {
         ++acertos;}
//
        questao q9 = new questao();
        q9.pergunta = "9)Qual o maior oceano do mundo?";
        q9.opcaoA = "A)Atlântico";
        q9.opcaoB = "B)Índico";
        q9.opcaoC = "C)Pacífico";
        q9.opcaoD = "D)Ártico";
        q9.opcaoE = "E)Antártico";
        q9.correta = "C";
        q9.escrevaQuestao();
        resposta = q9.leiaResposta();
        if (q9.isCorreta(resposta)) {
         ++acertos;}
//
        questao q10 = new questao();
        q10.pergunta = "10)Qual é a língua mais falada no mundo?";
        q10.opcaoA = "A)Português";
        q10.opcaoB = "B)Inglês";
        q10.opcaoC = "C)Espanhol";
        q10.opcaoD = "D)Árabe";
        q10.opcaoE = "E)Mandarim";
        q10.correta = "E";
        q10.escrevaQuestao();
        resposta = q10.leiaResposta();
        if (q10.isCorreta(resposta)) {
         ++acertos;}
//
        questao q11 = new questao();
        q11.pergunta = "11)Qual o país mais populoso do mundo?";
        q11.opcaoA = "A)Rússia";
        q11.opcaoB = "B)Índia";
        q11.opcaoC = "C)Cuba";
        q11.opcaoD = "D)Indonésia";
        q11.opcaoE = "E)China";
        q11.correta = "E";
        q11.escrevaQuestao();
        resposta = q11.leiaResposta();
        if (q11.isCorreta(resposta)) {
         ++acertos;}
//
        questao q12 = new questao();
        q12.pergunta = "12)Quem é o autor da teoria da relatividade?";
        q12.opcaoA = "A)Isaac Newton";
        q12.opcaoB = "B)Galileo Galilei";
        q12.opcaoC = "C)Albert Einstein";
        q12.opcaoD = "D)Nikola Tesla";
        q12.opcaoE = "E)Stephen Hawking";
        q12.correta = "C";
        q12.escrevaQuestao();
        resposta = q12.leiaResposta();
        if (q12.isCorreta(resposta)) {
         ++acertos;}
//
        questao q13 = new questao();
        q13.pergunta = "13)Em que ano ocorreu a Revolução Francesa?";
        q13.opcaoA = "A)1492";
        q13.opcaoB = "B)1776";
        q13.opcaoC = "C)1789";
        q13.opcaoD = "D)1812";
        q13.opcaoE = "E)1848";
        q13.correta = "C";
        q13.escrevaQuestao();
        resposta = q13.leiaResposta();
        if (q13.isCorreta(resposta)) {
         ++acertos;}
//
        questao q14 = new questao();
        q14.pergunta = "14)Qual é a fórmula química da água?";
        q14.opcaoA = "A)H2SO4";
        q14.opcaoB = "B)CO2";
        q14.opcaoC = "C)H2O";
        q14.opcaoD = "D)NaCL";
        q14.opcaoE = "E)CH4";
        q14.correta = "C";
        q14.escrevaQuestao();
        resposta = q14.leiaResposta();
        if (q14.isCorreta(resposta)) {
         ++acertos;}
//
        questao q15 = new questao();
        q15.pergunta = "15)Em que continente está localizada a Argentina?";
        q15.opcaoA = "A)Europa";
        q15.opcaoB = "B)Ásia";
        q15.opcaoC = "C)América do Norte";
        q15.opcaoD = "D)Ásia";
        q15.opcaoE = "E)América do Sul";
        q15.correta = "E";
        q15.escrevaQuestao();
        resposta = q15.leiaResposta();
        if (q15.isCorreta(resposta)) {++acertos;
        }
//
        int erros = totalQuestoes - acertos;
        double porcentagemAcertos = (double)acertos / (double)totalQuestoes * 100.0;
        System.out.println("===================================================");
        System.out.println("        Parabéns você concluiu as perguntas!       ");
        System.out.println("Total de acertos:" + acertos);
        System.out.println("Total de erros:" + erros);
        System.out.println("Total de acertos em porcentagem:" + porcentagemAcertos);
        System.out.println("===================================================");
    }
}