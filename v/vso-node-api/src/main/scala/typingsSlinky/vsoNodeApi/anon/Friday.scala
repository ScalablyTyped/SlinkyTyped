package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Friday extends js.Object {
  var all: scala.Double = js.native
  var friday: scala.Double = js.native
  var monday: scala.Double = js.native
  var none: scala.Double = js.native
  var saturday: scala.Double = js.native
  var sunday: scala.Double = js.native
  var thursday: scala.Double = js.native
  var tuesday: scala.Double = js.native
  var wednesday: scala.Double = js.native
}

object Friday {
  @scala.inline
  def apply(
    all: scala.Double,
    friday: scala.Double,
    monday: scala.Double,
    none: scala.Double,
    saturday: scala.Double,
    sunday: scala.Double,
    thursday: scala.Double,
    tuesday: scala.Double,
    wednesday: scala.Double
  ): Friday = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], friday = friday.asInstanceOf[js.Any], monday = monday.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], saturday = saturday.asInstanceOf[js.Any], sunday = sunday.asInstanceOf[js.Any], thursday = thursday.asInstanceOf[js.Any], tuesday = tuesday.asInstanceOf[js.Any], wednesday = wednesday.asInstanceOf[js.Any])
    __obj.asInstanceOf[Friday]
  }
  @scala.inline
  implicit class FridayOps[Self <: Friday] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriday(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonday(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaturday(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSunday(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sunday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThursday(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thursday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTuesday(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tuesday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWednesday(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wednesday")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

