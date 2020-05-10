package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMonday extends js.Object {
  var friday: Double = js.native
  var monday: Double = js.native
  var saturday: Double = js.native
  var sunday: Double = js.native
  var thursday: Double = js.native
  var tuesday: Double = js.native
  var wednesday: Double = js.native
}

object AnonMonday {
  @scala.inline
  def apply(
    friday: Double,
    monday: Double,
    saturday: Double,
    sunday: Double,
    thursday: Double,
    tuesday: Double,
    wednesday: Double
  ): AnonMonday = {
    val __obj = js.Dynamic.literal(friday = friday.asInstanceOf[js.Any], monday = monday.asInstanceOf[js.Any], saturday = saturday.asInstanceOf[js.Any], sunday = sunday.asInstanceOf[js.Any], thursday = thursday.asInstanceOf[js.Any], tuesday = tuesday.asInstanceOf[js.Any], wednesday = wednesday.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMonday]
  }
  @scala.inline
  implicit class AnonMondayOps[Self <: AnonMonday] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFriday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaturday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSunday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sunday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThursday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thursday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTuesday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tuesday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWednesday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wednesday")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

