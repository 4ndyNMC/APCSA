//********************************************************************
//  Coin.java       Author: Lewis/Loftus/Cocking
//
//  Represents a coin with two sides that can be flipped.
//********************************************************************

import java.util.Random;

public class Coin implements Lockable
{
   private final int HEADS = 0;
   private final int TAILS = 1;
   private int keyValue;
   private boolean isLocked = false;

   private int face;

   //-----------------------------------------------------------------
   //  Sets up the coin by flipping it initially.
   //-----------------------------------------------------------------
   public Coin ()
   {
      flip();
   }

   //-----------------------------------------------------------------
   //  Flips the coin by randomly choosing a face value.
   //-----------------------------------------------------------------
   public void flip ()
   {
      if (!isLocked) {
         face = (int) (Math.random() * 2);
      }
   }

   //-----------------------------------------------------------------
   //  Returns true if the current face of the coin is heads.
   //-----------------------------------------------------------------
   public boolean isHeads ()
   {
      return (face == HEADS);
   }

   //-----------------------------------------------------------------
   //  Returns the current face of the coin as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String faceName;
      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";

      return faceName;
   }
   //
   //
   //
   public void setKey(int key)
   {
      keyValue = key;
   }
   
   public void lock(int key)
   {
      if (key == keyValue) isLocked = true;
   }
   
   public void unlock (int key)
   {
      if (key == keyValue) isLocked = false;
   }
   
   public boolean locked (Object key)
   {
      if (isLocked) return true;
      else return false;
   }

}
