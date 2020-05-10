package typingsSlinky.xtucLong

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHigh extends js.Object {
  var high: Double = js.native
  var low: Double = js.native
  var unsigned: Boolean = js.native
}

object AnonHigh {
  @scala.inline
  def apply(high: Double, low: Double, unsigned: Boolean): AnonHigh = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], unsigned = unsigned.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHigh]
  }
  @scala.inline
  implicit class AnonHighOps[Self <: AnonHigh] (val x: Self) extends AnyVal {
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

