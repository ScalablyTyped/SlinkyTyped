package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.experimental.webrtc.RTCConfiguration
import org.scalajs.dom.experimental.webrtc.RTCIceServer
import typingsSlinky.std.AlgorithmIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCPeerConnection")
@js.native
class RTCPeerConnection ()
  extends typingsSlinky.std.RTCPeerConnection {
  def this(configuration: RTCConfiguration) = this()
}

@JSGlobal("RTCPeerConnection")
@js.native
object RTCPeerConnection
  extends Instantiable0[org.scalajs.dom.experimental.webrtc.RTCPeerConnection]
     with Instantiable1[
      /* configuration */ RTCConfiguration, 
      org.scalajs.dom.experimental.webrtc.RTCPeerConnection
    ] {
  def generateCertificate(keygenAlgorithm: AlgorithmIdentifier): js.Promise[typingsSlinky.std.RTCCertificate] = js.native
  def getDefaultIceServers(): js.Array[RTCIceServer] = js.native
}

