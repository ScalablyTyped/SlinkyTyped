package typingsSlinky.timelinejs3.TL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimelineEra extends js.Object {
  var end_date: ITimelineDate = js.native
  var start_date: ITimelineDate = js.native
  /*
    * Not required, but recommended.
    */
  var text: js.UndefOr[ITimelineText] = js.native
}

object ITimelineEra {
  @scala.inline
  def apply(end_date: ITimelineDate, start_date: ITimelineDate): ITimelineEra = {
    val __obj = js.Dynamic.literal(end_date = end_date.asInstanceOf[js.Any], start_date = start_date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineEra]
  }
  @scala.inline
  implicit class ITimelineEraOps[Self <: ITimelineEra] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd_date(value: ITimelineDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_date(value: ITimelineDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: ITimelineText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

