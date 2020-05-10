package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFriday extends js.Object {
  var all: Double = js.native
  var friday: Double = js.native
  var monday: Double = js.native
  var none: Double = js.native
  var saturday: Double = js.native
  var sunday: Double = js.native
  var thursday: Double = js.native
  var tuesday: Double = js.native
  var wednesday: Double = js.native
}

object AnonFriday {
  @scala.inline
  def apply(
    all: Double,
    friday: Double,
    monday: Double,
    none: Double,
    saturday: Double,
    sunday: Double,
    thursday: Double,
    tuesday: Double,
    wednesday: Double
  ): AnonFriday = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], friday = friday.asInstanceOf[js.Any], monday = monday.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], saturday = saturday.asInstanceOf[js.Any], sunday = sunday.asInstanceOf[js.Any], thursday = thursday.asInstanceOf[js.Any], tuesday = tuesday.asInstanceOf[js.Any], wednesday = wednesday.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFriday]
  }
  @scala.inline
  implicit class AnonFridayOps[Self <: AnonFriday] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
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

