package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHourly extends js.Object {
  var daily: Double = js.native
  var hourly: Double = js.native
}

object AnonHourly {
  @scala.inline
  def apply(daily: Double, hourly: Double): AnonHourly = {
    val __obj = js.Dynamic.literal(daily = daily.asInstanceOf[js.Any], hourly = hourly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHourly]
  }
  @scala.inline
  implicit class AnonHourlyOps[Self <: AnonHourly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaily(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourly(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourly")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

