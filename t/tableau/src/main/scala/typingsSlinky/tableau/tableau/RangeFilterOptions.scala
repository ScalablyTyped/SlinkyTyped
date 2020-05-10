package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeFilterOptions extends js.Object {
  /** Maximum value for the range (inclusive). Optional. Leave blank if you want a >= filter. */
  var max: Double | js.Date = js.native
  /** Minimum value for the range (inclusive). Optional. Leave blank if you want a <= filter. */
  var min: Double | js.Date = js.native
  /** The null values to include */
  var nullOption: NullOption = js.native
}

object RangeFilterOptions {
  @scala.inline
  def apply(max: Double | js.Date, min: Double | js.Date, nullOption: NullOption): RangeFilterOptions = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], nullOption = nullOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeFilterOptions]
  }
  @scala.inline
  implicit class RangeFilterOptionsOps[Self <: RangeFilterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNullOption(value: NullOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullOption")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

