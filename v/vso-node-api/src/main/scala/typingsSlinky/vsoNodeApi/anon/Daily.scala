package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Daily extends js.Object {
  var daily: scala.Double = js.native
}

object Daily {
  @scala.inline
  def apply(daily: scala.Double): Daily = {
    val __obj = js.Dynamic.literal(daily = daily.asInstanceOf[js.Any])
    __obj.asInstanceOf[Daily]
  }
  @scala.inline
  implicit class DailyOps[Self <: Daily] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaily(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daily")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

