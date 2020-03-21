package typingsSlinky.w3cGenericSensor

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SensorErrorEvent")
@js.native
class SensorErrorEvent protected () extends Event_ {
  def this(`type`: String, errorEventInitDict: SensorErrorEventInit) = this()
  val error: js.Error = js.native
}

