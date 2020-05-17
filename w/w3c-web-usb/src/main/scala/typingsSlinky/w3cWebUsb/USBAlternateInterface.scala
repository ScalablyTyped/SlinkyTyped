package typingsSlinky.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait USBAlternateInterface extends js.Object {
  val alternateSetting: Double = js.native
  val endpoints: js.Array[USBEndpoint] = js.native
  val interfaceClass: Double = js.native
  val interfaceName: js.UndefOr[String] = js.native
  val interfaceProtocol: Double = js.native
  val interfaceSubclass: Double = js.native
}

object USBAlternateInterface {
  @scala.inline
  def apply(
    alternateSetting: Double,
    endpoints: js.Array[USBEndpoint],
    interfaceClass: Double,
    interfaceProtocol: Double,
    interfaceSubclass: Double
  ): USBAlternateInterface = {
    val __obj = js.Dynamic.literal(alternateSetting = alternateSetting.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], interfaceClass = interfaceClass.asInstanceOf[js.Any], interfaceProtocol = interfaceProtocol.asInstanceOf[js.Any], interfaceSubclass = interfaceSubclass.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBAlternateInterface]
  }
  @scala.inline
  implicit class USBAlternateInterfaceOps[Self <: USBAlternateInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternateSetting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpoints(value: js.Array[USBEndpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceClass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceProtocol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceSubclass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceSubclass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceName")(js.undefined)
        ret
    }
  }
  
}

