package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCStatsProvider extends EventTarget {
  def getStats(): js.Promise[org.scalajs.dom.experimental.webrtc.RTCStatsReport] = js.native
  def msGetStats(): js.Promise[org.scalajs.dom.experimental.webrtc.RTCStatsReport] = js.native
}

@JSGlobal("RTCStatsProvider")
@js.native
object RTCStatsProvider extends Instantiable0[RTCStatsProvider]

