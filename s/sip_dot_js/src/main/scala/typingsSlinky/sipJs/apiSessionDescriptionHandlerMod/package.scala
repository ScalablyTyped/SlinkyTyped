package typingsSlinky.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object apiSessionDescriptionHandlerMod {
  
  type SessionDescriptionHandlerModifier = js.Function1[
    /* sessionDescription */ org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit, 
    js.Promise[org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit]
  ]
}
