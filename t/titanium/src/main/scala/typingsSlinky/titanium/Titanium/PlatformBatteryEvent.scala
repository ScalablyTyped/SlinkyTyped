package typingsSlinky.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Fired when the battery state changes. This is measured in 5% increments on iPhone/iPad.
	 */
@js.native
trait PlatformBatteryEvent extends PlatformBaseEvent {
  /**
  		 * Percentage battery power level.
  		 */
  var level: Double = js.native
  /**
  		 * The battery state.
  		 */
  var state: Double = js.native
}

object PlatformBatteryEvent {
  @scala.inline
  def apply(level: Double, source: Platform, state: Double): PlatformBatteryEvent = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformBatteryEvent]
  }
  @scala.inline
  implicit class PlatformBatteryEventOps[Self <: PlatformBatteryEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

