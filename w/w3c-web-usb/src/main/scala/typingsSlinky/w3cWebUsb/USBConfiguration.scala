package typingsSlinky.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait USBConfiguration extends js.Object {
  val configurationName: js.UndefOr[String] = js.native
  val configurationValue: Double = js.native
  val interfaces: js.Array[USBInterface] = js.native
}

object USBConfiguration {
  @scala.inline
  def apply(configurationValue: Double, interfaces: js.Array[USBInterface]): USBConfiguration = {
    val __obj = js.Dynamic.literal(configurationValue = configurationValue.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBConfiguration]
  }
  @scala.inline
  implicit class USBConfigurationOps[Self <: USBConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaces(value: js.Array[USBInterface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationName")(js.undefined)
        ret
    }
  }
  
}

