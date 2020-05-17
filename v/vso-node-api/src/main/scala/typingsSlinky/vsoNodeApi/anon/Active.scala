package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Active extends js.Object {
  var active: scala.Double = js.native
  var byDesign: scala.Double = js.native
  var closed: scala.Double = js.native
  var fixed: scala.Double = js.native
  var pending: scala.Double = js.native
  var unknown: scala.Double = js.native
  var wontFix: scala.Double = js.native
}

object Active {
  @scala.inline
  def apply(
    active: scala.Double,
    byDesign: scala.Double,
    closed: scala.Double,
    fixed: scala.Double,
    pending: scala.Double,
    unknown: scala.Double,
    wontFix: scala.Double
  ): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], byDesign = byDesign.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], wontFix = wontFix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  @scala.inline
  implicit class ActiveOps[Self <: Active] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByDesign(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byDesign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosed(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixed(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWontFix(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wontFix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

