package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActive extends js.Object {
  var active: Double = js.native
  var byDesign: Double = js.native
  var closed: Double = js.native
  var fixed: Double = js.native
  var pending: Double = js.native
  var unknown: Double = js.native
  var wontFix: Double = js.native
}

object AnonActive {
  @scala.inline
  def apply(
    active: Double,
    byDesign: Double,
    closed: Double,
    fixed: Double,
    pending: Double,
    unknown: Double,
    wontFix: Double
  ): AnonActive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], byDesign = byDesign.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], wontFix = wontFix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActive]
  }
  @scala.inline
  implicit class AnonActiveOps[Self <: AnonActive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByDesign(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byDesign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWontFix(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wontFix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

