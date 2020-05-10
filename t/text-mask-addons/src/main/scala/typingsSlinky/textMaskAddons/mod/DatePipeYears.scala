package typingsSlinky.textMaskAddons.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePipeYears extends js.Object {
  var maxYear: Double = js.native
  var minYear: Double = js.native
}

object DatePipeYears {
  @scala.inline
  def apply(maxYear: Double, minYear: Double): DatePipeYears = {
    val __obj = js.Dynamic.literal(maxYear = maxYear.asInstanceOf[js.Any], minYear = minYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePipeYears]
  }
  @scala.inline
  implicit class DatePipeYearsOps[Self <: DatePipeYears] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minYear")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

