package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/WrongPolicy.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/PortableServer/poa.idl
* Monday, June 27, 2011 2:16:32 AM PDT
*/

public final class WrongPolicy extends org.omg.CORBA.UserException
{

  public WrongPolicy ()
  {
    super(WrongPolicyHelper.id());
  } // ctor


  public WrongPolicy (String $reason)
  {
    super(WrongPolicyHelper.id() + "  " + $reason);
  } // ctor

} // class WrongPolicy
