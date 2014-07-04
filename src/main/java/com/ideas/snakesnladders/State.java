package com.ideas.snakesnladders;

/**
 * 
 * State Interface for the various states of the {@link GameEngine}
 * 
 */
public interface State {
	/**
	 * Default run method of the state.
	 * 
	 * @param context
	 *            - the context of the State i.e. {@link GameEngine}
	 */
	public void run(GameEngine context);

}
