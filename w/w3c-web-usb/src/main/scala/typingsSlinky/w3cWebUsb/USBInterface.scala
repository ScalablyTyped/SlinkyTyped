package typingsSlinky.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait USBInterface extends js.Object {
  val alternate: USBAlternateInterface = js.native
  val alternates: js.Array[USBAlternateInterface] = js.native
  val claimed: Boolean = js.native
  val interfaceNumber: Double = js.native
}

object USBInterface {
  @scala.inline
  def apply(
    alternate: USBAlternateInterface,
    alternates: js.Array[USBAlternateInterface],
    claimed: Boolean,
    interfaceNumber: Double
  ): USBInterface = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], alternates = alternates.asInstanceOf[js.Any], claimed = claimed.asInstanceOf[js.Any], interfaceNumber = interfaceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBInterface]
  }
  @scala.inline
  implicit class USBInterfaceOps[Self <: USBInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternate(value: USBAlternateInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlternates(value: js.Array[USBAlternateInterface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClaimed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

