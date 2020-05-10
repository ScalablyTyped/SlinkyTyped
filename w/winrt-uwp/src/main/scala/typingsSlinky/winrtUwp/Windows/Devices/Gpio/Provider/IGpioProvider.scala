package typingsSlinky.winrtUwp.Windows.Devices.Gpio.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents actions common to general-purpose I/O (GPIO) controller providers. */
@js.native
trait IGpioProvider extends js.Object {
  var getControllers: js.Any = js.native
}

object IGpioProvider {
  @scala.inline
  def apply(getControllers: js.Any): IGpioProvider = {
    val __obj = js.Dynamic.literal(getControllers = getControllers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGpioProvider]
  }
  @scala.inline
  implicit class IGpioProviderOps[Self <: IGpioProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetControllers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getControllers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

