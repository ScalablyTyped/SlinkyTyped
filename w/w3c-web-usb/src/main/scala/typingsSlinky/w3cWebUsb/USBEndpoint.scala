package typingsSlinky.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait USBEndpoint extends js.Object {
  val direction: USBDirection = js.native
  val endpointNumber: Double = js.native
  val packetSize: Double = js.native
  val `type`: USBEndpointType = js.native
}

object USBEndpoint {
  @scala.inline
  def apply(direction: USBDirection, endpointNumber: Double, packetSize: Double, `type`: USBEndpointType): USBEndpoint = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], endpointNumber = endpointNumber.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBEndpoint]
  }
  @scala.inline
  implicit class USBEndpointOps[Self <: USBEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: USBDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPacketSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: USBEndpointType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

