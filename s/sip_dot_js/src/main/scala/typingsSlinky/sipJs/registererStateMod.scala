package typingsSlinky.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registererStateMod {
  
  @js.native
  sealed trait RegistererState extends StObject
  @JSImport("sip.js/lib/api/registerer-state", "RegistererState")
  @js.native
  object RegistererState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RegistererState with String] = js.native
    
    @js.native
    sealed trait Initial extends RegistererState
    /* "Initial" */ val Initial: typingsSlinky.sipJs.registererStateMod.RegistererState.Initial with String = js.native
    
    @js.native
    sealed trait Registered extends RegistererState
    /* "Registered" */ val Registered: typingsSlinky.sipJs.registererStateMod.RegistererState.Registered with String = js.native
    
    @js.native
    sealed trait Terminated extends RegistererState
    /* "Terminated" */ val Terminated: typingsSlinky.sipJs.registererStateMod.RegistererState.Terminated with String = js.native
    
    @js.native
    sealed trait Unregistered extends RegistererState
    /* "Unregistered" */ val Unregistered: typingsSlinky.sipJs.registererStateMod.RegistererState.Unregistered with String = js.native
  }
}
