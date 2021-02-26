package typingsSlinky.std.global

import org.scalajs.dom.experimental.webrtc.RTCConfiguration
import org.scalajs.dom.experimental.webrtc.RTCIceServer
import typingsSlinky.std.AlgorithmIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCPeerConnection")
@js.native
class RTCPeerConnection ()
  extends typingsSlinky.std.RTCPeerConnection {
  def this(configuration: RTCConfiguration) = this()
}
object RTCPeerConnection {
  
  @JSGlobal("RTCPeerConnection.generateCertificate")
  @js.native
  def generateCertificate(keygenAlgorithm: AlgorithmIdentifier): js.Promise[typingsSlinky.std.RTCCertificate] = js.native
  
  @JSGlobal("RTCPeerConnection.getDefaultIceServers")
  @js.native
  def getDefaultIceServers(): js.Array[RTCIceServer] = js.native
}
