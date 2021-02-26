package typingsSlinky.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportStateMod {
  
  @js.native
  sealed trait TransportState extends StObject
  @JSImport("sip.js/lib/api/transport-state", "TransportState")
  @js.native
  object TransportState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TransportState with String] = js.native
    
    /**
      * The `connect()` method resolved.
      */
    @js.native
    sealed trait Connected extends TransportState
    /* "Connected" */ val Connected: typingsSlinky.sipJs.transportStateMod.TransportState.Connected with String = js.native
    
    /**
      * The `connect()` method was called.
      */
    @js.native
    sealed trait Connecting extends TransportState
    /* "Connecting" */ val Connecting: typingsSlinky.sipJs.transportStateMod.TransportState.Connecting with String = js.native
    
    /**
      * The `connect()` method was rejected, or
      * the `disconnect()` method completed, or
      * network connectivity was lost.
      */
    @js.native
    sealed trait Disconnected extends TransportState
    /* "Disconnected" */ val Disconnected: typingsSlinky.sipJs.transportStateMod.TransportState.Disconnected with String = js.native
    
    /**
      * The `disconnect()` method was called.
      */
    @js.native
    sealed trait Disconnecting extends TransportState
    /* "Disconnecting" */ val Disconnecting: typingsSlinky.sipJs.transportStateMod.TransportState.Disconnecting with String = js.native
  }
}
