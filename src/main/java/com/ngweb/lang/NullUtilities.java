package com.ngweb.lang;

public class NullUtilities
{
  public static void
  nullCheck
  (
    Object... args    
  )
  {
    for (Object arg : args)
    {
      if (arg == null)
      {
        throw new NullPointerException();
      }          
    }    
  }
}
