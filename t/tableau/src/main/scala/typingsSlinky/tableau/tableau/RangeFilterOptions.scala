package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeFilterOptions extends js.Object {
  /** Maximum value for the range (inclusive). Optional. Leave blank if you want a >= filter. */
  var max: Double | js.Date
  /** Minimum value for the range (inclusive). Optional. Leave blank if you want a <= filter. */
  var min: Double | js.Date
  /** The null values to include */
  var nullOption: NullOption
}

object RangeFilterOptions {
  @scala.inline
  def apply(max: Double | js.Date, min: Double | js.Date, nullOption: NullOption): RangeFilterOptions = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], nullOption = nullOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeFilterOptions]
  }
}

