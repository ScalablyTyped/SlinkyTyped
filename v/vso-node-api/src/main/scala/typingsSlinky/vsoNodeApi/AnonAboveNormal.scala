package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAboveNormal extends js.Object {
  var aboveNormal: Double = js.native
  var belowNormal: Double = js.native
  var high: Double = js.native
  var low: Double = js.native
  var normal: Double = js.native
}

object AnonAboveNormal {
  @scala.inline
  def apply(aboveNormal: Double, belowNormal: Double, high: Double, low: Double, normal: Double): AnonAboveNormal = {
    val __obj = js.Dynamic.literal(aboveNormal = aboveNormal.asInstanceOf[js.Any], belowNormal = belowNormal.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAboveNormal]
  }
  @scala.inline
  implicit class AnonAboveNormalOps[Self <: AnonAboveNormal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAboveNormal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aboveNormal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBelowNormal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("belowNormal")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withNormal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

