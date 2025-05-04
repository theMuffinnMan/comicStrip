// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a 13DTC assignment.
// You may not distribute it in any other way without permission.

/* Code for 13DTC
 * Name: Fleur
 * Username:
 * ID:
 */

import ecs100.*;

/** Program to create simple animated cartoon strips using the
 *  CartoonCharacter class.  
 */

public class CartoonStrip{

    /** tellStory creates two cartoon characters on the window.
     *  Then animates them according to a fixed script by calling a series
     *  of methods on the characters.
     */
    public void tellStory(){
        /*# YOUR CODE HERE */
        CartoonCharacter bob = new CartoonCharacter(50, 100, "bob");
        CartoonCharacter alice = new CartoonCharacter(300, 100, "alice");
        
        // frame one
        alice.lookLeft();
        alice.speak("Hi Bob");
        bob.frown();
        bob.think("Not this bitch again");
        
        //frame 2
        bob.speak("Alice I fucking hate your guts!");
        alice.frown();
        alice.think("Damn i just said hi...");
        
        // frame 3
        bob.walk(150.0);
        bob.speak("Im sick of your bullshit alice!\nGTF away from me!");
        
        //frame 4
        alice.lookRight();
        alice.speak("Ok bob");
        
        // frame 5
        alice.think("Fucking psycho...");
        alice.walk(1000);
        
        //frame 6
        bob.smile();
        bob.think("Thank fuck shes gone");
        
        // frame 7
        bob.frown();
        bob.speak("Oh right I'm incredibly lonely");
        
    }

    /** threeDancers creates three cartoon characters on the window.
     *  Then makes each character do the same little dance in turn,
     *  by calling the dance method.
     */
    public void threeDancers(){
        /*# YOUR CODE HERE */
        //create the characters
        CartoonCharacter bob = new CartoonCharacter(50, 100, "bob");
        CartoonCharacter alice = new CartoonCharacter(150, 100, "alice");
        CartoonCharacter casey = new CartoonCharacter(250, 100, "casey");
        
        // dance moves grouped together
        casey.walk(50);
        alice.walk(50);
        bob.walk(50);
        
        bob.lookLeft();
        alice.lookLeft();
        casey.lookLeft();
        
        bob.walk(50);
        alice.walk(50);
        casey.walk(50);
        
        // bobs turn
        bob.lookRight();
        bob.lookLeft();
        bob.lookRight();
        bob.lookLeft();
        bob.walk(10);
        bob.lookRight();
        bob.walk(10);
        bob.lookLeft();
        
        // alice turn
        alice.lookRight();
        alice.lookLeft();
        alice.lookRight();
        alice.lookLeft();
        alice.walk(10);
        alice.lookRight();
        alice.walk(10);
        alice.lookLeft();
        
        // casey turn
        casey.lookRight();
        casey.lookLeft();
        casey.lookRight();
        casey.lookLeft();
        casey.walk(10);
        casey.lookRight();
        casey.walk(10);
        casey.lookLeft();
    }

    /** Makes a character do a little dance.
     * Has one parameter - a CartoonCharacter object
     */
    public void dance(CartoonCharacter face){
        /*# YOUR CODE HERE */
    }

}

