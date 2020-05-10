package typingsSlinky.workboxWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxRetentionTime extends js.Object {
  var maxRetentionTime: Double = js.native
}

object AnonMaxRetentionTime {
  @scala.inline
  def apply(maxRetentionTime: Double): AnonMaxRetentionTime = {
    val __obj = js.Dynamic.literal(maxRetentionTime = maxRetentionTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxRetentionTime]
  }
  @scala.inline
  implicit class AnonMaxRetentionTimeOps[Self <: AnonMaxRetentionTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxRetentionTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetentionTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

