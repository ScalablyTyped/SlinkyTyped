package typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a simple Boolean control on a HID device that returns on/off values. An example would be the LED light on a keyboard. */
@js.native
trait HidBooleanControl extends js.Object {
  /** Retrieves a description of the given Boolean control. */
  var controlDescription: HidBooleanControlDescription = js.native
  /** Retrieves the identifier for a given Boolean control. */
  var id: Double = js.native
  /** Retrieves a Boolean value indicating whether the given Boolean control is active. */
  var isActive: Boolean = js.native
  /** Retrieves the usage identifier associated with the given Boolean control. */
  var usageId: Double = js.native
  /** Retrieves the usage page for a given Boolean control. */
  var usagePage: Double = js.native
}

object HidBooleanControl {
  @scala.inline
  def apply(
    controlDescription: HidBooleanControlDescription,
    id: Double,
    isActive: Boolean,
    usageId: Double,
    usagePage: Double
  ): HidBooleanControl = {
    val __obj = js.Dynamic.literal(controlDescription = controlDescription.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], usageId = usageId.asInstanceOf[js.Any], usagePage = usagePage.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidBooleanControl]
  }
  @scala.inline
  implicit class HidBooleanControlOps[Self <: HidBooleanControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlDescription(value: HidBooleanControlDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsageId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsagePage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usagePage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

