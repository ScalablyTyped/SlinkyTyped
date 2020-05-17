package typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a set of options that modifies a query for appointments. */
@js.native
trait FindAppointmentsOptions extends js.Object {
  var calendarIds: js.Any = js.native
   /* unmapped type */ var fetchProperties: js.Any = js.native
   /* unmapped type */ var includeHidden: js.Any = js.native
   /* unmapped type */ var maxCount: js.Any = js.native
}

object FindAppointmentsOptions {
  @scala.inline
  def apply(calendarIds: js.Any, fetchProperties: js.Any, includeHidden: js.Any, maxCount: js.Any): FindAppointmentsOptions = {
    val __obj = js.Dynamic.literal(calendarIds = calendarIds.asInstanceOf[js.Any], fetchProperties = fetchProperties.asInstanceOf[js.Any], includeHidden = includeHidden.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindAppointmentsOptions]
  }
  @scala.inline
  implicit class FindAppointmentsOptionsOps[Self <: FindAppointmentsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendarIds(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetchProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeHidden(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxCount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

