package typingsSlinky.xtucLong.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait High extends js.Object {
  var high: Double = js.native
  var low: Double = js.native
  var unsigned: Boolean = js.native
}

object High {
  @scala.inline
  def apply(high: Double, low: Double, unsigned: Boolean): High = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], unsigned = unsigned.asInstanceOf[js.Any])
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
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsigned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsigned")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

