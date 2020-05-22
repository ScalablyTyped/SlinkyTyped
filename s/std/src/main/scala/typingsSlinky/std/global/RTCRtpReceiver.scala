package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.std.RTCRtpCapabilities
import typingsSlinky.std.RTCRtpContributingSource
import typingsSlinky.std.RTCRtpReceiveParameters
import typingsSlinky.std.RTCRtpSynchronizationSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCRtpReceiver")
@js.native
class RTCRtpReceiver ()
  extends typingsSlinky.std.RTCRtpReceiver {
  /* CompleteClass */
  override val rtcpTransport: typingsSlinky.std.RTCDtlsTransport | Null = js.native
  /* CompleteClass */
  override val track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack = js.native
  /* CompleteClass */
  override val transport: typingsSlinky.std.RTCDtlsTransport | Null = js.native
  /* CompleteClass */
  override def getContributingSources(): js.Array[RTCRtpContributingSource] = js.native
  /* CompleteClass */
  override def getParameters(): RTCRtpReceiveParameters = js.native
  /* CompleteClass */
  override def getStats(): js.Promise[org.scalajs.dom.experimental.webrtc.RTCStatsReport] = js.native
  /* CompleteClass */
  override def getSynchronizationSources(): js.Array[RTCRtpSynchronizationSource] = js.native
}

@JSGlobal("RTCRtpReceiver")
@js.native
object RTCRtpReceiver
  extends Instantiable0[typingsSlinky.std.RTCRtpReceiver] {
  def getCapabilities(kind: java.lang.String): RTCRtpCapabilities | Null = js.native
}

