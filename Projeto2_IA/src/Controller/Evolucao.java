/*Laço maior*/
package Controller;

import Model.Avaliacao;
import Model.Geracao;
import Model.Robo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class Evolucao {
    private ArrayList<Robo> melhorRoboDeCadaGeracao;
    private ArrayList<Integer> melhorFitnessDeCadaGeracao;
    private ArrayList<Float> mediaDeFitnessDeCadaGercao;
    private static final int tamanhoPopulacao = 100;
    private static final int quantidadeGeracoes = 100;
    private static final int quantidadeMaximaPassos = 100;
    private static final float taxaMutacao = 1/17;
    private static final float tamanhoMaximoCromossomo = 100;
    
    //private ArrayList<Geracao> geracoes;
    
    public Evolucao(){
       // geracoes = new ArrayList<Geracao>();
    }
    /*Loop q cria a geracao inicial e retorna ela*/
    public Geracao criaPopulacaoInicial(){ //cria sem fitness e com os valores do cromossomos todos iguais
        Geracao geracaoInicial = new Geracao(0);
        for(int i=0; i< tamanhoPopulacao;i++){
            Robo robo = new Robo();
            robo.setGeracao(0);
            
            for(int j=0; j<tamanhoMaximoCromossomo;j++){
                robo.setPosicaoSequenciaPassos(j, "VE");
            }
            geracaoInicial.adicionaRoboGeracao(robo);
        }
        return geracaoInicial;
    }
    
    public void atualizaFitnessPopulacao(Geracao geracao){
        ArrayList individuos = geracao.getArrayIndividuos();
        Avaliacao avaliacao = new Avaliacao();
        Iterator it = individuos.iterator();
        while(it.hasNext()){
            Robo r = (Robo)it.next();
            avaliacao.calculaFitness(r); // esse calcula fitness ja insere no robo
        }
        
    }
    
    public void criaOutrasGeracoes(Geracao geracaoAnterior){//essa geracao tem q ter o fitness ja
        //sorteia os pais
        //faz o cruzamento
        //gera um filho
        //faz mutacao
        
        
        
        
    }
    
    public Robo[] sorteiaPais(Geracao geracaoAnterior){
        ArrayList<Robo> individuosGeracao = geracaoAnterior.getArrayIndividuos();
        return null;
    }
    
    
    
    public void avaliacao(){//avalia geracao atual para atualizar o fitness
        
    }
   
    
                                    /*Essa parte que vai gerar uma nova populacao*/
    public void selecao(){
        //faz cruzamento entre os pais
        
        //Seleciona progenitores atraves da proporção 75% melhor fitness, 15% aleatório e 10% pior fitness
        // Para a reproducão será selecionado dois pais aleatorios e feito o cross over gerando 2 individuos
        //Para selecionar sobreviventes 
    }
    
    public void variacao(){
        
    }
    
    
    /*qtdalelosmodificados defini a quantidade de posicoes do vetor q devem ser modificadas*/
    public void sorteiaMutacaoNoCromossomo(int qtdAlelosModificados, Robo robo){
        Robo robo1= robo;
        for(int i=0; i<qtdAlelosModificados; i++){
            int posicaoMut = sorteiaPosicaoCromossomo(robo1.getTamanhoCromossomo());
            String valorMut = sorteiaValorMutacao();
            robo1.setPosicaoSequenciaPassos(posicaoMut, valorMut);
        }
        /*Possiveis mutações do cromossomo
            4 possibilidades 
            SF
            VD
            VE
            VT
        */
    }
    
    private int sorteiaPosicaoCromossomo(int tamanhoCromossomo){
        Random random= new Random();
        return random.nextInt(tamanhoCromossomo);
    }
    
    private String sorteiaValorMutacao(){
        Random random = new Random();
        int retorno = random.nextInt(4);
        switch(retorno){
                case 0:
                    return "SF";
                case 1:
                    return "VD";
                case 2: 
                    return "VE";
                case 3:
                    return "VT";
                default:
                    return null;
        }
        
         /*Possiveis mutações do cromossomo
            4 possibilidades 
            SF
            VD
            VE
            VT
        */
    }
    
    
    
  
    
   
    
    /*Gera de forma aleatoria geracao de individuos, temq  criar parametros nos individuos*/
   /* public void criaPopulacaoInicial(int tamanhoPop){
        Populacao popIni = new Populacao();
        popIni.setQtdIndividuos(tamanhoPop);
        geracoes.add(popIni);
        
        /*cria individuos e executa e adiciona a geração*/
        
        /*Envia para geracao cada individuo inicial*/
       /* depois adiciona essa geração ao arraylist geracoes*/
       
  /*  }
    
    public void adicionaGeracao(Populacao geracao){
        geracoes.add(geracao); //metodo vai ser chamado por reproducao
    }
    
    
    
    
    public void criterioParada(){
         
    }
    
  
    
    */
}
