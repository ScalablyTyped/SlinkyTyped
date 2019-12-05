package typingsSlinky.streamDashMeter

import typingsSlinky.node.streamMod.Transform
import typingsSlinky.streamDashMeter.streamDashMeterMod.StreamMeter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-meter", JSImport.Namespace)
@js.native
object streamDashMeterMod extends js.Object {
  @js.native
  class StreamMeter () extends Transform {
    def this(maxBytes: Double) = this()
    var bytes: Double = js.native
    var maxBytes: Double = js.native
  }
  
  def apply(): StreamMeter = js.native
  def apply(maxBytes: Double): StreamMeter = js.native
}

