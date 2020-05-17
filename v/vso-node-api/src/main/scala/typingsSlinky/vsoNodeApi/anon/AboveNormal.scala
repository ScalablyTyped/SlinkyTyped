package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AboveNormal extends js.Object {
  var aboveNormal: scala.Double = js.native
  var belowNormal: scala.Double = js.native
  var high: scala.Double = js.native
  var low: scala.Double = js.native
  var normal: scala.Double = js.native
}

object AboveNormal {
  @scala.inline
  def apply(
    aboveNormal: scala.Double,
    belowNormal: scala.Double,
    high: scala.Double,
    low: scala.Double,
    normal: scala.Double
  ): AboveNormal = {
    val __obj = js.Dynamic.literal(aboveNormal = aboveNormal.asInstanceOf[js.Any], belowNormal = belowNormal.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AboveNormal]
  }
  @scala.inline
  implicit class AboveNormalOps[Self <: AboveNormal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAboveNormal(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aboveNormal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBelowNormal(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("belowNormal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHigh(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLow(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormal(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

