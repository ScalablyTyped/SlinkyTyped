package typingsSlinky.usePosition.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionOptions extends js.Object {
  /**
    * Setting this to true will ask the browser to get the position with the best accuracy possible.
    * Enabling this feature could consume a lot of battery in handled devices.
    *
    * @default false
    */
  var enableHighAccuracy: Boolean = js.native
  /**
    * The maximum cached position age.
    *
    * @default Infinity
    */
  var maximumAge: Double = js.native
  /**
    * The amount of time before the error callback is invoked, if 0 it will never invoke.
    *
    * @default 0
    */
  var timeout: Double = js.native
}

object PositionOptions {
  @scala.inline
  def apply(enableHighAccuracy: Boolean, maximumAge: Double, timeout: Double): PositionOptions = {
    val __obj = js.Dynamic.literal(enableHighAccuracy = enableHighAccuracy.asInstanceOf[js.Any], maximumAge = maximumAge.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionOptions]
  }
  @scala.inline
  implicit class PositionOptionsOps[Self <: PositionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableHighAccuracy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHighAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

