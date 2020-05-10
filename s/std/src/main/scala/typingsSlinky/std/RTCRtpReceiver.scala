package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebRTC API interface manages the reception and decoding of data for a MediaStreamTrack on an RTCPeerConnection. */
@js.native
trait RTCRtpReceiver extends js.Object {
  val rtcpTransport: RTCDtlsTransport | Null = js.native
  val track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack = js.native
  val transport: RTCDtlsTransport | Null = js.native
  def getContributingSources(): js.Array[RTCRtpContributingSource] = js.native
  def getParameters(): RTCRtpReceiveParameters = js.native
  def getStats(): js.Promise[org.scalajs.dom.experimental.webrtc.RTCStatsReport] = js.native
  def getSynchronizationSources(): js.Array[RTCRtpSynchronizationSource] = js.native
}

@JSGlobal("RTCRtpReceiver")
@js.native
object RTCRtpReceiver extends Instantiable0[RTCRtpReceiver] {
  def getCapabilities(kind: java.lang.String): RTCRtpCapabilities | Null = js.native
}

