package typingsSlinky.sipDotJs.sipDotJsMod.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.SignalingState")
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

