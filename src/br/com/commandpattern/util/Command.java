package br.com.commandpattern.util;

/**
 * Todos objetos de comando devem implementar a mesma
 * interface.
 * 
 * 
 * Os comandos nos oferecem uma maneira de "empacotar" uma
 * sequencia de computacao e passa-las adiante como um
 * objeto de primeira classe. Quando isso e feito, a computacao
 * propriamente dita pode ser invocada muito tempo depois de o
 * aplicativo-cliente criar o objeto de comando. Essas
 * caracteristicas permite o seu emprego em muitas aplicacoes
 * uteis, como temporizadores, pools de processamento e filas
 * de tarefas.
 * 
 * Imagine uma fila de tarefas: voce acrescenta comandos a fila
 * em uma das extremidades e na outra ha um grupo de THREADS ou
 * sequencia de processamento que executam o seguinte script:
 * elas removem um comando, chamam seu metodo execute(), esperam
 * ate que a chamada termine e depois descartam o objeto de
 * comando e recuperam o proximo.
 * 
 * */
public interface Command {
	public void execute();
	public void undo();
}
