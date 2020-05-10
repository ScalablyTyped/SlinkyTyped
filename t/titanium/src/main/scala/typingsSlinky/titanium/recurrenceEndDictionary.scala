package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary containing either `endDate` or `occurrenceCount` property.
  */
@js.native
trait recurrenceEndDictionary extends js.Object {
  /**
  	 * End date of the recurrence end, or undefined if the recurrence end is count-based.
  	 */
  var endDate: js.UndefOr[js.Date] = js.native
  /**
  	 * Occurrence count of the recurrence end, or 0 if the recurrence end is date-based.
  	 */
  var occurrenceCount: js.UndefOr[Double] = js.native
}

object recurrenceEndDictionary {
  @scala.inline
  def apply(): recurrenceEndDictionary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[recurrenceEndDictionary]
  }
  @scala.inline
  implicit class recurrenceEndDictionaryOps[Self <: recurrenceEndDictionary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withOccurrenceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrenceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrenceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrenceCount")(js.undefined)
        ret
    }
  }
  
}

