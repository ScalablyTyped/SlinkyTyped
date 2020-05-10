package typingsSlinky.swaggerStats.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorsStats extends js.Object {
  var statuscode: Record[Double, Double] = js.native
  var topnotfound: Record[String, Double] = js.native
  var topservererror: Record[String, Double] = js.native
}

object ErrorsStats {
  @scala.inline
  def apply(
    statuscode: Record[Double, Double],
    topnotfound: Record[String, Double],
    topservererror: Record[String, Double]
  ): ErrorsStats = {
    val __obj = js.Dynamic.literal(statuscode = statuscode.asInstanceOf[js.Any], topnotfound = topnotfound.asInstanceOf[js.Any], topservererror = topservererror.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorsStats]
  }
  @scala.inline
  implicit class ErrorsStatsOps[Self <: ErrorsStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatuscode(value: Record[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuscode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopnotfound(value: Record[String, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topnotfound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopservererror(value: Record[String, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topservererror")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

