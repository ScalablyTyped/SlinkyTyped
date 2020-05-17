package typingsSlinky.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Available extends js.Object {
  var available: Double = js.native
  var blocked: js.UndefOr[Double] = js.native
  var debt: js.UndefOr[Double] = js.native
  var deposition_pending: js.UndefOr[Double] = js.native
  var hold: js.UndefOr[Double] = js.native
  var total: Double = js.native
}

object Available {
  @scala.inline
  def apply(available: Double, total: Double): Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
  @scala.inline
  implicit class AvailableOps[Self <: Available] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlocked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked")(js.undefined)
        ret
    }
    @scala.inline
    def withDebt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debt")(js.undefined)
        ret
    }
    @scala.inline
    def withDeposition_pending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deposition_pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeposition_pending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deposition_pending")(js.undefined)
        ret
    }
    @scala.inline
    def withHold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hold")(js.undefined)
        ret
    }
  }
  
}

