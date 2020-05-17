package typingsSlinky.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that launches a background task to enable device manufacturer operations. */
@js.native
trait DeviceManufacturerNotificationTrigger extends js.Object {
  /** Gets whether the trigger is used only once. */
  var oneShot: Boolean = js.native
  /** Gets an app-defined string that qualifies the trigger. */
  var triggerQualifier: String = js.native
}

object DeviceManufacturerNotificationTrigger {
  @scala.inline
  def apply(oneShot: Boolean, triggerQualifier: String): DeviceManufacturerNotificationTrigger = {
    val __obj = js.Dynamic.literal(oneShot = oneShot.asInstanceOf[js.Any], triggerQualifier = triggerQualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceManufacturerNotificationTrigger]
  }
  @scala.inline
  implicit class DeviceManufacturerNotificationTriggerOps[Self <: DeviceManufacturerNotificationTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOneShot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneShot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerQualifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerQualifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

