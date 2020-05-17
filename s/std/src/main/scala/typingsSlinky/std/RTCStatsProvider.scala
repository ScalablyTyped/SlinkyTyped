package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCStatsProvider extends EventTarget {
  def getStats(): js.Promise[org.scalajs.dom.experimental.webrtc.RTCStatsReport] = js.native
  def msGetStats(): js.Promise[org.scalajs.dom.experimental.webrtc.RTCStatsReport] = js.native
}

