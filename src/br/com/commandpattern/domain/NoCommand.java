package br.com.commandpattern.domain;

import br.com.commandpattern.util.Command;

/**
 * A <code>NoCommand</code> e uma classe nula,
 * ondem ela nao contem nenhuma implementacao,
 * ela serve para retornar objetos, quando nao
 * há objetos significativos, mas quer retirar
 * do cliente a responsabilidade de lidar com
 * repostas null.
 * */
public class NoCommand implements Command {

	@Override
	public void execute() {}

	@Override
	public void undo() {}

}
