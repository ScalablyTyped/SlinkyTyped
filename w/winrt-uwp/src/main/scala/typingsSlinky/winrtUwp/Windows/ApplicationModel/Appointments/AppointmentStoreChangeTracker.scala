package typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides APIs for managing change tracking for appointments. */
@js.native
trait AppointmentStoreChangeTracker extends js.Object {
  var enable: js.Any = js.native
   /* unmapped type */ var getChangeReader: js.Any = js.native
   /* unmapped type */ var reset: js.Any = js.native
}

object AppointmentStoreChangeTracker {
  @scala.inline
  def apply(enable: js.Any, getChangeReader: js.Any, reset: js.Any): AppointmentStoreChangeTracker = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], getChangeReader = getChangeReader.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentStoreChangeTracker]
  }
  @scala.inline
  implicit class AppointmentStoreChangeTrackerOps[Self <: AppointmentStoreChangeTracker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetChangeReader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChangeReader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

