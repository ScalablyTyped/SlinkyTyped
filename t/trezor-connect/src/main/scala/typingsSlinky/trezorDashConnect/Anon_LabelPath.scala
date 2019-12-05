package typingsSlinky.trezorDashConnect

import typingsSlinky.trezorDashConnect.trezorDashConnectMod.Device
import typingsSlinky.trezorDashConnect.trezorDashConnectStrings.unreadable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LabelPath extends Device {
  var label: String
  var path: String
  var `type`: unreadable
}

object Anon_LabelPath {
  @scala.inline
  def apply(label: String, path: String, `type`: unreadable): Anon_LabelPath = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LabelPath]
  }
}

