package typingsSlinky.w3cWebUsb

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBConnectionEvent")
@js.native
class USBConnectionEvent protected () extends Event_ {
  def this(`type`: String, eventInitDict: USBConnectionEventInit) = this()
  val device: USBDevice = js.native
}

