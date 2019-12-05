package typingsSlinky.w3cDashGenericDashSensor

import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SensorErrorEvent")
@js.native
class SensorErrorEvent protected () extends Event {
  def this(`type`: String, errorEventInitDict: SensorErrorEventInit) = this()
  val error: js.Error = js.native
}

