package typingsSlinky.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait High extends js.Object {
  var High: Double = js.native
  var Low: Double = js.native
}

object High {
  @scala.inline
  def apply(High: Double, Low: Double): High = {
    val __obj = js.Dynamic.literal(High = High.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any])
    __obj.asInstanceOf[High]
  }
  @scala.inline
  implicit class HighOps[Self <: High] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHigh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("High")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Low")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

