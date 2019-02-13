package RPG;


public class Characters {
   
    
    public Characters(){
        Dice d = new Dice();    
        Character wyndel = new Character("Wyndel", d.roll(), d.roll(), d.roll());
        Character sid = new Character("Sid", d.roll(), d.roll(), d.roll());
        
        for(int i = 1; i <= 3; i++){   
            System.out.println("ROUND " + i + "!");
            
            
            System.out.println(wyndel.getName() + ": " + wyndel.getCurrentLife());
            System.out.println(sid.getName() + ": " + sid.getCurrentLife());
            
            int jAttack = wyndel.attack(), mAttack = sid.attack();
            
           System.out.println(wyndel.getName() + " attacks " + sid.getName() + " for " + jAttack + "damage!");
           System.out.println(sid.getName() + " attacks " + wyndel.getName() + " for " + mAttack + "damage!");
            
            wyndel.wound(jAttack);
            sid.wound(mAttack);
         
           System.out.println(" ");
            if((wyndel.getCurrentLife() <= 0) && (sid.getCurrentLife() > 0)){
                
            System.out.print("\nFinal HP of " + wyndel.getName() + " is: " + wyndel.getCurrentLife() + "!");
            System.out.print("\nFinal HP of " + sid.getName() + " is: " + sid.getCurrentLife() + "!");
                System.out.println(" ");
                System.out.println(sid.getName() + " wins!" );
                break;
            }
            else if ((sid.getCurrentLife() <= 0) && (wyndel.getCurrentLife() > 0)){
                
            System.out.print("\nFinal HP of " + wyndel.getName() + " is: " + wyndel.getCurrentLife() + "!");
            System.out.print("\nFinal HP of " + sid.getName() + " is: " + sid.getCurrentLife() + "!");
            System.out.println(" ");
                System.out.println(wyndel.getName() + " wins!");
                break;
            }
            else if((wyndel.getCurrentLife()<=0) && (sid.getCurrentLife()<=0) ){
                System.out.print("\nFinal HP of " + wyndel.getName() + " is: " + wyndel.getCurrentLife() + "!");
                System.out.print("\nFinal HP of " + sid.getName() + " is: " + sid.getCurrentLife() + "!");
                System.out.println(" ");
                System.out.println("Draw!");
                break;
            }
        }
   }

    
    }
        
