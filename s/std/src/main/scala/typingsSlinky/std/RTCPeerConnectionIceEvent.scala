package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Events that occurs in relation to ICE candidates with the target, usually an RTCPeerConnection. Only one event is of this type: icecandidate. */
@js.native
trait RTCPeerConnectionIceEvent extends Event {
  
  val candidate: org.scalajs.dom.experimental.webrtc.RTCIceCandidate | Null = js.native
  
  val url: java.lang.String | Null = js.native
}
