package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary containing `daysOfWeek` and `week`.
  */
@js.native
trait daysOfTheWeekDictionary extends js.Object {
  /**
  	 * The day of the week. Values are from 1 to 7, with Sunday being 1.
  	 */
  var daysOfWeek: js.UndefOr[Double] = js.native
  /**
  	 * The week number of the day of the week.
  	 * Values range from -53 to 53. A negative value indicates a value from the end of
  	 * the range. 0 indicates the week number is irrelevant.
  	 */
  var week: js.UndefOr[Double] = js.native
}

object daysOfTheWeekDictionary {
  @scala.inline
  def apply(): daysOfTheWeekDictionary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[daysOfTheWeekDictionary]
  }
  @scala.inline
  implicit class daysOfTheWeekDictionaryOps[Self <: daysOfTheWeekDictionary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaysOfWeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withWeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(js.undefined)
        ret
    }
  }
  
}

