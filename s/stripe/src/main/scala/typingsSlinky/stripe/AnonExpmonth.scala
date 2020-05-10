package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExpmonth extends js.Object {
  var exp_month: js.UndefOr[Double] = js.native
  var exp_year: js.UndefOr[Double] = js.native
}

object AnonExpmonth {
  @scala.inline
  def apply(): AnonExpmonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonExpmonth]
  }
  @scala.inline
  implicit class AnonExpmonthOps[Self <: AnonExpmonth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExp_month(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExp_month: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_month")(js.undefined)
        ret
    }
    @scala.inline
    def withExp_year(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExp_year: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_year")(js.undefined)
        ret
    }
  }
  
}

