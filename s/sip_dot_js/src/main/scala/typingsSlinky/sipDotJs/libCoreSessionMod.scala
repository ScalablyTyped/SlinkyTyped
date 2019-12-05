package typingsSlinky.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/session", JSImport.Namespace)
@js.native
object libCoreSessionMod extends js.Object {
  @js.native
  object SessionState extends js.Object {
    /* "AckWait" */ val AckWait: typingsSlinky.sipDotJs.libCoreSessionSessionMod.SessionState.AckWait with String = js.native
    /* "Confirmed" */ val Confirmed: typingsSlinky.sipDotJs.libCoreSessionSessionMod.SessionState.Confirmed with String = js.native
    /* "Early" */ val Early: typingsSlinky.sipDotJs.libCoreSessionSessionMod.SessionState.Early with String = js.native
    /* "Initial" */ val Initial: typingsSlinky.sipDotJs.libCoreSessionSessionMod.SessionState.Initial with String = js.native
    /* "Terminated" */ val Terminated: typingsSlinky.sipDotJs.libCoreSessionSessionMod.SessionState.Terminated with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.sipDotJs.libCoreSessionSessionMod.SessionState with String] = js.native
  }
  
  @js.native
  object SignalingState extends js.Object {
    /* "Closed" */ val Closed: typingsSlinky.sipDotJs.libCoreSessionSessionMod.SignalingState.Closed with String = js.native
    /* "HaveLocalOffer" */ val HaveLocalOffer: typingsSlinky.sipDotJs.libCoreSessionSessionMod.SignalingState.HaveLocalOffer with String = js.native
    /* "HaveRemoteOffer" */ val HaveRemoteOffer: typingsSlinky.sipDotJs.libCoreSessionSessionMod.SignalingState.HaveRemoteOffer with String = js.native
    /* "Initial" */ val Initial: typingsSlinky.sipDotJs.libCoreSessionSessionMod.SignalingState.Initial with String = js.native
    /* "Stable" */ val Stable: typingsSlinky.sipDotJs.libCoreSessionSessionMod.SignalingState.Stable with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.sipDotJs.libCoreSessionSessionMod.SignalingState with String] = js.native
  }
  
}

