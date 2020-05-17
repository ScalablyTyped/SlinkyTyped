package typingsSlinky.stellarBase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxTime extends js.Object {
  var maxTime: String = js.native
  var minTime: String = js.native
}

object MaxTime {
  @scala.inline
  def apply(maxTime: String, minTime: String): MaxTime = {
    val __obj = js.Dynamic.literal(maxTime = maxTime.asInstanceOf[js.Any], minTime = minTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxTime]
  }
  @scala.inline
  implicit class MaxTimeOps[Self <: MaxTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

