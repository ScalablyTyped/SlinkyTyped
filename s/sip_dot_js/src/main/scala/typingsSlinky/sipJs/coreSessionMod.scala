package typingsSlinky.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreSessionMod {
  
  @JSImport("sip.js/lib/core/session", "SessionState")
  @js.native
  object SessionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.sipJs.sessionSessionMod.SessionState with String] = js.native
    
    /* "AckWait" */ val AckWait: typingsSlinky.sipJs.sessionSessionMod.SessionState.AckWait with String = js.native
    
    /* "Confirmed" */ val Confirmed: typingsSlinky.sipJs.sessionSessionMod.SessionState.Confirmed with String = js.native
    
    /* "Early" */ val Early: typingsSlinky.sipJs.sessionSessionMod.SessionState.Early with String = js.native
    
    /* "Initial" */ val Initial: typingsSlinky.sipJs.sessionSessionMod.SessionState.Initial with String = js.native
    
    /* "Terminated" */ val Terminated: typingsSlinky.sipJs.sessionSessionMod.SessionState.Terminated with String = js.native
  }
  
  @JSImport("sip.js/lib/core/session", "SignalingState")
  @js.native
  object SignalingState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.sipJs.sessionSessionMod.SignalingState with String] = js.native
    
    /* "Closed" */ val Closed: typingsSlinky.sipJs.sessionSessionMod.SignalingState.Closed with String = js.native
    
    /* "HaveLocalOffer" */ val HaveLocalOffer: typingsSlinky.sipJs.sessionSessionMod.SignalingState.HaveLocalOffer with String = js.native
    
    /* "HaveRemoteOffer" */ val HaveRemoteOffer: typingsSlinky.sipJs.sessionSessionMod.SignalingState.HaveRemoteOffer with String = js.native
    
    /* "Initial" */ val Initial: typingsSlinky.sipJs.sessionSessionMod.SignalingState.Initial with String = js.native
    
    /* "Stable" */ val Stable: typingsSlinky.sipJs.sessionSessionMod.SignalingState.Stable with String = js.native
  }
}
