package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeDateFilterOptions extends js.Object {
  /** The UTC date from which to filter. */
  var anchorDate: js.Date
  /** Year, quarter, month, etc. */
  var periodType: PeriodType
  /** The number used when the rangeType is LASTN or NEXTN. */
  var rangeN: Double
  /** LAST, LASTN, NEXT, etc. */
  var rangeType: DateRangeType
}

object RelativeDateFilterOptions {
  @scala.inline
  def apply(anchorDate: js.Date, periodType: PeriodType, rangeN: Double, rangeType: DateRangeType): RelativeDateFilterOptions = {
    val __obj = js.Dynamic.literal(anchorDate = anchorDate.asInstanceOf[js.Any], periodType = periodType.asInstanceOf[js.Any], rangeN = rangeN.asInstanceOf[js.Any], rangeType = rangeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeDateFilterOptions]
  }
}

