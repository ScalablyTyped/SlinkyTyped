package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDaily extends js.Object {
  var daily: Double = js.native
}

object AnonDaily {
  @scala.inline
  def apply(daily: Double): AnonDaily = {
    val __obj = js.Dynamic.literal(daily = daily.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDaily]
  }
  @scala.inline
  implicit class AnonDailyOps[Self <: AnonDaily] (val x: Self) extends AnyVal {
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
  }
  
}

