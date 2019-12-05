package typingsSlinky.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libApiSessionDashDescriptionDashHandlerMod {
  import org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit

  type SessionDescriptionHandlerModifier = js.Function1[
    /* sessionDescription */ RTCSessionDescriptionInit, 
    js.Promise[RTCSessionDescriptionInit]
  ]
}
